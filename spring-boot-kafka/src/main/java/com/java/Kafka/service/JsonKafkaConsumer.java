package com.java.Kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.java.Kafka.payload.User;

@Service
public class JsonKafkaConsumer {
	
	Logger log=LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics="javaguides",groupId="myGroup")
	public void consume(User user) {
		log.info(String.format("json message recieved", user.toString()));
	}

}
