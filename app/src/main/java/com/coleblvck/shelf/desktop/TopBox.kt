package com.coleblvck.shelf.desktop

import android.app.Activity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelf.ui.theme.colorWithAlpha

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TopBox(modifier: Modifier) {
    val pagerState = rememberPagerState(
        pageCount = { 2 }
    )
    Box(modifier = modifier) {
        HorizontalPager(state = pagerState) {
            TopBoxWidgets().GreetingCard()
            TopBoxWidgets().GreetingCard()
        }
    }
}

class TopBoxWidgets {
    @Composable
    fun GreetingCard() {
        var hideSystemUI by remember {
            mutableStateOf(true)
        }
        val view = LocalView.current
        val window = (view.context as Activity).window
        val insetsController = WindowCompat.getInsetsController(window, window.decorView)
        if (hideSystemUI) {
            insetsController.apply {
                hide(WindowInsetsCompat.Type.systemBars())
                systemBarsBehavior =
                    WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            insetsController.apply { show(WindowInsetsCompat.Type.systemBars()) }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 12.dp),
            colors = CardDefaults.cardColors(
                colorWithAlpha(MaterialTheme.colorScheme.tertiary),
                MaterialTheme.colorScheme.onTertiary,
                MaterialTheme.colorScheme.tertiary,
                MaterialTheme.colorScheme.onTertiary
            )
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hola", fontSize = 60.sp, fontWeight = FontWeight.Bold)

                    IconButton(onClick = {
                        hideSystemUI = !hideSystemUI
                    }) {
                        Icon(
                            modifier = Modifier.size(28.dp),
                            imageVector = (if (hideSystemUI) {
                                Icons.Filled.KeyboardArrowDown
                            } else {
                                Icons.Filled.KeyboardArrowUp
                            }),
                            contentDescription = (if (hideSystemUI) {
                                "Show system UI"
                            } else {
                                "Hide system UI"
                            })
                        )

                    }
                }

            }
        }
    }
}