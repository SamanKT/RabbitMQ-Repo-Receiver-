package com.rabbitmq.receiver.consume;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.receiver.message.MyMessage;

@Component
public class MyReceiver {


	
	@RabbitListener(queues = "${queue.name.one}")
	public void receiveQueue(MyMessage message) {
		
		System.out.println("the message is from and it is: "+message); 
		
		
	}
	
}
