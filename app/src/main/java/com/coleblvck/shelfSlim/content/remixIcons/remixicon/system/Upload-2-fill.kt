package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Upload-2-fill`: ImageVector
    get() {
        if (`_upload-2-fill` != null) {
            return `_upload-2-fill`!!
        }
        `_upload-2-fill` = Builder(name = "Upload-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(14.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 2.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_upload-2-fill`!!
    }

private var `_upload-2-fill`: ImageVector? = null