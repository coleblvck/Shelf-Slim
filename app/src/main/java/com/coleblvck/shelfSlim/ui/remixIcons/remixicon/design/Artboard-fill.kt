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

public val DesignGroup.`Artboard-fill`: ImageVector
    get() {
        if (`_artboard-fill` != null) {
            return `_artboard-fill`!!
        }
        `_artboard-fill` = Builder(name = "Artboard-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5858f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.4142f)
                lineTo(18.6569f, 20.2426f)
                lineTo(17.2426f, 21.6569f)
                lineTo(13.0f, 17.4142f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.4142f)
                lineTo(6.7574f, 21.6569f)
                lineTo(5.3432f, 20.2426f)
                lineTo(8.5858f, 17.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 3.0f, 20.0f, 3.4477f, 20.0f, 4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.4477f, 4.4477f, 3.0f, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return `_artboard-fill`!!
    }

private var `_artboard-fill`: ImageVector? = null
