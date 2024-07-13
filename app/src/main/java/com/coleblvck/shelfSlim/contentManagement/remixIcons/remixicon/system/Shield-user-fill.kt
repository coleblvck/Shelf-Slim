package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Shield-user-fill`: ImageVector
    get() {
        if (`_shield-user-fill` != null) {
            return `_shield-user-fill`!!
        }
        `_shield-user-fill` = Builder(name = "Shield-user-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7831f, 2.826f)
                lineTo(12.0f, 1.0f)
                lineTo(20.2169f, 2.826f)
                curveTo(20.6745f, 2.9277f, 21.0f, 3.3335f, 21.0f, 3.8022f)
                verticalLineTo(13.7889f)
                curveTo(21.0f, 15.795f, 19.9974f, 17.6684f, 18.3282f, 18.7812f)
                lineTo(12.0f, 23.0f)
                lineTo(5.6718f, 18.7812f)
                curveTo(4.0026f, 17.6684f, 3.0f, 15.795f, 3.0f, 13.7889f)
                verticalLineTo(3.8022f)
                curveTo(3.0f, 3.3335f, 3.3255f, 2.9277f, 3.7831f, 2.826f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.3807f, 11.0f, 14.5f, 9.8807f, 14.5f, 8.5f)
                curveTo(14.5f, 7.1193f, 13.3807f, 6.0f, 12.0f, 6.0f)
                curveTo(10.6193f, 6.0f, 9.5f, 7.1193f, 9.5f, 8.5f)
                curveTo(9.5f, 9.8807f, 10.6193f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(7.5275f, 16.0f)
                horizontalLineTo(16.4725f)
                curveTo(16.2238f, 13.75f, 14.3163f, 12.0f, 12.0f, 12.0f)
                curveTo(9.6837f, 12.0f, 7.7762f, 13.75f, 7.5275f, 16.0f)
                close()
            }
        }
        .build()
        return `_shield-user-fill`!!
    }

private var `_shield-user-fill`: ImageVector? = null
