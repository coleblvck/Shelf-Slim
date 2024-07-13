package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-up-right-fill`: ImageVector
    get() {
        if (`_corner-up-right-fill` != null) {
            return `_corner-up-right-fill`!!
        }
        `_corner-up-right-fill` = Builder(name = "Corner-up-right-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9999f, 10.0001f)
                lineTo(4.9998f, 19.0f)
                lineTo(6.9998f, 19.0f)
                lineTo(6.9999f, 12.0001f)
                lineTo(14.5859f, 12.0f)
                verticalLineTo(17.4142f)
                lineTo(21.0001f, 11.0f)
                lineTo(14.5859f, 4.5858f)
                lineTo(14.5859f, 10.0f)
                lineTo(4.9999f, 10.0001f)
                close()
            }
        }
        .build()
        return `_corner-up-right-fill`!!
    }

private var `_corner-up-right-fill`: ImageVector? = null
