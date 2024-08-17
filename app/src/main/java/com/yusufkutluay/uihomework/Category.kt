package com.yusufkutluay.uihomework

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufkutluay.uihomework.ui.theme.CardColors1
import com.yusufkutluay.uihomework.ui.theme.moderustic

@Composable
fun Category(image : Int,categoryName : String,darkTheme: Boolean = isSystemInDarkTheme()){

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp


    Box(
        modifier = Modifier
            .height((screenHeight / 5).dp)
            .padding(16.dp)
    ) {

        Card(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size((screenWidth-100).dp)
                .align(Alignment.TopStart)
                .padding(start = (screenWidth / 9).dp)
            ,shape = RoundedCornerShape(20.dp)
        ) {
            Text(categoryName, fontWeight = FontWeight.Bold, fontFamily = moderustic, fontSize = 19.sp,
                color = if (darkTheme) Color.Gray else CardColors1,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (screenWidth / 6).dp, top = (screenWidth/7).dp)
            )
        }
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            modifier = Modifier
                .size((screenWidth/3).dp)
                .clip(RoundedCornerShape(100.dp))
                .align(Alignment.CenterStart),
            contentScale = ContentScale.Crop
        )
    }
}
