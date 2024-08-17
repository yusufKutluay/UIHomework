package com.yusufkutluay.uihomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufkutluay.uihomework.ui.theme.CardColors1
import com.yusufkutluay.uihomework.ui.theme.CardColors2
import com.yusufkutluay.uihomework.ui.theme.CardColors3
import com.yusufkutluay.uihomework.ui.theme.CardColors4
import com.yusufkutluay.uihomework.ui.theme.Category
import com.yusufkutluay.uihomework.ui.theme.UIHomeworkTheme
import com.yusufkutluay.uihomework.ui.theme.YaziRenk
import com.yusufkutluay.uihomework.ui.theme.dancing_script
import com.yusufkutluay.uihomework.ui.theme.moderustic

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIHomeworkTheme {
                HomePage()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(darkTheme: Boolean = isSystemInDarkTheme()) {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = stringResource(R.string.topbar_name), fontFamily = moderustic, fontSize = 25.sp)},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = if(darkTheme) CardColors3 else CardColors1,
                    titleContentColor = if(darkTheme) Color.White else YaziRenk
                ))
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Category(image = R.drawable.kadin, categoryName = stringResource(R.string.kategory_kadin))
            Category(image = R.drawable.erkek, categoryName = stringResource(R.string.kategory_erkek))
            Category(image = R.drawable.cocuk, categoryName = stringResource(R.string.kategory_cocuk))
            Category(image = R.drawable.ev_yasam, categoryName = stringResource(R.string.kategory_ev))

            Text(text = stringResource(R.string.aciklama), modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontFamily = dancing_script
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UIHomeworkTheme {
        HomePage()
    }
}