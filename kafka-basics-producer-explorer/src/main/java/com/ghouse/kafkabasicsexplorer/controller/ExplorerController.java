package com.ghouse.kafkabasicsexplorer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExplorerController {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/quotes/random")
    public String produceRandomQuoteEvent(){
        ResponseEntity<Object> quoteResponse
                = restTemplate.getForEntity("https://dummyjson.com/quotes/random", Object.class);
        Object quoteMessage= quoteResponse.getBody();
        kafkaTemplate.send("quotes-topic",quoteMessage.toString());
        return "quote-added";

    }
}
