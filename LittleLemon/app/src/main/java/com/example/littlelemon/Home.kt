package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.littlelemon.ui.theme.charcoal
import com.example.littlelemon.ui.theme.yellow

@Composable
fun Home(navController: NavHostController?=null){
    Header(navController)
}

@Composable
fun Header(navController: NavHostController?=null){
    Row (horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically){
        TopAppBar()
        ProfileImage(navController)
    }
}

@Composable
fun ProfileImage(navController: NavHostController?=null){
    Image(painter = painterResource(id = R.drawable.profile_image),
        contentDescription = "Profile Image",
        modifier = Modifier
            .fillMaxWidth(0.50F)
            .padding(10.dp)
            .size(40.dp)
            .clickable {navController?.navigate(Profile.route)})
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home()
}
