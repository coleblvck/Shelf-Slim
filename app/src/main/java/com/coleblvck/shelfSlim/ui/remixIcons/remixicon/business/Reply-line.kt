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

public val BusinessGroup.`Reply-line`: ImageVector
    get() {
        if (`_reply-line` != null) {
            return `_reply-line`!!
        }
        `_reply-line` = Builder(name = "Reply-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineTo(1.0f, 12.0f)
                lineTo(11.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.5228f, 9.0f, 21.0f, 13.4772f, 21.0f, 19.0f)
                curveTo(21.0f, 19.2727f, 20.9891f, 19.5428f, 20.9677f, 19.81f)
                curveTo(19.5055f, 17.0364f, 16.6381f, 15.119f, 13.313f, 15.0053f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(10.9999f)
                lineTo(11.0f, 20.0f)
                close()
                moveTo(8.9999f, 13.0f)
                horizontalLineTo(10.9999f)
                lineTo(13.0341f, 13.0003f)
                lineTo(13.3814f, 13.0065f)
                curveTo(14.6657f, 13.0504f, 15.9053f, 13.3165f, 17.0568f, 13.7734f)
                curveTo(15.5898f, 12.0749f, 13.4204f, 11.0f, 11.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.1613f)
                lineTo(4.2016f, 12.0f)
                lineTo(8.9999f, 15.8387f)
                lineTo(8.9999f, 13.0f)
                close()
            }
        }
        .build()
        return `_reply-line`!!
    }

private var `_reply-line`: ImageVector? = null
