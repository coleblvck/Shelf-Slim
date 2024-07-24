package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Reply-all-line`: ImageVector
    get() {
        if (`_reply-all-line` != null) {
            return `_reply-all-line`!!
        }
        `_reply-all-line` = Builder(name = "Reply-all-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                verticalLineTo(9.0f)
                curveTo(19.5228f, 9.0f, 24.0f, 13.4772f, 24.0f, 19.0f)
                curveTo(24.0f, 19.2727f, 23.9891f, 19.5428f, 23.9677f, 19.81f)
                curveTo(22.5055f, 17.0364f, 19.6381f, 15.119f, 16.313f, 15.0053f)
                lineTo(16.0f, 15.0f)
                horizontalLineTo(13.9999f)
                lineTo(14.0f, 19.5f)
                lineTo(6.0f, 12.0f)
                lineTo(14.0f, 4.5f)
                close()
                moveTo(8.0f, 4.5f)
                verticalLineTo(7.237f)
                lineTo(2.92f, 12.0f)
                lineTo(7.999f, 16.761f)
                lineTo(8.0f, 19.5f)
                lineTo(0.0f, 12.0f)
                lineTo(8.0f, 4.5f)
                close()
                moveTo(12.0f, 9.1165f)
                lineTo(8.9242f, 12.0f)
                lineTo(11.9999f, 14.8834f)
                lineTo(11.9999f, 13.0f)
                lineTo(16.0341f, 13.0003f)
                lineTo(16.3814f, 13.0065f)
                curveTo(17.6657f, 13.0504f, 18.9053f, 13.3165f, 20.0568f, 13.7734f)
                curveTo(18.5898f, 12.0749f, 16.4204f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.1165f)
                close()
            }
        }
        .build()
        return `_reply-all-line`!!
    }

private var `_reply-all-line`: ImageVector? = null
