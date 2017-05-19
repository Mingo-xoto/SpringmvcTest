package com.yhq.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author HuaQi.Yang
 * @date 2017年5月18日
 */
public class EmitLogTopic {
	private static final String EXCHANGE_NAME = "topic_logs";

	public static void main(String[] argv) {
		Connection connection = null;
		Channel channel = null;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost("localhost");
			factory.setUsername("faker");
			factory.setPassword("faker110");
			connection = factory.newConnection();
			channel = connection.createChannel();

			channel.exchangeDeclare(EXCHANGE_NAME, "topic");

			String[] routingKeys = { "fast.orange.duck", "slow.orange.fish", "grey.rabbit", "fast.black.rabbit",
					"quick.white.rabbit", "lazy.dog", "lazy.black.pig" };
			String[] messages = { "Hello", "Guys", "Girls", "Babies" };

			for (int i = 0; i < routingKeys.length; i++) {
				for (int j = 0; j < messages.length; j++) {
					channel.basicPublish(EXCHANGE_NAME, routingKeys[i], null, messages[j].getBytes("UTF-8"));
					System.out.println(" [x] Sent '" + routingKeys[i] + "':'" + messages[j] + "'");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception ignore) {
				}
			}
		}
	}
}
