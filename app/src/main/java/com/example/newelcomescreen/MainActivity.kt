package com.example.newelcomescreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.newelcomescreen.ui.theme.NeWelcomeScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                horizontalAlignment =  Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Ne Welcome screen ",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black

                )

            Column {
                Text(text = "Our Welcome screen of history" +
                        "of Peter Ramoshoane Mokaba. where we create" +
                        "innovative mobile application designed")
                Text(text = "to transform and elevate user experience " +
                        "by if a user needs to be able to make a choices.")
                Text(text = "Then, the app also needs to be able" +
                        "to deal with that on whether is TRUE or FALSE" +
                        "and is it Correct or Incorrect")
            }
            Row {
                Button(onClick = {
                //Run when button is clicked\
                    val start = Intent(this@MainActivity, Flashcard::class.java)
                    startActivity(start)
                    val next = Intent(this@MainActivity, Flashcard::class.java)
                    startNextMatchingActivity(next)
                }) { Text(text = "Start")}

            }

        }
    }
}}
