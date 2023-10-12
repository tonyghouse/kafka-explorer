package com.ghouse.kafkabasicsexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaBasicsExplorerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaBasicsExplorerApplication.class, args);
		System.out.println("Running Kafka Basics Producer Explorer App");
	}

}
