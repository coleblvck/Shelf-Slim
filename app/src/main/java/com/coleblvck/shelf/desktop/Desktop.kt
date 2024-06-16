package com.coleblvck.shelf.desktop

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
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


@Composable
fun Desktop(modifier: Modifier = Modifier) {
    var displayAppDrawer by remember {
        mutableStateOf(false)
    }
    BackHandler {
        displayAppDrawer = false
    }
    val context = LocalContext.current
    fetchApps(context)
    var hideSystemUI by remember {
        mutableStateOf(true)
    }
    val view = LocalView.current
    val window = (view.context as Activity).window
    val insetsController = WindowCompat.getInsetsController(window, window.decorView)
    if (hideSystemUI) {
        insetsController.apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    } else {
        insetsController.apply { show(WindowInsetsCompat.Type.systemBars()) }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Card(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth(),
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
        Card(
            modifier = Modifier
                .height(48.dp)
                .fillMaxWidth(),
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
                IconButton(onClick = { displayAppDrawer = !displayAppDrawer }) {
                    Icon(
                        Icons.Filled.Menu, "Show Apps",
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
            if (displayAppDrawer) {
                Blinds()
            }
        }
    }
}
