package com.geetha.kafka_demo.application;

import com.geetha.kafka_demo.application.dto.MessageRequestDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investments/ideas")
public class KafkaProducerController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    public KafkaProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publishStockTips(@RequestBody MessageRequestDto dto) {
        String messageBuilder = dto.action() + " " +
                dto.type() + " " +
                dto.name() + " " +
                "at" + " " + dto.price();
        kafkaTemplate.send(topicName, messageBuilder);
    }
}
