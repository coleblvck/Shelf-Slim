package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Shield-star-fill`: ImageVector
    get() {
        if (`_shield-star-fill` != null) {
            return `_shield-star-fill`!!
        }
        `_shield-star-fill` = Builder(name = "Shield-star-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7831f, 2.826f)
                lineTo(12.0f, 1.0f)
                lineTo(20.2169f, 2.826f)
                curveTo(20.6745f, 2.9277f, 21.0f, 3.3335f, 21.0f, 3.8022f)
                verticalLineTo(13.7889f)
                curveTo(21.0f, 15.795f, 19.9974f, 17.6684f, 18.3282f, 18.7812f)
                lineTo(12.0f, 23.0f)
                lineTo(5.6718f, 18.7812f)
                curveTo(4.0026f, 17.6684f, 3.0f, 15.795f, 3.0f, 13.7889f)
                verticalLineTo(3.8022f)
                curveTo(3.0f, 3.3335f, 3.3255f, 2.9277f, 3.7831f, 2.826f)
                close()
                moveTo(12.0f, 13.5f)
                lineTo(14.9389f, 15.0451f)
                lineTo(14.3776f, 11.7725f)
                lineTo(16.7553f, 9.4549f)
                lineTo(13.4695f, 8.9775f)
                lineTo(12.0f, 6.0f)
                lineTo(10.5305f, 8.9775f)
                lineTo(7.2447f, 9.4549f)
                lineTo(9.6224f, 11.7725f)
                lineTo(9.0611f, 15.0451f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return `_shield-star-fill`!!
    }

private var `_shield-star-fill`: ImageVector? = null
