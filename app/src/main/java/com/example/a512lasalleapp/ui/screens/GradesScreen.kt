package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a512lasalleapp.ui.components.ClassWidget
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Column (
            modifier = Modifier.padding(25.dp)
        ){
            Text(text = "Ronaldo Nunez Laguna",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                color = Color.White,
                modifier = Modifier.padding(bottom = 5.dp))
            Text(text = "Carrera: Ingenieria en Software y Sistemas Computacionales",
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                color = Color.White)
            Text(text = "Semestre: 5",
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                color = Color.White)
            Text(text = "Promedio: 9.4",
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                color = Color.White)
        }
    }, body = {
        LazyColumn (
            modifier = Modifier.height(300.dp).padding(10.dp)
        ){
            items(7) {
                ClassWidget(text = "Clase", grade = "9.0", onClick = {navController.navigate("class-detail")})
            }
        }
    })
}

@Preview
@Composable
fun GradesScreenPreview() {
    _512LaSalleAppTheme {
        GradesScreen(innerPadding = PaddingValues(), navController = NavController(LocalContext.current))
    }
}