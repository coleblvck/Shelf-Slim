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

public val ArrowsGroup.`Arrow-right-up-line`: ImageVector
    get() {
        if (`_arrow-right-up-line` != null) {
            return `_arrow-right-up-line`!!
        }
        `_arrow-right-up-line` = Builder(name = "Arrow-right-up-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0037f, 9.4142f)
                lineTo(7.3971f, 18.0208f)
                lineTo(5.9829f, 16.6066f)
                lineTo(14.5895f, 8.0f)
                horizontalLineTo(7.0037f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0037f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0037f)
                verticalLineTo(9.4142f)
                close()
            }
        }
        .build()
        return `_arrow-right-up-line`!!
    }

private var `_arrow-right-up-line`: ImageVector? = null
