package com.example.trackify.Repository

import com.example.trackify.Domain.BudgetDomain
import com.example.trackify.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant", 573.12, "restaurant", "27 Sep 2025 22:15"),
        ExpenseDomain("McDonalds", 180.12, "mcdonald", "26 Sep 2025 13:10"),
        ExpenseDomain("Movie", 238.00,"cinema", "26 Sep 2025 11:25"),
        ExpenseDomain("Restaurant", 456.18, "restaurant", "25 Sep 2025 12:10")
    )
    val budget= mutableListOf(
        BudgetDomain("Home Loan",10200.0,11.0),
        BudgetDomain("Car Loan",7556.0,7.5),
        BudgetDomain("Subscription",450.0,5.0)
    )

}