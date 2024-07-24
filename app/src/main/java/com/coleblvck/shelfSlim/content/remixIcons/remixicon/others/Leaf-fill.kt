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

public val OthersGroup.`Leaf-fill`: ImageVector
    get() {
        if (`_leaf-fill` != null) {
            return `_leaf-fill`!!
        }
        `_leaf-fill` = Builder(name = "Leaf-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(20.998f, 14.6274f, 15.6255f, 19.0f, 8.998f, 19.0f)
                lineTo(7.0964f, 18.9999f)
                curveTo(7.3079f, 15.9876f, 8.2454f, 14.1648f, 10.6939f, 11.9989f)
                curveTo(11.8979f, 10.9338f, 11.7965f, 10.3189f, 11.2029f, 10.6721f)
                curveTo(7.1193f, 13.1016f, 5.0911f, 16.3862f, 5.0012f, 21.6302f)
                lineTo(4.9981f, 22.0f)
                horizontalLineTo(2.998f)
                curveTo(2.998f, 20.6373f, 3.1138f, 19.3997f, 3.3438f, 18.2682f)
                curveTo(3.1133f, 16.9741f, 2.998f, 15.2176f, 2.998f, 13.0f)
                curveTo(2.998f, 7.4771f, 7.4752f, 3.0f, 12.998f, 3.0f)
                curveTo(14.998f, 3.0f, 16.998f, 4.0f, 20.998f, 3.0f)
                close()
            }
        }
        .build()
        return `_leaf-fill`!!
    }

private var `_leaf-fill`: ImageVector? = null
