package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-right-down-line`: ImageVector
    get() {
        if (`_arrow-right-down-line` != null) {
            return `_arrow-right-down-line`!!
        }
        `_arrow-right-down-line` = Builder(name = "Arrow-right-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5895f, 16.0032f)
                lineTo(5.9829f, 7.3966f)
                lineTo(7.3971f, 5.9824f)
                lineTo(16.0037f, 14.589f)
                verticalLineTo(7.0032f)
                horizontalLineTo(18.0037f)
                verticalLineTo(18.0032f)
                horizontalLineTo(7.0037f)
                verticalLineTo(16.0032f)
                horizontalLineTo(14.5895f)
                close()
            }
        }
        .build()
        return `_arrow-right-down-line`!!
    }

private var `_arrow-right-down-line`: ImageVector? = null
