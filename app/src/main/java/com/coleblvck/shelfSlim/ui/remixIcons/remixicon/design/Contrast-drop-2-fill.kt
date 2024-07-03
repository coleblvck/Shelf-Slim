package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Contrast-drop-2-fill`: ImageVector
    get() {
        if (`_contrast-drop-2-fill` != null) {
            return `_contrast-drop-2-fill`!!
        }
        `_contrast-drop-2-fill` = Builder(name = "Contrast-drop-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 6.6329f)
                lineTo(12.0f, 0.2689f)
                lineTo(18.364f, 6.6329f)
                curveTo(21.8787f, 10.1476f, 21.8787f, 15.8461f, 18.364f, 19.3608f)
                curveTo(14.8492f, 22.8755f, 9.1508f, 22.8755f, 5.636f, 19.3608f)
                curveTo(2.1213f, 15.8461f, 2.1213f, 10.1476f, 5.636f, 6.6329f)
                horizontalLineTo(5.636f)
                close()
                moveTo(12.0f, 3.0973f)
                lineTo(7.0503f, 8.0471f)
                curveTo(5.7835f, 9.3139f, 5.0f, 11.0638f, 5.0f, 12.9968f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 11.0638f, 18.2165f, 9.3139f, 16.9497f, 8.0471f)
                lineTo(12.0f, 3.0973f)
                close()
            }
        }
        .build()
        return `_contrast-drop-2-fill`!!
    }

private var `_contrast-drop-2-fill`: ImageVector? = null
