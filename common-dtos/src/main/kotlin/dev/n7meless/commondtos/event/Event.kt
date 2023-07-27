package dev.n7meless.commondtos.event

import java.util.*

interface Event {
    fun getEventId(): UUID
    fun getDate(): Date
}