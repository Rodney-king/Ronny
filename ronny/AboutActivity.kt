package com.example.ronny

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ronny.ui.theme.RonnyTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting2()
                }
            }
        }

@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting2() {


    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color.White,
            Color.LightGray))
    val firstName = remember { mutableStateOf("") }
    val emailVal = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val home = LocalContext.current




         Row(modifier = Modifier
             .fillMaxSize()
             .padding(0.dp)
             .background(verticalGradientBrush),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
             Column(modifier = Modifier
                 .padding(25.dp)
        ) {

                 Image(painter = painterResource(
                     id = R.drawable.signup),
                     contentDescription = "",
                     Modifier.size(160.dp)
                 )

                 Text(text = "Sign Up", style = TextStyle(fontSize = 40.sp, textAlign = TextAlign.Center, fontFamily =  FontFamily.Monospace))
                 Spacer(modifier = Modifier.height(10.dp))



                 OutlinedTextField(
                     label = { Text(text = "FirstName:")},
                     value = password.value,
                     visualTransformation = PasswordVisualTransformation(),
                     onValueChange = {firstName.value = it }
                 )
                 Spacer(modifier = Modifier.height(10.dp))


                 OutlinedTextField(
                     label = { Text(text = "Lastname:")},
                     value = password.value,
                     visualTransformation = PasswordVisualTransformation(),
                     onValueChange = {lastName.value = it },
                     )

                 OutlinedTextField(
                     label = { Text(text = "Email, Phone:")},
                     value = password.value,
                     visualTransformation = PasswordVisualTransformation(),
                     onValueChange = {lastName.value = it },
                 )



                 OutlinedTextField(
                     label = { Text(text = "Password:")},
                     value = password.value,
                     visualTransformation = PasswordVisualTransformation(),
                     keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password),
                     onValueChange = {password.value = it }

                 )



            Column(
                verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)) {
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(47.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp))
                       {

                    Text(text = "Sign Up",
                        modifier = Modifier.
                        padding(5.dp),
                        color = Color.Black)
                }
                TextButton(onClick = {home.startActivity(Intent(home, Login::class.java))})
                {
                    Text(text = "Already have an account? Log In")
                }
            }
        }
    }
}












