package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Camera-switch-fill`: ImageVector
    get() {
        if (`_camera-switch-fill` != null) {
            return `_camera-switch-fill`!!
        }
        `_camera-switch-fill` = Builder(name = "Camera-switch-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(14.6839f, 18.3677f)
                lineTo(13.7892f, 16.5785f)
                curveTo(13.2509f, 16.8482f, 12.6432f, 17.0f, 12.0f, 17.0f)
                curveTo(9.7909f, 17.0f, 8.0f, 15.2091f, 8.0f, 13.0f)
                horizontalLineTo(10.0f)
                lineTo(7.8387f, 8.6775f)
                curveTo(6.7052f, 9.769f, 6.0f, 11.3021f, 6.0f, 13.0f)
                curveTo(6.0f, 16.3137f, 8.6863f, 19.0f, 12.0f, 19.0f)
                curveTo(12.9647f, 19.0f, 13.8763f, 18.7723f, 14.6839f, 18.3677f)
                close()
                moveTo(9.3161f, 7.6323f)
                lineTo(10.2108f, 9.4215f)
                curveTo(10.7491f, 9.1518f, 11.3568f, 9.0f, 12.0f, 9.0f)
                curveTo(14.2091f, 9.0f, 16.0f, 10.7909f, 16.0f, 13.0f)
                horizontalLineTo(14.0f)
                lineTo(16.1613f, 17.3225f)
                curveTo(17.2948f, 16.231f, 18.0f, 14.6979f, 18.0f, 13.0f)
                curveTo(18.0f, 9.6863f, 15.3137f, 7.0f, 12.0f, 7.0f)
                curveTo(11.0353f, 7.0f, 10.1237f, 7.2277f, 9.3161f, 7.6323f)
                close()
            }
        }
        .build()
        return `_camera-switch-fill`!!
    }

private var `_camera-switch-fill`: ImageVector? = null
