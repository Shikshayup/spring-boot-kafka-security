package com.java.Kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Kafka.payload.User;
import com.java.Kafka.service.JsonKafkaProducer;

@RestController
@RequestMapping("api/v1/kafka")
public class JsonEventController {
    
	@Autowired
	private JsonKafkaProducer producer;
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		producer.sendEvent(user);
		return ResponseEntity.ok("json message to kafka topic");
		
	}
}
