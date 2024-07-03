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

public val ArrowsGroup.`Corner-down-left-fill`: ImageVector
    get() {
        if (`_corner-down-left-fill` != null) {
            return `_corner-down-left-fill`!!
        }
        `_corner-down-left-fill` = Builder(name = "Corner-down-left-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 13.9999f)
                lineTo(19.0002f, 5.0f)
                lineTo(17.0002f, 5.0f)
                lineTo(17.0001f, 11.9999f)
                lineTo(9.4141f, 11.9999f)
                verticalLineTo(6.5858f)
                lineTo(2.9999f, 13.0f)
                lineTo(9.4141f, 19.4142f)
                lineTo(9.4141f, 13.9999f)
                lineTo(19.0001f, 13.9999f)
                close()
            }
        }
        .build()
        return `_corner-down-left-fill`!!
    }

private var `_corner-down-left-fill`: ImageVector? = null
