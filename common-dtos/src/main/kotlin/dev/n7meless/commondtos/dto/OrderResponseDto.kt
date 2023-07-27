package dev.n7meless.commondtos.dto

import dev.n7meless.commondtos.event.OrderStatus

data class OrderResponseDto(
    val userId: Int, val productId: Int, val amount: Int,
    val orderId: Int, val status: OrderStatus
) {
}