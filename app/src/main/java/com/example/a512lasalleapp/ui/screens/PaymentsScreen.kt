package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.components.PaymentItem
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun PaymentsScreen(innerPadding: PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
    ){
        Text(text = "Pagos Pendientes",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(25.dp)
                .align(Alignment.CenterHorizontally))

        LazyRow (
            modifier = Modifier.fillMaxWidth().height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            item(){
                PaymentItem(text = "Octubre", false, onClick = {})
                PaymentItem(text = "Noviembre", false, onClick = {})
                PaymentItem(text = "Diciembre", false, onClick = {})
            }
        }

        Text(text = "Pagos Realizados",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(25.dp)
                .align(Alignment.CenterHorizontally))

        LazyRow (
            modifier = Modifier.fillMaxWidth().height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            item(){
                PaymentItem(text = "Septiembre", true, onClick = {})
                PaymentItem(text = "Agosto", true, onClick = {})
            }
        }
    }
}

@Preview
@Composable
fun PaymentsScreenPreview() {
    _512LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues())
    }
}