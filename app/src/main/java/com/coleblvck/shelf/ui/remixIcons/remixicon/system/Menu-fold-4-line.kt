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

public val SystemGroup.`Menu-fold-4-line`: ImageVector
    get() {
        if (`_menu-fold-4-line` != null) {
            return `_menu-fold-4-line`!!
        }
        `_menu-fold-4-line` = Builder(name = "Menu-fold-4-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9997f, 4.0f)
                horizontalLineTo(6.9997f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.9997f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.9997f, 11.0f)
                horizontalLineTo(10.9997f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.9997f)
                verticalLineTo(11.0f)
                close()
                moveTo(20.9997f, 18.0f)
                horizontalLineTo(6.9997f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.9997f)
                verticalLineTo(18.0f)
                close()
                moveTo(1.9893f, 8.8141f)
                lineTo(3.4035f, 7.3999f)
                lineTo(7.9997f, 11.9961f)
                lineTo(3.4035f, 16.5923f)
                lineTo(1.9893f, 15.1781f)
                lineTo(5.1712f, 11.9961f)
                lineTo(1.9893f, 8.8141f)
                close()
            }
        }
        .build()
        return `_menu-fold-4-line`!!
    }

private var `_menu-fold-4-line`: ImageVector? = null
