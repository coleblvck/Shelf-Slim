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

public val DocumentGroup.`File-shred-line`: ImageVector
    get() {
        if (`_file-shred-line` != null) {
            return `_file-shred-line`!!
        }
        `_file-shred-line` = Builder(name = "File-shred-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(4.0f, 12.0f)
                verticalLineTo(2.9954f)
                curveTo(4.0f, 2.4457f, 4.4448f, 2.0f, 4.9956f, 2.0f)
                horizontalLineTo(15.0f)
                lineTo(19.9997f, 7.0f)
                lineTo(20.0f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_file-shred-line`!!
    }

private var `_file-shred-line`: ImageVector? = null