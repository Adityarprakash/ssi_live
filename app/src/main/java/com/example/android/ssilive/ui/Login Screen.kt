package com.example.android.ssilive.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.ssilive.R


@Composable

 fun LoginScreen(){

     var email by remember {
         mutableStateOf("")
     }

    var password by remember {
        mutableStateOf("")
    }


     Column (
         modifier = Modifier.fillMaxSize(),
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally

     ){
         Image(painter = painterResource(id = R.drawable.ssi), contentDescription = "Login Image",
             modifier = Modifier.size(200.dp), alignment = Alignment.TopStart)
         Spacer(modifier = Modifier.padding(8.dp))

         Text (text = "SSI Live", fontSize = 20.sp)
         Spacer(modifier = Modifier.padding(8.dp))

         Text(text ="Login to your account")
         Spacer(modifier = Modifier.padding(4.dp))

         OutlinedTextField(value = email, onValueChange = {
             email = it
         }, label = {
             Text(text = "Enter your Email")
         })
         Spacer(modifier = Modifier.padding(8.dp))

         OutlinedTextField(value = password, onValueChange = {
             password = it
         }, label = {
             Text(text = "Password")
         }, visualTransformation = PasswordVisualTransformation())

         Spacer(modifier = Modifier.padding(8.dp))
         Button(onClick = { }){
             Text(text = "Login")
         }
         Spacer(modifier = Modifier.padding(16.dp))
TextButton(onClick = { }) {
    Text(text = "Forgot Password")
}

     }

}