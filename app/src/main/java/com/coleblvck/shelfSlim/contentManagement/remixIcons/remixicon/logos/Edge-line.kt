package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Edge-line`: ImageVector
    get() {
        if (`_edge-line` != null) {
            return `_edge-line`!!
        }
        `_edge-line` = Builder(name = "Edge-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0078f, 14.0012f)
                curveTo(8.0033f, 14.0837f, 8.001f, 14.1666f, 8.001f, 14.25f)
                curveTo(8.001f, 16.6319f, 9.7536f, 19.0f, 13.001f, 19.0f)
                curveTo(15.3739f, 19.0f, 17.5285f, 18.345f, 19.001f, 17.4465f)
                verticalLineTo(20.7972f)
                curveTo(17.2123f, 21.5636f, 15.1135f, 22.0f, 13.001f, 22.0f)
                curveTo(7.499f, 22.0f, 5.001f, 18.5302f, 5.001f, 14.25f)
                curveTo(5.001f, 11.0187f, 7.0423f, 8.2493f, 9.9438f, 7.086f)
                curveTo(8.54f, 8.6631f, 8.001f, 10.3413f, 8.001f, 10.9952f)
                lineTo(18.001f, 11.0f)
                curveTo(18.001f, 7.5938f, 15.4528f, 5.0f, 12.001f, 5.0f)
                curveTo(7.001f, 5.0f, 3.9997f, 8.9877f, 3.001f, 10.9989f)
                curveTo(3.2906f, 6.2374f, 7.0101f, 2.0f, 12.001f, 2.0f)
                curveTo(17.201f, 2.0f, 21.001f, 6.0294f, 21.001f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.001f)
                lineTo(8.0078f, 14.0012f)
                close()
            }
        }
        .build()
        return `_edge-line`!!
    }

private var `_edge-line`: ImageVector? = null
