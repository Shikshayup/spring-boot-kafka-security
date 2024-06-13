package kafka_producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerTopic {

	@Bean
	public NewTopic createTopic() {
		return new NewTopic("customerEvent-topic1",3,(short)1);
	}
}
