package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-right-up-fill`: ImageVector
    get() {
        if (`_corner-right-up-fill` != null) {
            return `_corner-right-up-fill`!!
        }
        `_corner-right-up-fill` = Builder(name = "Corner-right-up-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9999f, 19.0001f)
                lineTo(5.0f, 19.0002f)
                lineTo(5.0f, 17.0002f)
                lineTo(11.9999f, 17.0001f)
                lineTo(12.0f, 9.4141f)
                horizontalLineTo(6.5858f)
                lineTo(13.0f, 2.9999f)
                lineTo(19.4142f, 9.4141f)
                lineTo(14.0f, 9.4141f)
                lineTo(13.9999f, 19.0001f)
                close()
            }
        }
        .build()
        return `_corner-right-up-fill`!!
    }

private var `_corner-right-up-fill`: ImageVector? = null
