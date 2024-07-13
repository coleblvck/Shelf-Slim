package com.coleblvck.shelfSlim

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.coleblvck.shelfSlim.state.ShelfViewModel
import com.coleblvck.shelfSlim.state.WidgetDataProvider
import com.coleblvck.shelfSlim.userInterface.theme.ShelfTheme

class ShelfActivity : ComponentActivity() {

    private val shelfViewModel: ShelfViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shelfViewModel.initialize(this)
        setContent {
            ShelfTheme {
                Scaffold(
                    containerColor = Color.Transparent,
                ) { contentPadding ->
                    WidgetDataProvider(widgetsState = shelfViewModel.widgetsState) {
                        ShelfLauncher(
                            shelfViewModel = shelfViewModel,
                            modifier = Modifier.padding(contentPadding),
                        )
                    }
                }
            }
        }
    }
}