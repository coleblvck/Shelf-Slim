package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Cloud-line`: ImageVector
    get() {
        if (`_cloud-line` != null) {
            return `_cloud-line`!!
        }
        `_cloud-line` = Builder(name = "Cloud-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 9.1135f, 18.9973f, 9.2264f, 18.992f, 9.3386f)
                curveTo(21.3265f, 10.16f, 23.0f, 12.3846f, 23.0f, 15.0f)
                curveTo(23.0f, 18.3137f, 20.3137f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.6863f, 21.0f, 1.0f, 18.3137f, 1.0f, 15.0f)
                curveTo(1.0f, 12.3846f, 2.6735f, 10.16f, 5.008f, 9.3386f)
                curveTo(5.0027f, 9.2264f, 5.0f, 9.1135f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(9.2386f, 4.0f, 7.0f, 6.2386f, 7.0f, 9.0f)
                curveTo(7.0f, 9.0815f, 7.0019f, 9.1626f, 7.0058f, 9.2434f)
                lineTo(7.0766f, 10.7309f)
                lineTo(5.6718f, 11.2252f)
                curveTo(4.0844f, 11.7837f, 3.0f, 13.2889f, 3.0f, 15.0f)
                curveTo(3.0f, 17.2091f, 4.7909f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 19.0f, 21.0f, 17.2091f, 21.0f, 15.0f)
                curveTo(21.0f, 12.79f, 19.21f, 11.0f, 17.0f, 11.0f)
                curveTo(15.233f, 11.0f, 13.7337f, 12.1457f, 13.2042f, 13.7347f)
                lineTo(11.3064f, 13.1021f)
                curveTo(12.1005f, 10.7185f, 14.35f, 9.0f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2386f, 14.7614f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_cloud-line`!!
    }

private var `_cloud-line`: ImageVector? = null
