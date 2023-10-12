package com.ghouse.kafkabasicsconsumerexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaBasicsConsumerExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaBasicsConsumerExplorerApplication.class, args);
		System.out.println("Running Kafka Basics Consumer Explorer App");
	}

}
