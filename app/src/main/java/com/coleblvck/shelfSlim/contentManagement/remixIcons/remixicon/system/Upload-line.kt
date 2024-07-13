package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Upload-line`: ImageVector
    get() {
        if (`_upload-line` != null) {
            return `_upload-line`!!
        }
        `_upload-line` = Builder(name = "Upload-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.0f, 5.8284f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.8284f)
                lineTo(4.9289f, 11.8995f)
                lineTo(3.5147f, 10.4853f)
                lineTo(12.0f, 2.0f)
                lineTo(20.4853f, 10.4853f)
                lineTo(19.0711f, 11.8995f)
                lineTo(13.0f, 5.8284f)
                close()
            }
        }
        .build()
        return `_upload-line`!!
    }

private var `_upload-line`: ImageVector? = null
