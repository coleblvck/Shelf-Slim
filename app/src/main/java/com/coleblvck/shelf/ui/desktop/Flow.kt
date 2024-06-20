package com.coleblvck.shelf.ui.desktop

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelf.ui.theme.colorWithAlpha

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Flow(modifier: Modifier) {
    val pagerState = rememberPagerState(
        pageCount = { 3 }
    )
    Box(modifier = modifier) {
        HorizontalPager(state = pagerState) {
            FlowCards.GreetingCard()
        }
    }
}

var hideSystemUI by mutableStateOf(true)

class FlowCards {

    companion object {

        @Composable
        fun GreetingCard() {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                colors = CardDefaults.cardColors(
                    colorWithAlpha(MaterialTheme.colorScheme.tertiary),
                    MaterialTheme.colorScheme.onTertiary,
                    MaterialTheme.colorScheme.tertiary,
                    MaterialTheme.colorScheme.onTertiary
                ),
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "YOLO", fontSize = 60.sp, fontWeight = FontWeight.W900)
                    }

                }
            }
        }
    }
}