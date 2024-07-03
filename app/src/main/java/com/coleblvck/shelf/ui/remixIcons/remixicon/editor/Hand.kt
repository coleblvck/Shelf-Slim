package com.coleblvck.shelf.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5002f, 2.0f)
                curveTo(12.2241f, 2.0f, 12.0002f, 2.2239f, 12.0002f, 2.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0002f)
                verticalLineTo(4.5f)
                curveTo(10.0002f, 4.2239f, 9.7763f, 4.0f, 9.5002f, 4.0f)
                curveTo(9.224f, 4.0f, 9.0002f, 4.2239f, 9.0002f, 4.5f)
                verticalLineTo(14.0f)
                curveTo(8.6465f, 14.0f, 7.0002f, 14.0f, 7.0002f, 14.0f)
                curveTo(6.6191f, 12.3792f, 5.6424f, 11.4407f, 4.5954f, 11.3216f)
                curveTo(4.8793f, 12.0664f, 5.3612f, 13.2592f, 6.1663f, 15.0995f)
                curveTo(7.0251f, 17.0622f, 7.8913f, 18.5218f, 9.0037f, 19.4986f)
                curveTo(10.0783f, 20.442f, 11.4586f, 21.0f, 13.5002f, 21.0f)
                curveTo(16.5378f, 21.0f, 19.0002f, 18.5377f, 19.0002f, 15.5002f)
                verticalLineTo(7.0f)
                curveTo(19.0002f, 6.7239f, 18.7763f, 6.5f, 18.5002f, 6.5f)
                curveTo(18.2241f, 6.5f, 18.0002f, 6.7239f, 18.0002f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0002f)
                verticalLineTo(4.0f)
                curveTo(16.0002f, 3.7239f, 15.7763f, 3.5f, 15.5002f, 3.5f)
                curveTo(15.2241f, 3.5f, 15.0002f, 3.7239f, 15.0002f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0002f)
                verticalLineTo(2.5f)
                curveTo(13.0002f, 2.2239f, 12.7763f, 2.0f, 12.5002f, 2.0f)
                close()
                moveTo(21.0002f, 15.5002f)
                curveTo(21.0002f, 19.6424f, 17.6423f, 23.0f, 13.5002f, 23.0f)
                curveTo(11.0417f, 23.0f, 9.1721f, 22.308f, 7.6842f, 21.0015f)
                curveTo(6.2341f, 19.7283f, 5.2253f, 17.9381f, 4.3341f, 15.9012f)
                curveTo(3.4039f, 13.7753f, 2.89f, 12.4804f, 2.6099f, 11.7235f)
                curveTo(2.2532f, 10.7597f, 2.7462f, 9.4121f, 4.0858f, 9.3185f)
                curveTo(5.2408f, 9.2377f, 6.2206f, 9.6125f, 7.0002f, 10.2587f)
                verticalLineTo(4.5f)
                curveTo(7.0002f, 3.1193f, 8.1195f, 2.0f, 9.5002f, 2.0f)
                curveTo(9.6852f, 2.0f, 9.8655f, 2.0201f, 10.0391f, 2.0582f)
                curveTo(10.2477f, 0.8882f, 11.2702f, 0.0f, 12.5002f, 0.0f)
                curveTo(13.5602f, 0.0f, 14.4661f, 0.6597f, 14.8298f, 1.5909f)
                curveTo(15.0431f, 1.5317f, 15.268f, 1.5f, 15.5002f, 1.5f)
                curveTo(16.8809f, 1.5f, 18.0002f, 2.6193f, 18.0002f, 4.0f)
                verticalLineTo(4.55f)
                curveTo(18.1618f, 4.5172f, 18.329f, 4.5f, 18.5002f, 4.5f)
                curveTo(19.8809f, 4.5f, 21.0002f, 5.6193f, 21.0002f, 7.0f)
                verticalLineTo(15.5002f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
