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

public val DesignGroup.`Ball-pen-fill`: ImageVector
    get() {
        if (`_ball-pen-fill` != null) {
            return `_ball-pen-fill`!!
        }
        `_ball-pen-fill` = Builder(name = "Ball-pen-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8492f, 11.805f)
                lineTo(17.1421f, 11.0979f)
                lineTo(7.2426f, 20.9974f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.7547f)
                lineTo(14.3137f, 5.441f)
                lineTo(19.9706f, 11.0979f)
                curveTo(20.3611f, 11.4884f, 20.3611f, 12.1216f, 19.9706f, 12.5121f)
                lineTo(12.8995f, 19.5831f)
                lineTo(11.4853f, 18.1689f)
                lineTo(17.8492f, 11.805f)
                close()
                moveTo(18.5563f, 2.6126f)
                lineTo(21.3848f, 5.441f)
                curveTo(21.7753f, 5.8315f, 21.7753f, 6.4647f, 21.3848f, 6.8552f)
                lineTo(19.9706f, 8.2694f)
                lineTo(15.7279f, 4.0268f)
                lineTo(17.1421f, 2.6126f)
                curveTo(17.5327f, 2.2221f, 18.1658f, 2.2221f, 18.5563f, 2.6126f)
                close()
            }
        }
        .build()
        return `_ball-pen-fill`!!
    }

private var `_ball-pen-fill`: ImageVector? = null
