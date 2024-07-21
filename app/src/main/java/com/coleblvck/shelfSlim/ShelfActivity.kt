package com.coleblvck.shelfSlim

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModelProvider
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.userPreferences.shelfDataStore
import com.coleblvck.shelfSlim.state.ShelfViewModel
import com.coleblvck.shelfSlim.state.UserPreferencesViewModel
import com.coleblvck.shelfSlim.state.WidgetDataProvider
import com.coleblvck.shelfSlim.userInterface.theme.ShelfTheme

class ShelfActivity : ComponentActivity() {
    private lateinit var shelfViewModel: ShelfViewModel
    private lateinit var userPreferencesViewModel: UserPreferencesViewModel

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val warehouse = Warehouse(this)
        shelfViewModel = ViewModelProvider(this, ShelfViewModel.Factory(warehouse, Shelf.get()))[ShelfViewModel::class.java]
        userPreferencesViewModel = ViewModelProvider(this, UserPreferencesViewModel.Factory(this.shelfDataStore, warehouse))[UserPreferencesViewModel::class.java]
        setContent {
            ShelfTheme {
                Scaffold(
                    containerColor = Color.Transparent,
                ) { contentPadding ->
                    WidgetDataProvider(widgetsState = shelfViewModel.widgetsState) {
                        ShelfLauncher(
                            modifier = Modifier.padding(contentPadding),
                            desktopState = shelfViewModel.desktopState,
                            flowPagerState = shelfViewModel.flowPagerState,
                            pagesPagerState = shelfViewModel.pagesPagerState,
                            userPreferences = userPreferencesViewModel.userPreferences,
                            userPreferencesToolBox = userPreferencesViewModel.userPreferencesToolBox,
                            customFunctionToolBox = shelfViewModel.customFunctionToolBox,
                        )
                    }
                }
            }
        }
    }
}