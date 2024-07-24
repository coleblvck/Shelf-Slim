package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-diagonal-line`: ImageVector
    get() {
        if (`_expand-diagonal-line` != null) {
            return `_expand-diagonal-line`!!
        }
        `_expand-diagonal-line` = Builder(name = "Expand-diagonal-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5858f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.4142f)
                lineTo(14.7071f, 10.7071f)
                lineTo(13.2929f, 9.2929f)
                lineTo(17.5858f, 5.0f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.5858f)
                lineTo(9.2929f, 13.2929f)
                lineTo(10.7071f, 14.7071f)
                lineTo(6.4142f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_expand-diagonal-line`!!
    }

private var `_expand-diagonal-line`: ImageVector? = null
