package com.ghouse.kafkabasicsconsumerexplorer.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = "quotes-topic", groupId = "quotes-group-id")
    public void getQuotesEvents(String value) {
        System.out.println(value);

    }
}
