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
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.newelcomescreen.MainActivity
import com.example.newelcomescreen.ui.theme.NeWelcomeScreenTheme

class Flashcard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(
                horizontalAlignment =  Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                Text(
                    text = "Peter Mokaba was born in Mankweng, Polokwane",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Black

                )

                Column {
                    Text(text = "He was awarded for his valiant and" +
                            "gallant contribution to the national" +
                            "liberation struggle against apartheid" +
                            "and his contribute towards the creation of a" +
                            "non-racial, South Africa")
                    Text(text = "Peter Mokaba was born in Mankweng, Polokwane")
                    Column {
                        Text(text = "He was not a Soccer Player")
                        Text(text = "Peter ")
                    }
                }

                Row {
                    Button(onClick = {
                        //Run when button is clicked\

                    }) { Text(text = "True")}

                }


                Row {
                    Column {
                        Text(text = "Or")
                    }
                }

                Row {
                    Button(onClick = {
                        //Run when button is clicked\

                    }) { Text(text = "False")}


                }

                Row {
                    Button(onClick = {
                        //Run when button is clicked\
                        val next = Intent(this@Flashcard, Flashcard::class.java)
                        startActivity(next)
                        val start = Intent(this@Flashcard, Flashcard::class.java)
                        startNextMatchingActivity(start)
                    }) { Text(text = "Next")}

                }

            }
        }

        }
    }



fun Add(firstInt: Int, secondInt: Int): Int {
    var  results: Int = firstInt + secondInt
    return results
}

