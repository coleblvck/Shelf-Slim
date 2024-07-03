package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Leaf-line`: ImageVector
    get() {
        if (`_leaf-line` != null) {
            return `_leaf-line`!!
        }
        `_leaf-line` = Builder(name = "Leaf-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(20.998f, 14.6274f, 15.6255f, 19.0f, 8.998f, 19.0f)
                lineTo(5.2408f, 18.9999f)
                curveTo(5.0786f, 19.912f, 4.9981f, 20.907f, 4.9981f, 22.0f)
                horizontalLineTo(2.998f)
                curveTo(2.998f, 20.6373f, 3.1138f, 19.3997f, 3.3438f, 18.2682f)
                curveTo(3.1133f, 16.9741f, 2.998f, 15.2176f, 2.998f, 13.0f)
                curveTo(2.998f, 7.4771f, 7.4752f, 3.0f, 12.998f, 3.0f)
                curveTo(14.998f, 3.0f, 16.998f, 4.0f, 20.998f, 3.0f)
                close()
                moveTo(12.998f, 5.0f)
                curveTo(8.5798f, 5.0f, 4.9981f, 8.5817f, 4.9981f, 13.0f)
                curveTo(4.9981f, 13.3624f, 5.0012f, 13.7111f, 5.0076f, 14.0459f)
                curveTo(6.262f, 12.0684f, 8.099f, 10.5048f, 10.5019f, 9.1318f)
                lineTo(11.4942f, 10.8682f)
                curveTo(8.6393f, 12.4996f, 6.7455f, 14.3535f, 5.7733f, 16.9998f)
                lineTo(8.998f, 17.0f)
                curveTo(15.0132f, 17.0f, 18.8692f, 13.0269f, 18.9949f, 5.3877f)
                curveTo(17.6229f, 5.5211f, 16.3481f, 5.436f, 14.7754f, 5.2001f)
                curveTo(13.6243f, 5.0274f, 13.3988f, 5.0f, 12.998f, 5.0f)
                close()
            }
        }
        .build()
        return `_leaf-line`!!
    }

private var `_leaf-line`: ImageVector? = null
