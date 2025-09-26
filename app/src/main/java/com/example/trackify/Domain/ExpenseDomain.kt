package com.example.trackify.Domain

import java.io.Serializable
import java.sql.Time

data class ExpenseDomain(
    val title: String="",
    val price: Double=0.0,
    val pic: String="",
    val time: String=""
): Serializable
