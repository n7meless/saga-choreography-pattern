package dev.n7meless.commondtos.event

import dev.n7meless.commondtos.dto.PaymentRequestDto
import java.util.*

class PaymentEvent(
    private val paymentRequestDto: PaymentRequestDto,
    private val paymentStatus: PaymentStatus
) : Event {
    private val eventId: UUID = UUID.randomUUID()
    private val eventDate: Date = Date()

    override fun getEventId(): UUID = eventId
    override fun getDate(): Date = eventDate
}