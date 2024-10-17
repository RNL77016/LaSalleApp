package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
fun ClassDetailScreen(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = {
        Column (
            modifier = Modifier.padding(25.dp)
        ){
            Text(text = "Nombre de Clase",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                color = Color.White,
                modifier = Modifier.padding(bottom = 5.dp))
        }
    }, body = {
        LazyColumn (
            modifier = Modifier.height(300.dp).padding(10.dp)
        ){
            item() {
                ClassWidget(text = "Parcial 1", grade = "9.0", onClick = {})
                ClassWidget(text = "Parcial 2", grade = "9.0", onClick = {})
                ClassWidget(text = "Parcial 3", grade = "9.0", onClick = {})
            }
        }
    })
}

@Preview
@Composable
fun ClassDetailScreenPreview() {
    _512LaSalleAppTheme {
        ClassDetailScreen(innerPadding = PaddingValues())
    }
}