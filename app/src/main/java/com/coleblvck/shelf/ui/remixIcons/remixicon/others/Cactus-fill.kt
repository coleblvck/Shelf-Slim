package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Cactus-fill`: ImageVector
    get() {
        if (`_cactus-fill` != null) {
            return `_cactus-fill`!!
        }
        `_cactus-fill` = Builder(name = "Cactus-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.0f)
                curveTo(14.2072f, 2.0f, 15.998f, 3.7909f, 15.998f, 6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.998f)
                curveTo(17.5476f, 15.0f, 17.998f, 14.55f, 17.998f, 14.0f)
                verticalLineTo(8.0f)
                curveTo(17.998f, 7.4477f, 18.4458f, 7.0f, 18.998f, 7.0f)
                curveTo(19.5503f, 7.0f, 19.998f, 7.4477f, 19.998f, 8.0f)
                verticalLineTo(14.0f)
                curveTo(19.998f, 15.6569f, 18.6549f, 17.0f, 16.998f, 17.0f)
                horizontalLineTo(15.998f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.9981f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.9981f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.9981f)
                curveTo(5.3412f, 14.0f, 3.998f, 12.6569f, 3.998f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(3.998f, 8.4477f, 4.4458f, 8.0f, 4.9981f, 8.0f)
                curveTo(5.5503f, 8.0f, 5.9981f, 8.4477f, 5.9981f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(5.9981f, 11.55f, 6.4481f, 12.0f, 6.9981f, 12.0f)
                curveTo(7.3647f, 12.0f, 7.6981f, 12.0f, 7.9981f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(7.9981f, 3.7909f, 9.7889f, 2.0f, 11.998f, 2.0f)
                close()
            }
        }
        .build()
        return `_cactus-fill`!!
    }

private var `_cactus-fill`: ImageVector? = null
