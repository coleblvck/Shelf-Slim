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

public val ArrowsGroup.`Expand-diagonal-s-2-line`: ImageVector
    get() {
        if (`_expand-diagonal-s-2-line` != null) {
            return `_expand-diagonal-s-2-line`!!
        }
        `_expand-diagonal-s-2-line` = Builder(name = "Expand-diagonal-s-2-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.4142f)
                verticalLineTo(12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 5.0f)
                lineTo(12.0f, 5.0f)
                verticalLineTo(7.0f)
                lineTo(8.4142f, 7.0f)
                lineTo(17.0f, 15.5858f)
                verticalLineTo(12.0f)
                lineTo(19.0f, 12.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.5858f)
                lineTo(7.0f, 8.4142f)
                close()
            }
        }
        .build()
        return `_expand-diagonal-s-2-line`!!
    }

private var `_expand-diagonal-s-2-line`: ImageVector? = null
