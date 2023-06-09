package com.example.ronny

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ronny.ui.theme.RonnyTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RonnyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting3() {

    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color.White,
            Color.LightGray


        )
    )
    Box(

        modifier = Modifier.fillMaxSize()) {
        ClickableText(
            text = AnnotatedString
                ("Sign up here"),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp),


            onClick = {},
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Blue
            )

        )
    }
    Column(

        modifier = Modifier
            .padding()
            .fillMaxSize()
            .background(verticalGradientBrush),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {

        Image(painter = painterResource(
            id = R.drawable.login),
            contentDescription = "",
            Modifier.size(140.dp)
            )

        Spacer(modifier = Modifier
            .height(10.dp)
        )

        val username = remember { mutableStateOf(TextFieldValue())

        }
        val password = remember {
            mutableStateOf(TextFieldValue())
        }

        Text(text = "Login", style = TextStyle(fontSize = 40.sp, fontFamily =  FontFamily.Monospace))
        Spacer(modifier = Modifier.height(10.dp))
    
        OutlinedTextField(
            label = { Text(text = "Phone,email, or username")},

            value = password.value,
            onValueChange = {username.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            label = { Text(text = "Password")},
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {password.value = it }

        )

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(30.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                ) {

                Text(text = "Login",
                    color = Color.Black)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        ClickableText(
            text = AnnotatedString("Forgot password?"),
            onClick = {},
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.SansSerif

            )
            )

    }
}



