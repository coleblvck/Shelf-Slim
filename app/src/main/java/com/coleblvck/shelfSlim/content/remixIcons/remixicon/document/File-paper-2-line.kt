package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-paper-2-line`: ImageVector
    get() {
        if (`_file-paper-2-line` != null) {
            return `_file-paper-2-line`!!
        }
        `_file-paper-2-line` = Builder(name = "File-paper-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(21.6569f, 2.0f, 23.0f, 3.3431f, 23.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.6569f, 19.6569f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 22.0f, 1.0f, 20.6569f, 1.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.5128f, 17.386f, 19.9355f, 17.8834f, 19.9933f)
                lineTo(18.0f, 20.0f)
                curveTo(18.5128f, 20.0f, 18.9355f, 19.614f, 18.9933f, 19.1166f)
                lineTo(19.0f, 19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4872f, 4.0f, 5.0645f, 4.386f, 5.0067f, 4.8834f)
                lineTo(5.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.3431f, 4.3432f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_file-paper-2-line`!!
    }

private var `_file-paper-2-line`: ImageVector? = null
