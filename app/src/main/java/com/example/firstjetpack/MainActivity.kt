package com.example.firstjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstjetpack.screens.InstagramProfileCard
import com.example.firstjetpack.ui.theme.FirstJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                FirstJetpackTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        InstagramProfileCard()
                    }
                }

        }
    }
}

@Composable
fun NewStory(){
    MaterialTheme() {
        val typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(top=50.dp, start=16.dp, end = 16.dp, bottom = 16.dp)
        ) {
            Image(bitmap = ImageBitmap.imageResource(R.drawable.pic),
                modifier = Modifier.height(180.dp).fillMaxWidth().
                clip(shape = RoundedCornerShape(15.dp)),
                contentDescription = "world",
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(16.dp))
            Text("Day in Shark Cove", style = typography.bodyLarge)
            Text("California", style = typography.bodySmall)
            Text("December 2018")
        }
    }
}


//@Composable
//fun Hello(){
//    Text(
//        text = "tytyyyyyyyyyytytytttttttttttttt" +
//                "tttttttttttttttttt" +
//                "ytytytytt" +
//                "tttttt" +
//                " ytyty ytytyyyyyytytytyty " +
//                "yttttttttttttttttttytyty" +
//                " ytytytytytytyty",
//
//        style = TextStyle(fontSize = 20.sp),
//        modifier = Modifier.horizontalScroll(ScrollState(0))
//    )
//}
//fun getTime(): String{
//    val calendar = Calendar.getInstance()
//    val hours = calendar.get(Calendar.HOUR_OF_DAY)
//    val minutes = calendar.get(Calendar.MINUTE)
//    if (hours > 9){
//        return "morning"
//    }
//    return "nice day"
//}

//@Composable
//fun MyList(){
//    val langs = listOf("c#", "c++", "java", "go")
//    Column(){
//        for (lang in langs){
//            Text(text = lang, fontSize = 30.sp,
//                modifier = Modifier.
//                padding(start = 0.dp, top = 10.dp, end = 20.dp, bottom = 10.dp).
//                size(width = 100.dp, height = 200.dp).
//                offset(x = 30.dp, y = 50.dp).
//                background(Color.LightGray)
//
//            )
//
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)

@Composable
fun HelloPreview() {
    InstagramProfileCard()
}


/*
контейнеры и компоненты:
- Layout

элементы (наследники layout):
- Text
- Image
- Column
- Box
- Row
- Surface

элементы:
- Text
- Button
- TextField - текстовое поле
- CheckBox - галочка
- RadioButton - выбор
-


модификаторы
- fontsize
- heignt
- width
- padding(start = 0.dp, top = 10.dp, end = 20.dp, bottom = 10.dp)
- background
- widthIn(min = 100.dp, max = 400.dp).
- heightIn(min = 50.dp, max = 300.dp)
- fillMaxWidth() - ширина на весь экран
- fillMaxSize(0.5ft) - на весь экран, в скобках - ограничение
- offset - сдвиг
- horizontalScroll - прокрутка
- Clip - закругление элементов

порядок модификаторов имеет значение
 */