package com.example.firstjetpack.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.Language

//@Composable
//fun storyCompose(){
//    val langs = listOf<Language>(){
//        Language(name="python", R.color.darker_gray.toLong());
//        Language(name="kotlin", R.color.darker_gray.toLong());
//        Language(name="go", R.color.darker_gray.toLong())
//    }
//}
//@Composable
//fun StorySurface(){
//    Surface(Modifier.fillMaxSize(), content = Color.LightGray,
//        color = Color.DarkGray) {
//        Text("Hello", fontSize = 28.sp)
//    }
//}


data class Language(val name: String, val hexColor:Long)

//@Preview(showBackground = true)
//
//@Composable
//fun HelloPreview() {
//
//}
