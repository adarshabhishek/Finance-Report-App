package com.example.trackify.Activities.DashboardActivity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trackify.Activities.DashboardActivity.components.ActionButtonRow
import com.example.trackify.Activities.DashboardActivity.components.CardSection
import com.example.trackify.Activities.DashboardActivity.components.HeaderSection
import com.example.trackify.Domain.ExpenseDomain

@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    val expenses = listOf(
        ExpenseDomain("Restaurant", 573.12, "img1", "27 Sep 2025 22:15"),
        ExpenseDomain("McDonalds", 180.12, "img2", "26 Sep 2025 13:10"),
        ExpenseDomain("Movie", 238.00,"img3", "26 Sep 2025 11:25"),
        ExpenseDomain("Groceries", 456.18, "img4", "25 Sep 2025 12:10")
    )

    MainScreen(expenses=expenses)
}
@Composable
fun MainScreen(
    onCardClick: () -> Unit = {},
    expenses: List<ExpenseDomain>
){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)){
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            item{ HeaderSection() }
            item { CardSection (onCardClick) }
            item { ActionButtonRow() }
        }
    }
}