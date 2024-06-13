package com.java.Kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.java.Kafka.payload.User;

@Service
public class JsonKafkaProducer {

	Logger log=LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	@Autowired
	private KafkaTemplate template;
	
	public void sendEvent(User data) {
		log.info(String.format("message send",data.toString()));

		Message<User> msg=MessageBuilder
				.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC,"javaguides")
				.build();
		template.send(msg);
		
	}
}
