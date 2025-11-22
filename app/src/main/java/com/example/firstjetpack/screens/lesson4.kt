package com.example.firstjetpack.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstjetpack.ui.theme.FirstJetpackTheme


@Composable
fun SurfaceScreen(){
    var langs = listOf("Kotlin", "Java", "JavaScript", "Python", "C#", "C")
    Surface(modifier = Modifier.fillMaxSize(),
        contentColor = Color.LightGray,
        color = Color.DarkGray) {
        Column(

        ) {
            Text("Programming languages", fontSize = 28.sp)
            for (lang in langs){
                Text(lang, fontSize = 22.sp)
            }

        }
//        Text("Hello, world", fontSize = 28.sp) - error, можно ставить только один компонент
    }
}


@Preview
@Composable
fun ScreenPreview() {
    FirstJetpackTheme(darkTheme = false) {
        SurfaceScreen()
    }
}