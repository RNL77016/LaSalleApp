package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.components.PaymentItem
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Arrow_back

@Composable
fun PaymentsScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = 70.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(70.dp)
                )

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.welcome_text),
                        color = Color.White,
                        fontSize = 18.sp
                    )
                    Text(
                        text = "Ronaldo Nunez",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                }
                Icon(
                    imageVector = Arrow_back,
                    contentDescription = "Back",
                    modifier = Modifier
                        .size(45.dp)
                        .clickable {
                            navController.popBackStack() //Regresar a la sección anterior
                        },
                    tint = Color.White
                )
            }
        }

        // Título de Pagos Pendientes
        Text(
            text = "Pagos Pendientes",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(25.dp)
                .align(Alignment.CenterHorizontally)
        )

        // Pagos Pendientes
        LazyRow(
            modifier = Modifier.fillMaxWidth().height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            item {
                PaymentItem(text = "Octubre", false, onClick = {})
                PaymentItem(text = "Noviembre", false, onClick = {})
                PaymentItem(text = "Diciembre", false, onClick = {})
            }
        }

        // Título de Pagos Realizados
        Text(
            text = "Pagos Realizados",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(25.dp)
                .align(Alignment.CenterHorizontally)
        )

        // Pagos Realizados
        LazyRow(
            modifier = Modifier.fillMaxWidth().height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            item {
                PaymentItem(text = "Reinscripcion", true, onClick = {})
                PaymentItem(text = "Agosto", true, onClick = {})
                PaymentItem(text = "Septiembre", true, onClick = {})
            }
        }
    }
}

@Preview
@Composable
fun PaymentsScreenPreview() {
    _512LaSalleAppTheme {
        val navController = rememberNavController()
        PaymentsScreen(innerPadding = PaddingValues(), navController = navController)
    }
}
