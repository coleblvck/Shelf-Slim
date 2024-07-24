package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Menu-fold-2-fill`: ImageVector
    get() {
        if (`_menu-fold-2-fill` != null) {
            return `_menu-fold-2-fill`!!
        }
        `_menu-fold-2-fill` = Builder(name = "Menu-fold-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.5f)
                lineTo(9.0f, 8.4995f)
                lineTo(4.0f, 13.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(21.0f, 19.9995f)
                verticalLineTo(17.9995f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.9995f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 12.9995f)
                verticalLineTo(10.9995f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.9995f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 5.9995f)
                verticalLineTo(3.9995f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.9995f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_menu-fold-2-fill`!!
    }

private var `_menu-fold-2-fill`: ImageVector? = null
