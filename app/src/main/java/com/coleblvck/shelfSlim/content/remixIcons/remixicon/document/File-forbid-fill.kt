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

public val DocumentGroup.`File-forbid-fill`: ImageVector
    get() {
        if (`_file-forbid-fill` != null) {
            return `_file-forbid-fill`!!
        }
        `_file-forbid-fill` = Builder(name = "File-forbid-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.6736f)
                curveTo(20.0907f, 11.2417f, 19.0736f, 11.0f, 18.0f, 11.0f)
                curveTo(14.134f, 11.0f, 11.0f, 14.134f, 11.0f, 18.0f)
                curveTo(11.0f, 19.4872f, 11.4638f, 20.8662f, 12.2547f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.445f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(11.6736f)
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
        return `_file-forbid-fill`!!
    }

private var `_file-forbid-fill`: ImageVector? = null
