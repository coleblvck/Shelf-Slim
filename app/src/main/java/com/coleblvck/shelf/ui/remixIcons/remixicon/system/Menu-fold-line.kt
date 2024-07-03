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

public val SystemGroup.`Menu-fold-line`: ImageVector
    get() {
        if (`_menu-fold-line` != null) {
            return `_menu-fold-line`!!
        }
        `_menu-fold-line` = Builder(name = "Menu-fold-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.9995f)
                verticalLineTo(19.9995f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.9995f)
                horizontalLineTo(21.0f)
                close()
                moveTo(6.5962f, 3.9033f)
                lineTo(8.0104f, 5.3175f)
                lineTo(4.8284f, 8.4995f)
                lineTo(8.0104f, 11.6815f)
                lineTo(6.5962f, 13.0957f)
                lineTo(2.0f, 8.4995f)
                lineTo(6.5962f, 3.9033f)
                close()
                moveTo(21.0f, 10.9995f)
                verticalLineTo(12.9995f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.9995f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 3.9995f)
                verticalLineTo(5.9995f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.9995f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_menu-fold-line`!!
    }

private var `_menu-fold-line`: ImageVector? = null
