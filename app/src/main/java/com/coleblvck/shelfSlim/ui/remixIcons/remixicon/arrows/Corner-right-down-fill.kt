package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-right-down-fill`: ImageVector
    get() {
        if (`_corner-right-down-fill` != null) {
            return `_corner-right-down-fill`!!
        }
        `_corner-right-down-fill` = Builder(name = "Corner-right-down-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9999f, 4.9999f)
                lineTo(5.0f, 4.9998f)
                lineTo(5.0f, 6.9998f)
                lineTo(11.9999f, 6.9999f)
                lineTo(12.0f, 14.5859f)
                horizontalLineTo(6.5858f)
                lineTo(13.0f, 21.0001f)
                lineTo(19.4142f, 14.5859f)
                lineTo(14.0f, 14.5859f)
                lineTo(13.9999f, 4.9999f)
                close()
            }
        }
        .build()
        return `_corner-right-down-fill`!!
    }

private var `_corner-right-down-fill`: ImageVector? = null
