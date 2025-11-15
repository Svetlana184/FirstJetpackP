package com.example.firstjetpack.screens

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowContainer(){
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround) {
        Box(modifier = Modifier.background(Color.LightGray).fillMaxHeight().width(100.dp)
            )
        Box(modifier = Modifier.background(Color.Gray).fillMaxHeight().width(100.dp)
            )
        Box(modifier = Modifier.background(Color.LightGray).fillMaxHeight().width(100.dp)
            )
    }
}

@Composable
fun ColumnContainer(){
    Column(modifier = Modifier.fillMaxSize().
    border(width = 7.dp, color = Color.Gray),
        verticalArrangement = Arrangement.Center) {
        Column(modifier = Modifier.height(400.dp).fillMaxWidth().padding(all = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween, Alignment.CenterHorizontally){
            Box(modifier = Modifier.background(Color.LightGray).fillMaxWidth().height(100.dp)
                .weight(1f))
            Box(modifier = Modifier.background(Color.Gray).fillMaxWidth().height(100.dp)
                .weight(1f))
            Box(modifier = Modifier.background(Color.LightGray).fillMaxWidth().height(100.dp)
                .weight(1f))
//            Text("Kotlin", fontSize = 28.sp)
//            Text("Java", fontSize = 28.sp)
//            Text("Go", fontSize = 28.sp)
//            Text("Python", fontSize = 28.sp)
        }

    }
}

@Composable
fun BoxContainer(){
    Box(modifier = Modifier.fillMaxSize().background(Color.LightGray),
        contentAlignment = Alignment.Center){
//        Box(modifier = Modifier.background(Color.Magenta).size(170.dp, 170.dp))
//        Box(modifier = Modifier.background(Color.White).size(150.dp, 150.dp))
//        Text("hello, world", fontSize = 28.sp)
        Box(modifier = Modifier.align(alignment = Alignment.TopStart).size(100.dp).
        background(Color.White))
        Box(modifier = Modifier.align(alignment = Alignment.TopEnd).size(100.dp).
        background(Color.Black))
        Box(modifier = Modifier.align(alignment = Alignment.Center).size(100.dp).
        background(Color.Magenta))
        Box(modifier = Modifier.align(alignment = Alignment.BottomEnd).size(100.dp).
        background(Color.White))
        Box(modifier = Modifier.align(alignment = Alignment.BottomStart).size(100.dp).
        background(Color.Black))
    }

}

//@Preview(showBackground = true)
//
//@Composable
//fun HelloPreview() {
//    //BoxContainer()
//    //ColumnContainer()
//    RowContainer()
//}
