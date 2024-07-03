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

public val DesignGroup.`Paint-brush-fill`: ImageVector
    get() {
        if (`_paint-brush-fill` != null) {
            return `_paint-brush-fill`!!
        }
        `_paint-brush-fill` = Builder(name = "Paint-brush-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.9967f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.9967f, 21.0f, 3.4444f, 21.0f, 3.9967f)
                verticalLineTo(8.9967f)
                curveTo(21.0f, 9.549f, 20.5523f, 9.9967f, 20.0f, 9.9967f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 9.9967f, 3.0f, 9.549f, 3.0f, 8.9967f)
                verticalLineTo(3.9967f)
                curveTo(3.0f, 3.4444f, 3.4477f, 2.9967f, 4.0f, 2.9967f)
                close()
                moveTo(6.0f, 11.9967f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 11.9967f, 13.0f, 12.4444f, 13.0f, 12.9967f)
                verticalLineTo(15.9967f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.9967f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.9967f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.9967f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 13.9967f, 4.0f, 13.549f, 4.0f, 12.9967f)
                verticalLineTo(10.9967f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.9967f)
                close()
                moveTo(17.7322f, 13.7289f)
                lineTo(19.5f, 11.9612f)
                lineTo(21.2678f, 13.7289f)
                curveTo(22.2441f, 14.7052f, 22.2441f, 16.2882f, 21.2678f, 17.2645f)
                curveTo(20.2915f, 18.2408f, 18.7085f, 18.2408f, 17.7322f, 17.2645f)
                curveTo(16.7559f, 16.2882f, 16.7559f, 14.7052f, 17.7322f, 13.7289f)
                close()
            }
        }
        .build()
        return `_paint-brush-fill`!!
    }

private var `_paint-brush-fill`: ImageVector? = null
