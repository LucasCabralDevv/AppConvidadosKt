package com.lucascabral.convidados.service.constants

class GuestConstants private constructor() {

    companion object {
        const val GUEST_ID = "guestId"
    }

    object FILTER {
        const val EMPTY = 0
        const val PRESENT = 1
        const val ABSENT = 2
    }
}