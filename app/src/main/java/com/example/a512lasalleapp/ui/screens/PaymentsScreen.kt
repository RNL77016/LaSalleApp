package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                .align(androidx.compose.ui.Alignment.CenterHorizontally))

        LazyColumn (
            modifier = Modifier.fillMaxWidth().height(150.dp)
        ){
            item(){
                PaymentItem(text = "Primer Pago", true)
                PaymentItem(text = "Primer Pago", true)
                PaymentItem(text = "Primer Pago", true)
            }
        }

        Text(text = "Pagos Realizados",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(25.dp)
                .align(androidx.compose.ui.Alignment.CenterHorizontally))
    }
}

@Preview
@Composable
fun PaymentsScreenPreview() {
    _512LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues())
    }
}