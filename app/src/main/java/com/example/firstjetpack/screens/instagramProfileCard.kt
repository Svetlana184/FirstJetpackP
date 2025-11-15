package com.example.firstjetpack.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstjetpack.R
import com.example.firstjetpack.ui.theme.FirstJetpackTheme



@Composable
fun InstagramProfileCard(){
    Card(modifier = Modifier.padding(8.dp).
    background(MaterialTheme.colorScheme.background).border(BorderStroke(1.dp, MaterialTheme.colorScheme.background),
    shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)
    )){
        Column(modifier = Modifier.padding(16.dp))
        {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically)
            {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.inst),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).clip(CircleShape).background(color = Color.White).padding(8.dp)
                )
                UserStatistics(title="Posts", value="6,950")
                UserStatistics(title="Followers", value="33")
                UserStatistics(title="Following", value="25")
            }
            Text("Instagram", fontFamily = FontFamily.Cursive, fontSize = 32.sp)
            Text("#Years to make", fontSize = 14.sp)
            Text("www.facebook.com/emotional_support", fontSize = 14.sp)
            Button(modifier = Modifier.height(40.dp).width(120.dp),
                onClick = {}, shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff2196))) {
                Text("Follow")
            }
        }
    }

}
@Composable
private fun UserStatistics(title: String,value: String){
    Column(modifier = Modifier.height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally, )
    {
        Text(value, fontFamily = FontFamily.Cursive, fontSize = 20.sp)
        Text(title, fontSize = 14.sp)

    }
}

@Preview
@Composable
fun PreviewCardLight(){
    FirstJetpackTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}
@Preview
@Composable
fun PreviewCardDark(){
    FirstJetpackTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}
