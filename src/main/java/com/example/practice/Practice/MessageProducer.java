package com.example.practice.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
public class MessageProducer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;


    @GetMapping(value = "/send")
    public String sendMessagege (@RequestParam("message") String message){
        kafkaTemplate.send("my-topic",message);
        return "Message Sent : " + message;
    }

}
