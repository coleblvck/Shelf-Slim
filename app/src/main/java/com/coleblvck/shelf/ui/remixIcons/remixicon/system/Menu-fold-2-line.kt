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

public val SystemGroup.`Menu-fold-2-line`: ImageVector
    get() {
        if (`_menu-fold-2-line` != null) {
            return `_menu-fold-2-line`!!
        }
        `_menu-fold-2-line` = Builder(name = "Menu-fold-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.4035f, 3.9033f)
                lineTo(2.9893f, 5.3175f)
                lineTo(6.1712f, 8.4995f)
                lineTo(2.9893f, 11.6815f)
                lineTo(4.4035f, 13.0957f)
                lineTo(8.9997f, 8.4995f)
                lineTo(4.4035f, 3.9033f)
                close()
                moveTo(20.9997f, 19.9995f)
                verticalLineTo(17.9995f)
                horizontalLineTo(2.9997f)
                verticalLineTo(19.9995f)
                horizontalLineTo(20.9997f)
                close()
                moveTo(20.9997f, 12.9995f)
                verticalLineTo(10.9995f)
                horizontalLineTo(11.9997f)
                verticalLineTo(12.9995f)
                horizontalLineTo(20.9997f)
                close()
                moveTo(20.9997f, 5.9995f)
                verticalLineTo(3.9995f)
                horizontalLineTo(11.9997f)
                verticalLineTo(5.9995f)
                horizontalLineTo(20.9997f)
                close()
            }
        }
        .build()
        return `_menu-fold-2-line`!!
    }

private var `_menu-fold-2-line`: ImageVector? = null
