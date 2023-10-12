package com.ghouse.kafkabasicsexplorer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic dummyTopic() {

        return TopicBuilder
                .name("quotes-topic")
                .build();


    }
}
