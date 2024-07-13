package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-copy-2-line`: ImageVector
    get() {
        if (`_file-copy-2-line` != null) {
            return `_file-copy-2-line`!!
        }
        `_file-copy-2-line` = Builder(name = "File-copy-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9998f, 6.0f)
                verticalLineTo(3.0f)
                curveTo(6.9998f, 2.4477f, 7.4475f, 2.0f, 7.9998f, 2.0f)
                horizontalLineTo(19.9998f)
                curveTo(20.5521f, 2.0f, 20.9998f, 2.4477f, 20.9998f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(20.9998f, 17.5523f, 20.5521f, 18.0f, 19.9998f, 18.0f)
                horizontalLineTo(16.9998f)
                verticalLineTo(20.9991f)
                curveTo(16.9998f, 21.5519f, 16.5499f, 22.0f, 15.993f, 22.0f)
                horizontalLineTo(4.0067f)
                curveTo(3.4506f, 22.0f, 3.0f, 21.5554f, 3.0f, 20.9991f)
                lineTo(3.0026f, 7.0009f)
                curveTo(3.0027f, 6.4481f, 3.4526f, 6.0f, 4.0094f, 6.0f)
                horizontalLineTo(6.9998f)
                close()
                moveTo(5.0024f, 8.0f)
                lineTo(5.0002f, 20.0f)
                horizontalLineTo(14.9998f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0024f)
                close()
                moveTo(8.9998f, 6.0f)
                horizontalLineTo(16.9998f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.9998f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.9998f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_file-copy-2-line`!!
    }

private var `_file-copy-2-line`: ImageVector? = null
