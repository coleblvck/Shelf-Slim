package com.coleblvck.shelfSlim.content.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Graduation-cap-fill`: ImageVector
    get() {
        if (`_graduation-cap-fill` != null) {
            return `_graduation-cap-fill`!!
        }
        `_graduation-cap-fill` = Builder(name = "Graduation-cap-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(0.0f, 9.0f)
                lineTo(12.0f, 16.0f)
                lineTo(22.0f, 10.1667f)
                verticalLineTo(17.5f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(3.999f, 13.4905f)
                verticalLineTo(18.0001f)
                curveTo(5.8234f, 20.429f, 8.7281f, 22.0001f, 11.9998f, 22.0001f)
                curveTo(15.2714f, 22.0001f, 18.1761f, 20.429f, 20.0005f, 18.0001f)
                lineTo(20.0001f, 13.4913f)
                lineTo(12.0003f, 18.1579f)
                lineTo(3.999f, 13.4905f)
                close()
            }
        }
        .build()
        return `_graduation-cap-fill`!!
    }

private var `_graduation-cap-fill`: ImageVector? = null
