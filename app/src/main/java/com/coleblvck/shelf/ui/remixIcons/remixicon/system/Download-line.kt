package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Download-line`: ImageVector
    get() {
        if (`_download-line` != null) {
            return `_download-line`!!
        }
        `_download-line` = Builder(name = "Download-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(13.0f, 13.1716f)
                lineTo(19.0711f, 7.1005f)
                lineTo(20.4853f, 8.5147f)
                lineTo(12.0f, 17.0f)
                lineTo(3.5147f, 8.5147f)
                lineTo(4.9289f, 7.1005f)
                lineTo(11.0f, 13.1716f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.1716f)
                close()
            }
        }
        .build()
        return `_download-line`!!
    }

private var `_download-line`: ImageVector? = null
