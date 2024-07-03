package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Color-filter-fill`: ImageVector
    get() {
        if (`_color-filter-fill` != null) {
            return `_color-filter-fill`!!
        }
        `_color-filter-fill` = Builder(name = "Color-filter-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5717f, 8.0275f)
                curveTo(16.8469f, 7.4078f, 16.9998f, 6.7218f, 16.9998f, 6.0f)
                curveTo(16.9998f, 3.2386f, 14.7612f, 1.0f, 11.9998f, 1.0f)
                curveTo(9.2384f, 1.0f, 6.9998f, 3.2386f, 6.9998f, 6.0f)
                curveTo(6.9998f, 8.5826f, 8.9579f, 10.7079f, 11.4704f, 10.9723f)
                curveTo(12.6858f, 9.2403f, 14.576f, 8.2079f, 16.5717f, 8.0275f)
                close()
                moveTo(13.1542f, 17.9462f)
                curveTo(13.996f, 16.1276f, 14.047f, 13.9741f, 13.1547f, 12.0554f)
                curveTo(14.6399f, 10.0118f, 17.4591f, 9.3788f, 19.6956f, 10.6701f)
                lineTo(19.6957f, 10.67f)
                curveTo(22.0871f, 12.0508f, 22.9064f, 15.1086f, 21.5257f, 17.5f)
                curveTo(20.145f, 19.8915f, 17.087f, 20.7109f, 14.6956f, 19.3302f)
                curveTo(14.0707f, 18.9694f, 13.5532f, 18.4942f, 13.1542f, 17.9462f)
                close()
                moveTo(6.2731f, 10.0269f)
                curveTo(7.4273f, 11.6652f, 9.2667f, 12.786f, 11.3746f, 12.9726f)
                curveTo(12.4016f, 15.2807f, 11.5401f, 18.0388f, 9.3036f, 19.3301f)
                curveTo(6.9121f, 20.7108f, 3.8542f, 19.8914f, 2.4734f, 17.5f)
                curveTo(1.0927f, 15.1085f, 1.9121f, 12.0505f, 4.3036f, 10.6698f)
                curveTo(4.9285f, 10.309f, 5.599f, 10.0984f, 6.2731f, 10.0269f)
                close()
            }
        }
        .build()
        return `_color-filter-fill`!!
    }

private var `_color-filter-fill`: ImageVector? = null
