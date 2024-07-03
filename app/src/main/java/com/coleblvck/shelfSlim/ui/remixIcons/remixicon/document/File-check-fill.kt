package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-check-fill`: ImageVector
    get() {
        if (`_file-check-fill` != null) {
            return `_file-check-fill`!!
        }
        `_file-check-fill` = Builder(name = "File-check-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9998f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.9985f)
                curveTo(3.4475f, 2.0f, 3.0f, 2.4441f, 3.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(3.0f, 21.5447f, 3.4448f, 22.0f, 3.9934f, 22.0f)
                horizontalLineTo(12.3414f)
                curveTo(12.1203f, 21.3744f, 12.0f, 20.7013f, 12.0f, 20.0f)
                curveTo(12.0f, 16.6863f, 14.6863f, 14.0f, 18.0f, 14.0f)
                curveTo(19.0928f, 14.0f, 20.1174f, 14.2922f, 20.9999f, 14.8026f)
                lineTo(20.9998f, 7.0f)
                close()
                moveTo(14.4646f, 19.4647f)
                lineTo(18.0001f, 23.0002f)
                lineTo(22.9498f, 18.0505f)
                lineTo(21.5356f, 16.6362f)
                lineTo(18.0001f, 20.1718f)
                lineTo(15.8788f, 18.0505f)
                lineTo(14.4646f, 19.4647f)
                close()
            }
        }
        .build()
        return `_file-check-fill`!!
    }

private var `_file-check-fill`: ImageVector? = null
