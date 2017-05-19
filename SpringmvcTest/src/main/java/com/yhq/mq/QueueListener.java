package com.yhq.mq;

import org.springframework.stereotype.Component;

/**
 * @author HuaQi.Yang
 * @date 2017年5月18日
 */
@Component
public class QueueListener {

	public void listen(Object body) {
		byte[] messages = (byte[]) body;
		System.out.println("listen.." + new String(messages));
	}
}
