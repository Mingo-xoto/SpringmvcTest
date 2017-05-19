package com.yhq.mq;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.springframework.amqp.core.ExchangeTypes;

import com.rabbitmq.client.AMQP.BasicProperties.Builder;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

/**
 * @author HuaQi.Yang
 * @date 2017年5月17日
 */
public class Foo1 {
	public void listen(String foo) {
		System.out.println(foo);
	}

	private static final String EXCHANGE_NAME = "topic_logs";
	private final static String faker1 = "faker1";
	private final static String faker = "faker";
	private final static String fader = "fader";
	private final static String saber = "saber";

	static Channel channel = null;
	static Connection connection = null;
	static {
		config();
	}

	public static void main(final String... args) throws Exception {
		// channel.exchangeDeclare("shit", "direct");
		// channel.queueDelete(faker1);
		// channel.queueDelete(faker);
		// channel.queueDelete(fader);
		// channel.queueDelete(saber);
		//
		// // while (true) {
		// new Thread(() -> new Foo1().send("faker1",
		// Thread.currentThread().getName() + "1雕2娜3星4，faker1", "myExchange"))
		// .start();
		// Thread.sleep(500);
		// new Thread(() -> new Foo1().send("faker",
		// Thread.currentThread().getName() + "2雕3娜4星5，faker", "myExchange"))
		// .start();
		// Thread.sleep(500);
		// new Thread(() -> new Foo1().send("fader",
		// Thread.currentThread().getName() + "3雕4娜5星6，fader", "myExchange"))
		// .start();
		// Thread.sleep(500);
		// new Thread(() -> new Foo1().send("saber",
		// Thread.currentThread().getName() + "4雕5娜6星7，saber", "myExchange"))
		// .start();
		// Thread.sleep(500);
		//
		// // }
		// channel.close();
		// connection.close();
		// sendMsgToExchange();
//		sendMsgToExchange();
//		receiveMsgFromExchange();
	}

	public synchronized void send(String queue, String message, String exchange) {
		try {
			channel.queueDeclare(queue, true, false, false, null);
			channel.basicPublish("myExchange", queue, null, message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void config() {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("127.0.0.1");
		factory.setUsername("faker");
		factory.setPassword("faker110");
		factory.setPort(5672);
		try {
			connection = factory.newConnection();
			channel = connection.createChannel();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	public static void sendMsgToExchange() throws IOException {
		// 声明转发器和类型headers
		channel.exchangeDeclare(EXCHANGE_NAME, ExchangeTypes.HEADERS, false, true, null);
		String message = "消息1s22s";
		Map<String, Object> headers = new Hashtable<String, Object>();
		headers.put("aaa", "01234");
		headers.put("bbb", "56789");
		Builder properties = new Builder();
		properties.headers(headers);
		// 指定消息发送到的转发器,绑定键值对headers键值对
		channel.basicPublish(EXCHANGE_NAME, "", properties.build(), message.getBytes());
	}

	public static void receiveMsgFromExchange()
			throws IOException, ShutdownSignalException, ConsumerCancelledException, InterruptedException {
		final String QUEUE_NAME = "my-test-header-queue";
		// 声明转发器和类型headers
		channel.exchangeDeclare(EXCHANGE_NAME, ExchangeTypes.HEADERS, false, true, null);
		channel.queueDeclare(QUEUE_NAME, false, false, true, null);

		Map<String, Object> headers = new Hashtable<String, Object>();
		headers.put("x-match", "all");// all any
		headers.put("aaa", "01234");
		headers.put("bbb", "56789");
		// 为转发器指定队列，设置binding 绑定header键值对
		channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "", headers);
		QueueingConsumer consumer = new QueueingConsumer(channel);
		// 指定接收者，第二个参数为自动应答，无需手动应答
		channel.basicConsume(QUEUE_NAME, true, consumer);
		// while (true) {
		QueueingConsumer.Delivery delivery = consumer.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(message);
		// }
	}
}
