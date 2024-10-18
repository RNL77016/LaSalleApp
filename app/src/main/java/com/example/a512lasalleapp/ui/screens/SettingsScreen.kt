package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.components.Widget
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Dark_mode
import com.example.a512lasalleapp.ui.utils.Password_2

@Composable
fun SettingsScreen(innerPadding: PaddingValues, navController: NavController) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .placeholder(R.drawable.profile_picture)
                    .data(R.drawable.profile_picture)
                    .build(),
                contentDescription = "Selene Delgado",
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Ronaldo Nunez Laguna",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                color = Color.White,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = "Fecha de Nacimiento: 10 - 17 - 2004",
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                color = Color.White,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = "rnl77016@lasallebajio.edu.mx",
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                color = Color.White
            )
        }
    }, body = {
        Row(
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceEvenly
        ) {
            Widget(Password_2, "Cambiar Contraseña", onClick = { navController.navigate("change-password") })
            Widget(Dark_mode, "Cambiar Tema", onClick = { navController.navigate("change-theme") })
        }
    })
}

@Preview
@Composable
fun SettingsScreenPreview() {
    _512LaSalleAppTheme {
        SettingsScreen(innerPadding = PaddingValues(), navController = NavController(LocalContext.current))
    }
}