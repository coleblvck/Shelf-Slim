package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Menu-search-fill`: ImageVector
    get() {
        if (`_menu-search-fill` != null) {
            return `_menu-search-fill`!!
        }
        `_menu-search-fill` = Builder(name = "Menu-search-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6175f, 13.0317f)
                curveTo(17.7315f, 13.6424f, 16.6575f, 14.0f, 15.5f, 14.0f)
                curveTo(12.4624f, 14.0f, 10.0f, 11.5376f, 10.0f, 8.5f)
                curveTo(10.0f, 5.4624f, 12.4624f, 3.0f, 15.5f, 3.0f)
                curveTo(18.5376f, 3.0f, 21.0f, 5.4624f, 21.0f, 8.5f)
                curveTo(21.0f, 9.6575f, 20.6424f, 10.7315f, 20.0317f, 11.6175f)
                lineTo(22.7071f, 14.2929f)
                lineTo(21.2929f, 15.7071f)
                lineTo(18.6175f, 13.0317f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_menu-search-fill`!!
    }

private var `_menu-search-fill`: ImageVector? = null
