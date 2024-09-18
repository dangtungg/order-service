package com.example.order_service.order.event;

public record OrderDispatchedMessage(
        Long orderId
) {
}
