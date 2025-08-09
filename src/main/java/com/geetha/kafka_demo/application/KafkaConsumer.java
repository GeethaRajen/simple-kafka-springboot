package com.geetha.kafka_demo.application;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.group.id}")
    void listener(String message) {
        System.out.println("Message received by Listener : " + message);
    }
}