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

public val SystemGroup.`Menu-unfold-3-line`: ImageVector
    get() {
        if (`_menu-unfold-3-line` != null) {
            return `_menu-unfold-3-line`!!
        }
        `_menu-unfold-3-line` = Builder(name = "Menu-unfold-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(15.9896f, 8.8141f)
                lineTo(17.4038f, 7.3999f)
                lineTo(22.0f, 11.9961f)
                lineTo(17.4038f, 16.5923f)
                lineTo(15.9896f, 15.1781f)
                lineTo(19.1716f, 11.9961f)
                lineTo(15.9896f, 8.8141f)
                close()
            }
        }
        .build()
        return `_menu-unfold-3-line`!!
    }

private var `_menu-unfold-3-line`: ImageVector? = null
