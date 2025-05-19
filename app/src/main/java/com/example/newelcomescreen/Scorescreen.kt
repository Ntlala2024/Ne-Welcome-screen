package com.example.newelcomescreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newelcomescreen.Flashcard
import com.example.newelcomescreen.ui.theme.NeWelcomeScreenTheme

class Scorescreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Row {
                Button(onClick = {
                    //Run when button is clicked\
                    val review = Intent(this@Scorescreen, Flashcard::class.java)
                    startActivity(review)
                    val exit = Intent(this@Scorescreen, Flashcard::class.java)
                    startNextMatchingActivity(exit)
                }) { Text(text = "Review")
                 Text(text = "Review")}


            }

        }
    }
}

