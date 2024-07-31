package com.example.practice.Practice;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "my-topic")
    public void listen(String message) {
        System.out.println("Message received :" + message);
    }
}
