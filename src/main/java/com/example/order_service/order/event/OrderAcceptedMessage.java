package com.example.order_service.order.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}
