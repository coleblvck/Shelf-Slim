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

public val SystemGroup.`Menu-fold-3-line`: ImageVector
    get() {
        if (`_menu-fold-3-line` != null) {
            return `_menu-fold-3-line`!!
        }
        `_menu-fold-3-line` = Builder(name = "Menu-fold-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.0104f, 8.8141f)
                lineTo(7.5962f, 7.3999f)
                lineTo(3.0f, 11.9961f)
                lineTo(7.5962f, 16.5923f)
                lineTo(9.0104f, 15.1781f)
                lineTo(5.8284f, 11.9961f)
                lineTo(9.0104f, 8.8141f)
                close()
            }
        }
        .build()
        return `_menu-fold-3-line`!!
    }

private var `_menu-fold-3-line`: ImageVector? = null
