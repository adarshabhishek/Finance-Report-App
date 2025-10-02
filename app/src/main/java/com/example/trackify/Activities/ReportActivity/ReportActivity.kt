package com.example.trackify.Activities.ReportActivity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trackify.Activities.ReportActivity.screens.ReportScreen
import com.example.trackify.R
import com.example.trackify.ViewModel.MainViewModel

class ReportActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            ReportScreen(
                budgets = mainViewModel.loadBudget(),
                onBack = {finish()}
            )
        }

    }
}