package dev.n7meless.commondtos.event

import dev.n7meless.commondtos.dto.OrderRequestDto
import java.util.*

class OrderEvent(
    private val orderRequestDto: OrderRequestDto,
    private val orderStatus: OrderStatus
) : Event {
    private val eventId: UUID = UUID.randomUUID()
    private val eventDate: Date = Date()

    override fun getEventId(): UUID = eventId
    override fun getDate(): Date = eventDate

}