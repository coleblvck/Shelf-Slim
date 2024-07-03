package com.coleblvck.shelfSlim

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.coleblvck.shelfSlim.ui.ShelfViewModel
import com.coleblvck.shelfSlim.ui.theme.ShelfTheme
import com.coleblvck.shelfSlim.utils.DeviceAppsChangedListener
import com.coleblvck.shelfSlim.utils.DeviceAppsChangedListenerInterface

class ShelfActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(navigationBarStyle = SystemBarStyle.dark(scrim = Color.Transparent.toArgb()))
        val shelfViewModel = ShelfViewModel()
        shelfViewModel.initContext(this)
        appViewModel = shelfViewModel
        val appsChangedListener = DeviceAppsChangedListener(UpdateHandler)
        appsChangedListener.register(this)


        setContent {
            ShelfTheme {
                Scaffold(
                    modifier = Modifier.systemBarsPadding(),
                    containerColor = Color.Transparent
                ) { contentPadding ->
                    ShelfLauncher(
                        shelfViewModel = shelfViewModel,
                        modifier = Modifier.padding(contentPadding)
                    )
                }
            }
        }
    }



    companion object {
        lateinit var appViewModel: ShelfViewModel

    }

    object UpdateHandler: DeviceAppsChangedListenerInterface {
        override fun onPackageInstalled(packageName: String?) {
            appViewModel.updateShelfApps()
        }

        override fun onPackageUpdated(packageName: String?) {
            appViewModel.updateShelfApps()
        }

        override fun onPackageUninstalled(packageName: String?) {
            appViewModel.updateShelfApps()
        }

        override fun onPackageChanged(packageName: String?) {
            appViewModel.updateShelfApps()
        }
    }
}

