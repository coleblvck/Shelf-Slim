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
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetToolProvider
import com.coleblvck.shelfSlim.ui.theme.ShelfTheme

class ShelfActivity : ComponentActivity() {
    private lateinit var shelfViewModel: ShelfViewModel
    private lateinit var userPreferencesViewModel: UserPreferencesViewModel

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val shelf = Shelf.get()
        val warehouse = Warehouse(shelf)
        shelfViewModel = ViewModelProvider(this, ShelfViewModel.Factory(warehouse, shelf))[ShelfViewModel::class.java]
        userPreferencesViewModel = ViewModelProvider(this, UserPreferencesViewModel.Factory(this.applicationContext.shelfDataStore, warehouse))[UserPreferencesViewModel::class.java]
        setContent {
            ShelfTheme {
                Scaffold(
                    containerColor = Color.Transparent,
                ) { contentPadding ->
                    WidgetToolProvider {
                        ShelfLauncher(
                            modifier = Modifier.padding(contentPadding),
                            desktopState = shelfViewModel.desktopState,
                            flowPagerState = shelfViewModel.flowPagerState,
                            pagesPagerState = shelfViewModel.pagesPagerState,
                            userPreferencesToolBox = userPreferencesViewModel.userPreferencesToolBox,
                            customDashboardActionToolBox = shelfViewModel.customDashboardActionToolBox,
                            widgetToolBox = shelfViewModel.widgetToolBox
                        )
                    }
                }
            }
        }
    }
}