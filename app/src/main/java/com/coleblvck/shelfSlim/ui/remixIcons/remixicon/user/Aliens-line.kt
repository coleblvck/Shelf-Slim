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

public val UserGroup.`Aliens-line`: ImageVector
    get() {
        if (`_aliens-line` != null) {
            return `_aliens-line`!!
        }
        `_aliens-line` = Builder(name = "Aliens-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 4.0f)
                curveTo(8.4101f, 4.0f, 5.5f, 6.9102f, 5.5f, 10.5f)
                curveTo(5.5f, 15.2938f, 9.665f, 20.5f, 12.0f, 20.5f)
                curveTo(14.335f, 20.5f, 18.5f, 15.2938f, 18.5f, 10.5f)
                curveTo(18.5f, 6.9102f, 15.5899f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(17.6603f, 11.0f, 17.8186f, 11.0084f, 17.9746f, 11.0247f)
                curveTo(17.9916f, 11.1812f, 18.0f, 11.3396f, 18.0f, 11.5f)
                curveTo(18.0f, 13.9853f, 15.9853f, 16.0f, 13.5f, 16.0f)
                curveTo(13.3396f, 16.0f, 13.1812f, 15.9916f, 13.0252f, 15.9752f)
                curveTo(13.0084f, 15.8186f, 13.0f, 15.6603f, 13.0f, 15.5f)
                curveTo(13.0f, 13.0147f, 15.0147f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(8.9853f, 11.0f, 11.0f, 13.0147f, 11.0f, 15.5f)
                curveTo(11.0f, 15.6603f, 10.9916f, 15.8186f, 10.9753f, 15.9746f)
                curveTo(10.8186f, 15.9916f, 10.6603f, 16.0f, 10.5f, 16.0f)
                curveTo(8.0147f, 16.0f, 6.0f, 13.9853f, 6.0f, 11.5f)
                curveTo(6.0f, 11.3396f, 6.0084f, 11.1812f, 6.0248f, 11.0252f)
                curveTo(6.1812f, 11.0084f, 6.3396f, 11.0f, 6.5f, 11.0f)
                close()
            }
        }
        .build()
        return `_aliens-line`!!
    }

private var `_aliens-line`: ImageVector? = null
