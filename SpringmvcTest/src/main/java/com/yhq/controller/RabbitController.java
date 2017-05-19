package com.yhq.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.MessagePropertiesConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.AMQP.BasicProperties.Builder;
import com.rabbitmq.client.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Envelope;
import com.yhq.mq.util.RabbitTemplateUtil;

/**
 * @author HuaQi.Yang
 * @date 2017年5月17日
 */
@RestController
@RequestMapping(value = "/rabbit/")
public class RabbitController {

	@Autowired
	RabbitTemplateUtil rabbitTemplateUtil;

	@RequestMapping("sendMsg")
	public void sendMsg(@RequestParam String exchange, @RequestParam(required = false) String routingKey) {
		publish(rabbitTemplateUtil.get(exchange), routingKey, exchange);
	}

	@RequestMapping("receiveMsg")
	public ModelMap receiveMsg(@RequestParam String exchange, @RequestParam(required = false) String queue) {
		ModelMap map = new ModelMap();
		RabbitTemplate template = rabbitTemplateUtil.get(exchange);
		if (queue == null) {
			Collection<String> queueNames = template.expectedQueueNames();
			if (queueNames == null) {
				return map;
			}
			for (String queueName : queueNames) {
				map.put(queueName, template.receive(queueName));
			}
		} else {
			map.put(queue, template.receive(queue));
		}
		return map;
	}

	private void publish(RabbitTemplate amqpTemplate, String routingKey, String exchange) {
		String body = routingKey + "Hello World!";
		// 指定消息发送到的转发器,绑定键值对headers键值对:头交换机
		MessageProperties messageProperties = new MessageProperties();
		messageProperties.setHeader("head1", "faker");
		messageProperties.setHeader("head2", "fader1");
		Message message = new Message(body.getBytes(), messageProperties);
		amqpTemplate.convertAndSend(exchange, routingKey, message);
	}
}
