package com.coleblvck.shelf.desktop

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Menu
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelf.content.fetchApps
import com.coleblvck.shelf.content.showAppDrawer
import com.coleblvck.shelf.ui.theme.colorWithAlpha


var appDrawerDisplayed by mutableStateOf(false)


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Desktop(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    fetchApps(context)
    BackHandler {
        appDrawerDisplayed = false
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        TopBox(
            modifier =
            Modifier
                .weight(1f)
                .fillMaxWidth()
        )
        Card(
            modifier = Modifier
                .height(48.dp)
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            colors = CardDefaults.cardColors(
                colorWithAlpha(MaterialTheme.colorScheme.primary),
                MaterialTheme.colorScheme.onPrimary,
                MaterialTheme.colorScheme.primary,
                MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box {

                }
                IconButton(onClick = { appDrawerDisplayed = !appDrawerDisplayed }) {
                    Icon(
                        if (appDrawerDisplayed) {
                            Icons.Filled.ArrowBack
                        } else {
                            Icons.Filled.Menu
                        },
                        "Show Apps",
                        modifier = Modifier.size(32.dp),
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .weight(2F)
                .fillMaxWidth()
        ) {
            Drawer()
        }
    }
}
