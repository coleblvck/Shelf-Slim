package com.coleblvck.shelfSlim.ui.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(8.dp))
}

@Composable
fun VerticalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(8.dp))
}