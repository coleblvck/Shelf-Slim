package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Navigation-line`: ImageVector
    get() {
        if (`_navigation-line` != null) {
            return `_navigation-line`!!
        }
        `_navigation-line` = Builder(name = "Navigation-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9649f, 5.0963f)
                lineTo(8.5107f, 17.5066f)
                lineTo(11.5514f, 11.4253f)
                lineTo(17.188f, 9.1706f)
                lineTo(4.9649f, 5.0963f)
                close()
                moveTo(2.8995f, 2.2996f)
                lineTo(21.7052f, 8.5682f)
                curveTo(21.9672f, 8.6555f, 22.1088f, 8.9387f, 22.0215f, 9.2006f)
                curveTo(21.975f, 9.3402f, 21.8694f, 9.4521f, 21.7328f, 9.5068f)
                lineTo(13.0002f, 12.9998f)
                lineTo(8.575f, 21.8501f)
                curveTo(8.4515f, 22.0971f, 8.1512f, 22.1972f, 7.9042f, 22.0737f)
                curveTo(7.7788f, 22.011f, 7.6855f, 21.8986f, 7.647f, 21.7639f)
                lineTo(2.2606f, 2.9113f)
                curveTo(2.1847f, 2.6458f, 2.3385f, 2.369f, 2.604f, 2.2932f)
                curveTo(2.7009f, 2.2655f, 2.8039f, 2.2677f, 2.8995f, 2.2996f)
                close()
            }
        }
        .build()
        return `_navigation-line`!!
    }

private var `_navigation-line`: ImageVector? = null
