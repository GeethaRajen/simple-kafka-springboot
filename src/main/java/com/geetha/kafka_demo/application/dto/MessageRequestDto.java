package com.geetha.kafka_demo.application.dto;

public record MessageRequestDto(String type, String action, String name, String price) {
}
