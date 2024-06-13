package kafka_consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import kafka_consumer.dao.Customer;

@Service
public class KafkaMessageListner {
    
	Logger log=LoggerFactory.getLogger(KafkaMessageListner.class);
	
	
	
	@KafkaListener(topics="customerEvent1-topic", groupId="customerEvent1-group")
	public void consume(Customer customer) {
		log.info("consumer consume events  "+customer.toString());
	}
	
//	@KafkaListener(topics="customer-topic", groupId="customer-group")
//	public void consume(String message) {
//		log.info("consumer consume message  "+message);
//	}
	
}
