package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Focus-3-fill`: ImageVector
    get() {
        if (`_focus-3-fill` != null) {
            return `_focus-3-fill`!!
        }
        `_focus-3-fill` = Builder(name = "Focus-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                lineTo(13.001f, 4.062f)
                curveTo(16.6192f, 4.5136f, 19.4869f, 7.3816f, 19.9381f, 11.0f)
                lineTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(19.938f, 13.001f)
                curveTo(19.4864f, 16.6189f, 16.6189f, 19.4864f, 13.001f, 19.938f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 19.9381f)
                curveTo(7.3816f, 19.4869f, 4.5136f, 16.6192f, 4.062f, 13.001f)
                lineTo(1.0f, 13.0f)
                verticalLineTo(11.0f)
                lineTo(4.0619f, 11.0f)
                curveTo(4.5131f, 7.3813f, 7.3813f, 4.5131f, 11.0f, 4.0619f)
                lineTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_focus-3-fill`!!
    }

private var `_focus-3-fill`: ImageVector? = null
