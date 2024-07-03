package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Slice-fill`: ImageVector
    get() {
        if (`_slice-fill` != null) {
            return `_slice-fill`!!
        }
        `_slice-fill` = Builder(name = "Slice-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7678f, 12.2288f)
                lineTo(15.8892f, 14.3501f)
                curveTo(11.293f, 18.9463f, 5.6361f, 20.3605f, 2.1006f, 19.6534f)
                lineTo(17.6569f, 4.0971f)
                lineTo(19.7783f, 6.2184f)
                lineTo(13.7678f, 12.2288f)
                close()
            }
        }
        .build()
        return `_slice-fill`!!
    }

private var `_slice-fill`: ImageVector? = null
