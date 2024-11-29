package com.example.androidmenu

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidmenu.ui.theme.AndroidMenuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidMenuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    //hori_list_buttons()
                    //ver_list_buttons()
                    //MenuGrid()
                    MenuGrid()
                }
            }
        }
    }
}
/*
@Composable
fun hori_list_buttons(){
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Catagories.forEach {
            MenuCatagory(catagory = it)
        }
    }
}
*/
/*
@Composable
fun ver_list_buttons(){
    Column (modifier=Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center) {
        Catagories.forEach {
            MenuCatagory(catagory = it)
        }
    }
}

@Composable
fun MenuCatagory(catagory: String) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.LightGray),
        shape = RoundedCornerShape(40),
        modifier = Modifier.padding(5.dp)
    ) {
        Text(text = catagory)
    }
}

val Catagories = listOf<String>(
    "Lunch",
    "Dessert",
    "Mains"
)
*/

@Preview(showBackground = true)
@Composable
fun MenuCatagoryPreview() {
    AndroidMenuTheme {
        //hori_list_buttons()
        //ver_list_buttons()
        MenuGrid()
    }
}