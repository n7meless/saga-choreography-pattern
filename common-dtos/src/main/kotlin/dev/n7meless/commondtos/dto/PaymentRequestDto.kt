package dev.n7meless.commondtos.dto

data class PaymentRequestDto(
    val orderId: Int,
    val userId: Int,
    val amount: Int
) {
}