package kafka_producer.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import kafka_producer.dao.Customer;

@Service
public class KafkaMessagePublisher {

	@Autowired
	private KafkaTemplate<String, Object> template;

//	public void sendMessageToTopic(String message) {
//		CompletableFuture<SendResult<String, Object>> future = template.send("customer-topic", message);
//		future.whenComplete((result, ex) -> {
//			// result.getRecordMetadata().partition();
//			if (ex == null) {
//				System.out.println("sent messages = [" + message + "] with offset = ["
//						+ result.getRecordMetadata().offset() + "]");
//			} else {
//				System.out.println("unable to send message=[" + message + "] due to : " + ex.getMessage());
//			}
//		});
//
//	}

	public void sendEventToTopic(Customer customer) {
		try {
			CompletableFuture<SendResult<String, Object>> future = template.send("customerEvent1-topic", customer);
			future.whenComplete((result, ex) -> {
				// result.getRecordMetadata().partition();
				if (ex == null) {
					System.out.println("sent messages = [" + customer.toString() + "] with offset = ["
							+ result.getRecordMetadata().offset() + "]");
				} else {
					System.out.println("unable to send message=[" + customer.toString() + "] due to : " + ex.getMessage());
				}
			});
		} catch (Exception ex) {
			System.out.println("ERROR " + ex.getMessage());
		}
	}

}
