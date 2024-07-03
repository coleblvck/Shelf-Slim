package com.coleblvck.shelf.ui.remixIcons

import androidx.compose.ui.graphics.vector.ImageVector
import com.coleblvck.shelf.ui.remixIcons.remixicon.Arrows
import com.coleblvck.shelf.ui.remixIcons.remixicon.Buildings
import com.coleblvck.shelf.ui.remixIcons.remixicon.Business
import com.coleblvck.shelf.ui.remixIcons.remixicon.Communication
import com.coleblvck.shelf.ui.remixIcons.remixicon.Design
import com.coleblvck.shelf.ui.remixIcons.remixicon.Development
import com.coleblvck.shelf.ui.remixIcons.remixicon.Device
import com.coleblvck.shelf.ui.remixIcons.remixicon.Document
import com.coleblvck.shelf.ui.remixIcons.remixicon.Editor
import com.coleblvck.shelf.ui.remixIcons.remixicon.Finance
import com.coleblvck.shelf.ui.remixIcons.remixicon.Food
import com.coleblvck.shelf.ui.remixIcons.remixicon.Health
import com.coleblvck.shelf.ui.remixIcons.remixicon.Logos
import com.coleblvck.shelf.ui.remixIcons.remixicon.Map
import com.coleblvck.shelf.ui.remixIcons.remixicon.Media
import com.coleblvck.shelf.ui.remixIcons.remixicon.Others
import com.coleblvck.shelf.ui.remixIcons.remixicon.RemixIcon
import com.coleblvck.shelf.ui.remixIcons.remixicon.System
import com.coleblvck.shelf.ui.remixIcons.remixicon.User
import com.coleblvck.shelf.ui.remixIcons.remixicon.Weather
import kotlin.collections.List as ____KtList

public object RemixIcon

private var __RemixIcon: ____KtList<ImageVector>? = null

public val RemixIcon.RemixIcon: ____KtList<ImageVector>
  get() {
    if (__RemixIcon != null) {
      return __RemixIcon!!
    }
    __RemixIcon= Design.RemixIcon + Buildings.RemixIcon + Development.RemixIcon +
        Business.RemixIcon + Logos.RemixIcon + Others.RemixIcon + Document.RemixIcon +
        System.RemixIcon + Map.RemixIcon + Food.RemixIcon + Finance.RemixIcon + Device.RemixIcon +
        Weather.RemixIcon + Arrows.RemixIcon + Communication.RemixIcon + Editor.RemixIcon +
        Media.RemixIcon + Health.RemixIcon + User.RemixIcon + listOf()
    return __RemixIcon!!
  }
