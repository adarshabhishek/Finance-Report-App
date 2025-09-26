package com.example.trackify.Activities.IntroActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.trackify.Activities.IntroActivity.screens.IntroScreen
import com.example.trackify.Activities.DashboardActivity.MainActivity

class IntoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntroScreen(onStartClick = {
                startActivity(Intent(this, MainActivity::class.java))
            })
        }

    }
}