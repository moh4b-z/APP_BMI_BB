package br.senai.sp.jandira.bmi.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AppBlocking
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R
import org.w3c.dom.Text

@Composable
fun UserDataScreen(
    navController: NavHostController?
) {
    var context = LocalContext.current
    var ageState = remember {
        mutableStateOf(value = "")
    }
    var weightState = remember {
        mutableStateOf(value = "")
    }
    var heightState = remember {
        mutableStateOf(value = "")
    }


    var isErrorStateInputAge = remember {
        mutableStateOf(value = false)
    }
    var erroMessageState = remember {
        mutableStateOf(value = "")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF5608A4),
                        Color(0xFFBA88FF)
                    )
                )
            )
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ){

            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp),
                text = stringResource(R.string.titleHi),
                fontSize = 68.sp,
                color = Color.White,

            )
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(9f)
                    .padding(0.dp, 32.dp, 0.dp, 0.dp),
                colors = CardDefaults.cardColors(Color(0xFFffffff)),
                shape = RoundedCornerShape(48.dp, 48.dp)

            ){
                Column (
                    modifier = Modifier
                        .padding(32.dp)
                        .weight(1f),
                    verticalArrangement = Arrangement.SpaceAround
                ){
                    Row (
                        modifier = Modifier
                            .padding(0.dp, 10.dp),
                    ){
                        Column (
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card (
                                modifier = Modifier
                                    .size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    2.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF5608A4),
                                            Color(0xFFBA88FF)
                                        )
                                    )),
                                elevation = CardDefaults.elevatedCardElevation(5.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.avatarmale),
                                    contentDescription = stringResource(R.string.logo_descriptioon),
                                    modifier = Modifier
                                        .padding(top = 32.dp)
                                        .fillMaxSize()

                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp, 5.dp),
                                border = BorderStroke(
                                    1.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF5608A4),
                                            Color(0xFFBA88FF)
                                        )
                                    )),
                                elevation = ButtonDefaults.buttonElevation(5.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xFF5608A4))
                            ) {
                                Text(
                                    text = stringResource(R.string.buttonMale)
                                )
                            }
                        }
                        Column (
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card (
                                modifier = Modifier
                                    .size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    2.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF5608A4),
                                            Color(0xFFBA88FF)
                                        )
                                    )),
                                elevation = CardDefaults.elevatedCardElevation(5.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.avatarfemale),
                                    contentDescription = stringResource(R.string.logo_descriptioon),
                                    modifier = Modifier
                                        .padding(top = 32.dp)
                                        .fillMaxSize()
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp, 5.dp),
                                border = BorderStroke(
                                    1.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF5608A4),
                                            Color(0xFFBA88FF)
                                        )
                                    )),
                                elevation = ButtonDefaults.buttonElevation(5.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xFF5608A4))
                            ){
                                Text(
                                    text = stringResource(R.string.buttonFemale)
                                )
                            }
                        }
                    }
                    Column (
                        modifier = Modifier
                            .padding(0.dp, 10.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ){
                        OutlinedTextField(
                            value = ageState.value,
                            onValueChange = {
                                ageState.value = it
                            },
                            modifier = Modifier
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            label = {
                                Text(
                                    text = stringResource(R.string.Age)
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Numbers,
                                    contentDescription = "",
                                    tint = Color(0xFF5608A4)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedLabelColor = Color(0xFFBA88FF),
                                cursorColor = Color(0xFFBA88FF)
                            ),
                            isError = isErrorStateInputAge.value,
                            supportingText = {
                                Text(
                                    text = erroMessageState.value,
                                    color = Color.Red
                                )
                            }
                        )
                        OutlinedTextField(
                            value = weightState.value,
                            onValueChange = {
                                weightState.value = it
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(0.dp, 30.dp),
                            shape = RoundedCornerShape(16.dp),
                            label = {
                                Text(
                                    text = stringResource(R.string.Weight)
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFF5608A4)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedLabelColor = Color(0xFFBA88FF),
                                cursorColor = Color(0xFFBA88FF)
                            )
                        )
                        OutlinedTextField(
                            value = heightState.value,
                            onValueChange = {
                                heightState.value = it
                            },
                            modifier = Modifier
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            label = {
                                Text(
                                    text = stringResource(R.string.Height)
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFF5608A4)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Done
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                cursorColor = Color(0xFFBA88FF),
                                unfocusedLabelColor = Color(0xFFBA88FF)
                            )
                        )
                    }

                    Button(
                        onClick = {
                            if (ageState.value.length <= 0){
                                isErrorStateInputAge.value = true
                                erroMessageState.value = context.getString(R.string.support_name)
                            }else{
                                navController?.navigate("user_data")
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth(),
                        border = BorderStroke(
                            1.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFF5608A4),
                                    Color(0xFFBA88FF)
                                )
                            )),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF5608A4)),
                        shape = RoundedCornerShape(10.dp)
                    )  {
                        Text(
                            text = stringResource(R.string.buttonCalculate),
                            fontSize = 28.sp,
                        )
                    }


                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen(null)
}