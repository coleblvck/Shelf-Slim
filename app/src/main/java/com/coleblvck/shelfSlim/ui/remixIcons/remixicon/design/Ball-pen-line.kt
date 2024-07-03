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

public val DesignGroup.`Ball-pen-line`: ImageVector
    get() {
        if (`_ball-pen-line` != null) {
            return `_ball-pen-line`!!
        }
        `_ball-pen-line` = Builder(name = "Ball-pen-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8492f, 11.6983f)
                lineTo(17.1421f, 10.9912f)
                lineTo(7.2426f, 20.8907f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.648f)
                lineTo(14.3137f, 5.3343f)
                lineTo(19.9706f, 10.9912f)
                curveTo(20.3611f, 11.3817f, 20.3611f, 12.0149f, 19.9706f, 12.4054f)
                lineTo(12.8995f, 19.4765f)
                lineTo(11.4853f, 18.0622f)
                lineTo(17.8492f, 11.6983f)
                close()
                moveTo(15.7279f, 9.577f)
                lineTo(14.3137f, 8.1627f)
                lineTo(5.0f, 17.4765f)
                verticalLineTo(18.8907f)
                horizontalLineTo(6.4142f)
                lineTo(15.7279f, 9.577f)
                close()
                moveTo(18.5563f, 2.5059f)
                lineTo(21.3848f, 5.3343f)
                curveTo(21.7753f, 5.7248f, 21.7753f, 6.358f, 21.3848f, 6.7485f)
                lineTo(19.9706f, 8.1627f)
                lineTo(15.7279f, 3.9201f)
                lineTo(17.1421f, 2.5059f)
                curveTo(17.5327f, 2.1154f, 18.1658f, 2.1154f, 18.5563f, 2.5059f)
                close()
            }
        }
        .build()
        return `_ball-pen-line`!!
    }

private var `_ball-pen-line`: ImageVector? = null
