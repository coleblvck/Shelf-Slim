package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Rocket-fill`: ImageVector
    get() {
        if (`_rocket-fill` != null) {
            return `_rocket-fill`!!
        }
        `_rocket-fill` = Builder(name = "Rocket-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3305f, 15.9288f)
                curveTo(5.115f, 14.9914f, 5.0005f, 14.0103f, 5.0005f, 12.9999f)
                curveTo(5.0005f, 7.912f, 7.9032f, 3.5636f, 12.0005f, 1.818f)
                curveTo(16.0979f, 3.5636f, 19.0005f, 7.912f, 19.0005f, 12.9999f)
                curveTo(19.0005f, 14.0103f, 18.8861f, 14.9914f, 18.6706f, 15.9288f)
                lineTo(20.6907f, 17.7245f)
                curveTo(20.8704f, 17.8842f, 20.9109f, 18.1493f, 20.7872f, 18.3555f)
                lineTo(18.33f, 22.4508f)
                curveTo(18.1879f, 22.6876f, 17.8808f, 22.7644f, 17.644f, 22.6223f)
                curveTo(17.609f, 22.6013f, 17.5766f, 22.576f, 17.5477f, 22.5471f)
                lineTo(15.2934f, 20.2928f)
                curveTo(15.1059f, 20.1053f, 14.8515f, 19.9999f, 14.5863f, 19.9999f)
                horizontalLineTo(9.4148f)
                curveTo(9.1495f, 19.9999f, 8.8952f, 20.1053f, 8.7077f, 20.2928f)
                lineTo(6.4534f, 22.5471f)
                curveTo(6.2581f, 22.7424f, 5.9415f, 22.7424f, 5.7463f, 22.5471f)
                curveTo(5.7174f, 22.5182f, 5.6921f, 22.4859f, 5.6711f, 22.4508f)
                lineTo(3.2139f, 18.3555f)
                curveTo(3.0901f, 18.1493f, 3.1307f, 17.8842f, 3.3104f, 17.7245f)
                lineTo(5.3305f, 15.9288f)
                close()
                moveTo(12.0005f, 12.9999f)
                curveTo(13.1051f, 12.9999f, 14.0005f, 12.1045f, 14.0005f, 10.9999f)
                curveTo(14.0005f, 9.8954f, 13.1051f, 8.9999f, 12.0005f, 8.9999f)
                curveTo(10.896f, 8.9999f, 10.0005f, 9.8954f, 10.0005f, 10.9999f)
                curveTo(10.0005f, 12.1045f, 10.896f, 12.9999f, 12.0005f, 12.9999f)
                close()
            }
        }
        .build()
        return `_rocket-fill`!!
    }

private var `_rocket-fill`: ImageVector? = null
