package com.example.trackify.Activities.DashboardActivity.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trackify.R

@Composable
fun BottomNavigationBar(onItemSelelected:(Int)->Unit,
                        modifier: Modifier){
    NavigationBar(containerColor = colorResource(R.color.lightBlue),
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelelected(R.id.wallet) },
            icon = {
                Icon(painter = painterResource(R.drawable.wallet),
                    contentDescription = null)
            },
            label = { Text(text = "Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onItemSelelected(R.id.market) },
            icon = {
                Icon(painter = painterResource(R.drawable.market),
                    contentDescription = null)
            },
            label = { Text(text = "Market") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onItemSelelected(R.id.trade) },
            icon = {
                Icon(painter = painterResource(R.drawable.trade),
                    contentDescription = null)
            },
            label = { Text(text = "Trade") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onItemSelelected(R.id.futures) },
            icon = {
                Icon(painter = painterResource(R.drawable.futures),
                    contentDescription = null)
            },
            label = { Text(text = "Futures") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onItemSelelected(R.id.profile) },
            icon = {
                Icon(painter = painterResource(R.drawable.profile),
                    contentDescription = null)
            },
            label = { Text(text = "Profile") }
        )
    }

}