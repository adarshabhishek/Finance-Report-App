package com.example.trackify.Activities.ReportActivity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.trackify.Activities.ReportActivity.components.CenterStatsCard
import com.example.trackify.Activities.ReportActivity.components.GradientHeader
import com.example.trackify.Domain.BudgetDomain

@Composable
fun ReportScreen(
    budgets: List<BudgetDomain>,
    onBack: () -> Unit
) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (scrollRef,bottomBarRef) = createRefs()
        ReportContent(
            budgets = budgets,
            modifier = Modifier
                .constrainAs(ref = scrollRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            onBack = onBack
        )
    }
}

@Composable
fun ReportContent(
    budgets: List<BudgetDomain>,
    modifier: Modifier=Modifier,
    onBack: () -> Unit
) {
    LazyColumn(
        modifier = modifier
            .background(Color.White),
    ) {
        item {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(420.dp)
            )
            {
                val (header, card) = createRefs()
                GradientHeader(
                    modifier= Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .constrainAs(header){
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            end.linkTo( parent.end)
                        },
                    onBack = onBack
                )
                CenterStatsCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(horizontal = 24.dp)
                        .constrainAs(card){
                            top.linkTo(header.bottom)
                            bottom.linkTo(header.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                )
            }
        }
    }
}

@Preview
@Composable
fun ReportScreenPreview() {
    val budgets = listOf(
        BudgetDomain("Home Loan",10200.0,11.0),
        BudgetDomain("Car Loan",7556.0,7.5),
        BudgetDomain("Subscription",450.0,5.0)
    )
    ReportScreen(budgets = budgets, onBack = {})
}