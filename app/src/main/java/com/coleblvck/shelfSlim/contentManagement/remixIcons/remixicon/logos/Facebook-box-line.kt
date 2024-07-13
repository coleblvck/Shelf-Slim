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

public val LogosGroup.`Facebook-box-line`: ImageVector
    get() {
        if (`_facebook-box-line` != null) {
            return `_facebook-box-line`!!
        }
        `_facebook-box-line` = Builder(name = "Facebook-box-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.3458f)
                curveTo(12.0f, 9.0085f, 12.1392f, 8.5236f, 12.4007f, 8.0347f)
                curveTo(12.6622f, 7.5458f, 13.0458f, 7.1622f, 13.5347f, 6.9007f)
                curveTo(13.9174f, 6.696f, 14.3922f, 6.5725f, 15.2217f, 6.5195f)
                curveTo(15.551f, 6.4985f, 15.9771f, 6.5253f, 16.5f, 6.6f)
                verticalLineTo(8.5f)
                horizontalLineTo(16.0f)
                curveTo(15.0827f, 8.5f, 14.7042f, 8.5433f, 14.4779f, 8.6643f)
                curveTo(14.3376f, 8.7394f, 14.2394f, 8.8376f, 14.1643f, 8.9779f)
                curveTo(14.0433f, 9.2042f, 14.0f, 9.4285f, 14.0f, 10.3458f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
            }
        }
        .build()
        return `_facebook-box-line`!!
    }

private var `_facebook-box-line`: ImageVector? = null
