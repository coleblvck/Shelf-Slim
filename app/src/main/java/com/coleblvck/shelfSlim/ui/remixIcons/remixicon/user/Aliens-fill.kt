package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Aliens-fill`: ImageVector
    get() {
        if (`_aliens-fill` != null) {
            return `_aliens-fill`!!
        }
        `_aliens-fill` = Builder(name = "Aliens-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.6944f, 2.0f, 20.5f, 5.8056f, 20.5f, 10.5f)
                curveTo(20.5f, 17.0f, 15.0f, 22.5f, 12.0f, 22.5f)
                curveTo(9.0f, 22.5f, 3.5f, 17.0f, 3.5f, 10.5f)
                curveTo(3.5f, 5.8056f, 7.3056f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(15.0147f, 12.0f, 13.0f, 14.0147f, 13.0f, 16.5f)
                curveTo(13.0f, 16.6603f, 13.0084f, 16.8186f, 13.0252f, 16.9752f)
                curveTo(13.1812f, 16.9916f, 13.3396f, 17.0f, 13.5f, 17.0f)
                curveTo(15.9853f, 17.0f, 18.0f, 14.9853f, 18.0f, 12.5f)
                curveTo(18.0f, 12.3396f, 17.9916f, 12.1812f, 17.9746f, 12.0247f)
                curveTo(17.8186f, 12.0084f, 17.6603f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(6.3396f, 12.0f, 6.1812f, 12.0084f, 6.0248f, 12.0252f)
                curveTo(6.0084f, 12.1812f, 6.0f, 12.3396f, 6.0f, 12.5f)
                curveTo(6.0f, 14.9853f, 8.0147f, 17.0f, 10.5f, 17.0f)
                curveTo(10.6603f, 17.0f, 10.8186f, 16.9916f, 10.9753f, 16.9746f)
                curveTo(10.9916f, 16.8186f, 11.0f, 16.6603f, 11.0f, 16.5f)
                curveTo(11.0f, 14.0147f, 8.9853f, 12.0f, 6.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_aliens-fill`!!
    }

private var `_aliens-fill`: ImageVector? = null
