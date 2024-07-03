package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-forbid-line`: ImageVector
    get() {
        if (`_file-forbid-line` != null) {
            return `_file-forbid-line`!!
        }
        `_file-forbid-line` = Builder(name = "File-forbid-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2899f, 20.0f)
                curveTo(11.5049f, 20.7224f, 11.8334f, 21.396f, 12.2547f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.4475f, 2.0f, 3.9985f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(20.9998f, 7.0f)
                verticalLineTo(11.6735f)
                curveTo(20.3781f, 11.3782f, 19.7061f, 11.1719f, 19.0f, 11.0709f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.2899f)
                close()
                moveTo(18.0f, 23.0f)
                curveTo(15.2386f, 23.0f, 13.0f, 20.7614f, 13.0f, 18.0f)
                curveTo(13.0f, 15.2386f, 15.2386f, 13.0f, 18.0f, 13.0f)
                curveTo(20.7614f, 13.0f, 23.0f, 15.2386f, 23.0f, 18.0f)
                curveTo(23.0f, 20.7614f, 20.7614f, 23.0f, 18.0f, 23.0f)
                close()
                moveTo(16.7066f, 20.7076f)
                curveTo(17.0982f, 20.895f, 17.5369f, 21.0f, 18.0f, 21.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                curveTo(21.0f, 17.5369f, 20.895f, 17.0982f, 20.7076f, 16.7066f)
                lineTo(16.7066f, 20.7076f)
                close()
                moveTo(15.2924f, 19.2934f)
                lineTo(19.2934f, 15.2924f)
                curveTo(18.9018f, 15.105f, 18.4631f, 15.0f, 18.0f, 15.0f)
                curveTo(16.3431f, 15.0f, 15.0f, 16.3431f, 15.0f, 18.0f)
                curveTo(15.0f, 18.4631f, 15.105f, 18.9018f, 15.2924f, 19.2934f)
                close()
            }
        }
        .build()
        return `_file-forbid-line`!!
    }

private var `_file-forbid-line`: ImageVector? = null
