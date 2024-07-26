package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Douban-line`: ImageVector
    get() {
        if (`_douban-line` != null) {
            return `_douban-line`!!
        }
        `_douban-line` = Builder(name = "Douban-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2735f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.3764f)
                lineTo(16.0767f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.6123f)
                lineTo(6.8f, 16.5f)
                lineTo(8.7021f, 15.882f)
                lineTo(9.7152f, 19.0f)
                horizontalLineTo(13.9738f)
                lineTo(15.2735f, 15.0f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(7.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_douban-line`!!
    }

private var `_douban-line`: ImageVector? = null