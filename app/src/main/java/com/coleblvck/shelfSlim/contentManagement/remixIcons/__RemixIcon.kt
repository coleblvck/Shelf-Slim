package com.coleblvck.shelfSlim.contentManagement.remixIcons

import androidx.compose.ui.graphics.vector.ImageVector
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Arrows
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Buildings
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Business
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Communication
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Development
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Device
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Document
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Editor
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Finance
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Food
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Health
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Logos
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Map
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Media
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Others
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.User
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Weather
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
