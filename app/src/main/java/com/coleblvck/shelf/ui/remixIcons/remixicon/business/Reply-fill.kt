package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Reply-fill`: ImageVector
    get() {
        if (`_reply-fill` != null) {
            return `_reply-fill`!!
        }
        `_reply-fill` = Builder(name = "Reply-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineTo(1.0f, 12.0f)
                lineTo(11.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.5228f, 9.0f, 21.0f, 13.4772f, 21.0f, 19.0f)
                curveTo(21.0f, 19.2729f, 20.9891f, 19.5433f, 20.9676f, 19.8107f)
                curveTo(19.4605f, 16.9502f, 16.458f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_reply-fill`!!
    }

private var `_reply-fill`: ImageVector? = null
