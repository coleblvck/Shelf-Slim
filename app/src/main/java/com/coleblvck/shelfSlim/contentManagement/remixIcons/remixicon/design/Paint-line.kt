package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Paint-line`: ImageVector
    get() {
        if (`_paint-line` != null) {
            return `_paint-line`!!
        }
        `_paint-line` = Builder(name = "Paint-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2277f, 18.7323f)
                lineTo(20.9955f, 16.9645f)
                lineTo(22.7632f, 18.7323f)
                curveTo(23.7395f, 19.7086f, 23.7395f, 21.2915f, 22.7632f, 22.2678f)
                curveTo(21.7869f, 23.2441f, 20.204f, 23.2441f, 19.2277f, 22.2678f)
                curveTo(18.2514f, 21.2915f, 18.2514f, 19.7086f, 19.2277f, 18.7323f)
                close()
                moveTo(8.8786f, 1.0797f)
                lineTo(20.1923f, 12.3934f)
                curveTo(20.5828f, 12.7839f, 20.5828f, 13.4171f, 20.1923f, 13.8076f)
                lineTo(11.707f, 22.2929f)
                curveTo(11.3165f, 22.6834f, 10.6833f, 22.6834f, 10.2928f, 22.2929f)
                lineTo(1.8075f, 13.8076f)
                curveTo(1.417f, 13.4171f, 1.417f, 12.7839f, 1.8075f, 12.3934f)
                lineTo(9.5857f, 4.6153f)
                lineTo(7.4644f, 2.4939f)
                lineTo(8.8786f, 1.0797f)
                close()
                moveTo(10.9999f, 6.0295f)
                lineTo(3.9289f, 13.1005f)
                lineTo(10.9999f, 20.1716f)
                lineTo(18.071f, 13.1005f)
                lineTo(10.9999f, 6.0295f)
                close()
            }
        }
        .build()
        return `_paint-line`!!
    }

private var `_paint-line`: ImageVector? = null
