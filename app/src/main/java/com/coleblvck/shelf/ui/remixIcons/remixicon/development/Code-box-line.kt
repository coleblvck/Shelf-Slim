package com.coleblvck.shelf.ui.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Code-box-line`: ImageVector
    get() {
        if (`_code-box-line` != null) {
            return `_code-box-line`!!
        }
        `_code-box-line` = Builder(name = "Code-box-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineTo(16.4645f, 15.5355f)
                lineTo(15.0503f, 14.1213f)
                lineTo(17.1716f, 12.0f)
                lineTo(15.0503f, 9.8787f)
                lineTo(16.4645f, 8.4645f)
                lineTo(20.0f, 12.0f)
                close()
                moveTo(6.8284f, 12.0f)
                lineTo(8.9497f, 14.1213f)
                lineTo(7.5355f, 15.5355f)
                lineTo(4.0f, 12.0f)
                lineTo(7.5355f, 8.4645f)
                lineTo(8.9497f, 9.8787f)
                lineTo(6.8284f, 12.0f)
                close()
                moveTo(11.2443f, 17.0f)
                horizontalLineTo(9.116f)
                lineTo(12.7557f, 7.0f)
                horizontalLineTo(14.884f)
                lineTo(11.2443f, 17.0f)
                close()
            }
        }
        .build()
        return `_code-box-line`!!
    }

private var `_code-box-line`: ImageVector? = null
