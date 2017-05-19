package com.yhq.mq;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

/**
 * @author HuaQi.Yang
 * @date 2017年5月18日
 */
public class ReceiveLogsTopic {
	private static final String EXCHANGE_NAME = "topic_logs";

	public static void main(String[] argv) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setUsername("faker");
		factory.setPassword("faker110");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.exchangeDeclare(EXCHANGE_NAME, "topic");
		String queueName = channel.queueDeclare().getQueue();

		String[] bindingKeys = { "*.orange.*", "*.*.rabbit", "lazy.#" };
		for (final String bindingKey : bindingKeys) {
			channel.queueBind(queueName, EXCHANGE_NAME, bindingKey);
			Consumer consumer = new DefaultConsumer(channel) {
				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
						byte[] body) throws IOException {
					String message = new String(body, "UTF-8");
					System.out.println("[" + bindingKey + "] Received message :'" + message + "' from routingKey : "
							+ envelope.getRoutingKey());
				}
			};
			channel.basicConsume(queueName, true, consumer);
		}

	}
}
