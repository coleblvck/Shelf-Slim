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

public val OthersGroup.`Tree-fill`: ImageVector
    get() {
        if (`_tree-fill` != null) {
            return `_tree-fill`!!
        }
        `_tree-fill` = Builder(name = "Tree-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveTo(18.0f, 7.2624f, 17.9832f, 7.5209f, 17.9505f, 7.7744f)
                curveTo(19.7712f, 8.8046f, 21.0f, 10.7588f, 21.0f, 13.0f)
                curveTo(21.0f, 16.3137f, 18.3137f, 19.0f, 15.0f, 19.0f)
                curveTo(14.2987f, 19.0f, 13.6256f, 18.8797f, 13.0f, 18.6586f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.4003f)
                curveTo(10.2499f, 18.7837f, 9.4002f, 19.0f, 8.5f, 19.0f)
                curveTo(5.4624f, 19.0f, 3.0f, 16.5376f, 3.0f, 13.5f)
                curveTo(3.0f, 12.0474f, 3.5631f, 10.7263f, 4.483f, 9.7432f)
                curveTo(4.8773f, 10.8232f, 5.4974f, 11.7944f, 6.2858f, 12.5989f)
                lineTo(7.7142f, 11.1991f)
                curveTo(6.9907f, 10.4607f, 6.457f, 9.5377f, 6.1906f, 8.5069f)
                curveTo(6.0661f, 8.0254f, 6.0f, 7.5204f, 6.0f, 7.0f)
                curveTo(6.0f, 3.6863f, 8.6863f, 1.0f, 12.0f, 1.0f)
                curveTo(15.3137f, 1.0f, 18.0f, 3.6863f, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_tree-fill`!!
    }

private var `_tree-fill`: ImageVector? = null
