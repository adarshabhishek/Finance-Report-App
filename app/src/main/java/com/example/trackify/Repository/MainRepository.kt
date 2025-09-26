package com.example.trackify.Repository

import com.example.trackify.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant", 573.12, "img1", "27 Sep 2025 22:15"),
        ExpenseDomain("McDonalds", 180.12, "img2", "26 Sep 2025 13:10"),
        ExpenseDomain("Movie", 238.00,"img3", "26 Sep 2025 11:25"),
        ExpenseDomain("Groceries", 456.18, "img4", "25 Sep 2025 12:10")
    )
}