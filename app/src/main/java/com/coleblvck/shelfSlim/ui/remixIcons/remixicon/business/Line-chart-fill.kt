package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Line-chart-fill`: ImageVector
    get() {
        if (`_line-chart-fill` != null) {
            return `_line-chart-fill`!!
        }
        `_line-chart-fill` = Builder(name = "Line-chart-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.9393f, 5.9393f)
                lineTo(22.0607f, 8.0607f)
                lineTo(16.0f, 14.1213f)
                lineTo(13.0f, 11.121f)
                lineTo(9.0607f, 15.0607f)
                lineTo(6.9393f, 12.9393f)
                lineTo(13.0f, 6.8787f)
                lineTo(16.0f, 9.879f)
                lineTo(19.9393f, 5.9393f)
                close()
            }
        }
        .build()
        return `_line-chart-fill`!!
    }

private var `_line-chart-fill`: ImageVector? = null
