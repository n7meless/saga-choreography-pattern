package dev.n7meless.commondtos.dto

data class OrderRequestDto(
    val userId: Int, val productId: Int,
    val amount: Int, val orderId: Int
) {}