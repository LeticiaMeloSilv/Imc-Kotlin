package br.senai.sp.jandira.calculadoraimc

import android.graphics.Color.BLUE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier
                .background(color = Color(0xffea1450))
                .fillMaxWidth()
                .height(200.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "logo imc",

                modifier = Modifier
                    .padding(16.dp)
                    .size(height = 76.dp, width = 76.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )

        }
        Card(
            modifier = Modifier
                .width(340.dp)
                .offset(x = 0.dp, y = -20.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xffF9F6F6)),

            ) {
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .align(Alignment.CenterHorizontally)

            ) {
                Text(
                    text = "Seus Dados",
                    color = Color(0xffea1450),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    modifier = Modifier
                        .padding(top = 30.dp, bottom = 30.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Column(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ){

                Text(
                    text = "Seu Peso: ",
                    color = Color(0xffea1450),
                    modifier = Modifier
                        .padding(12.dp)
                )
                TextField(
                    value = "Seu peso em Kg",
                    onValueChange = {},
                    modifier = Modifier
                        .background(Color.White)
                        .border(
                        width = 1.dp,
                        color = Color(0xffea1450),
                        shape = RoundedCornerShape(size = 2.dp)),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedTextColor = Color(0xffAFA9A9),
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Transparent,
                        )
                )
                Text(
                    text = "Sua Altura: ",
                    color = Color(0xffea1450),
                    modifier = Modifier.padding(12.dp)
                )
                TextField(
                    value = "Sua altura em cm",
                    onValueChange = {},
                    modifier = Modifier
                        .background(Color.White)
                        .border(
                            width = 1.dp,
                            color = Color(0xffea1450),
                            shape = RoundedCornerShape(size = 2.dp)),
                   colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedTextColor = Color(0xffAFA9A9),
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Transparent,
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White

                        )
                )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xffea1450)
                        ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 18.dp),
                    shape = RoundedCornerShape(size = 8.dp)
                ) {
                    Text(text = "CALCULAR")
                }


            }
        }
        Card(
            modifier = Modifier
                .width(340.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xff329F6B)),
            elevation = CardDefaults.cardElevation(8.dp),
            ){
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(12.dp),
                //horizontalArrangement = Arrangement.SpaceBetween,

                ){
                Column (
                    modifier = Modifier
                        .padding(end = 32.dp),
                    ){
                    Text(
                        text = "Resultado",
                        fontSize = 16.sp,
                        color = Color.White
                        )
                    Text(
                        text = "Peso Ideal",
                        fontSize = 20.sp,
                        color = Color.White
                        )
                }
                Text(
                    text = "21.3",
                    color = Color.White,
                    fontSize = 38.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Greeting()
    }
}