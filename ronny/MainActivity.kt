package com.example.ronny//package com.example.ronny
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ronny.R.drawable
import com.example.ronny.ui.theme.RonnyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Greeting()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(


        modifier = Modifier
        .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        Image(painterResource(id = R.drawable.danai), contentScale = ContentScale.Crop ,contentDescription = "null",
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
        )



        Text(text = "Discover and Find Your Perfect Healing Place",
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 40.sp,
                fontFamily =  FontFamily.Cursive) )


        Spacer(modifier = Modifier.height(45.dp))

        Box(modifier = Modifier.padding(30.dp, 0.dp, 40.dp, 0.dp)) {
            androidx.compose.material3.Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
            ) {

                androidx.compose.material3.Text(
                    text = "Register",
                    color = Color.Black
                )
            }

        }

        Spacer(modifier = Modifier.height(30.dp))

        ClickableText(
            text = AnnotatedString("Already Have Account? Log In"),
            onClick = {},
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.SansSerif

            )
        )
























    }


   }

