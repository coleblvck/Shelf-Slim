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

public val SystemGroup.`Menu-unfold-2-line`: ImageVector
    get() {
        if (`_menu-unfold-2-line` != null) {
            return `_menu-unfold-2-line`!!
        }
        `_menu-unfold-2-line` = Builder(name = "Menu-unfold-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5956f, 3.9033f)
                lineTo(15.9994f, 8.4995f)
                lineTo(20.5956f, 13.0957f)
                lineTo(22.0098f, 11.6815f)
                lineTo(18.8278f, 8.4995f)
                lineTo(22.0098f, 5.3175f)
                lineTo(20.5956f, 3.9033f)
                close()
                moveTo(21.0f, 19.9995f)
                verticalLineTo(17.9995f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.9995f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.0f, 12.9995f)
                verticalLineTo(10.9995f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.9995f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 5.9995f)
                verticalLineTo(3.9995f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.9995f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_menu-unfold-2-line`!!
    }

private var `_menu-unfold-2-line`: ImageVector? = null
