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

public val MediaGroup.`Volume-down-line`: ImageVector
    get() {
        if (`_volume-down-line` != null) {
            return `_volume-down-line`!!
        }
        `_volume-down-line` = Builder(name = "Volume-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.2205f)
                lineTo(9.6028f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.6028f)
                lineTo(13.0f, 16.7795f)
                verticalLineTo(7.2205f)
                close()
                moveTo(8.8889f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 16.0f, 4.0f, 15.5523f, 4.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 8.4477f, 4.4477f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(8.8889f)
                lineTo(14.1834f, 3.6681f)
                curveTo(14.3971f, 3.4933f, 14.7121f, 3.5248f, 14.887f, 3.7385f)
                curveTo(14.9601f, 3.8278f, 15.0f, 3.9397f, 15.0f, 4.0551f)
                verticalLineTo(19.9449f)
                curveTo(15.0f, 20.221f, 14.7761f, 20.4449f, 14.5f, 20.4449f)
                curveTo(14.3846f, 20.4449f, 14.2727f, 20.405f, 14.1834f, 20.3319f)
                lineTo(8.8889f, 16.0f)
                close()
                moveTo(18.8631f, 16.5911f)
                lineTo(17.4411f, 15.169f)
                curveTo(18.3892f, 14.4376f, 19.0f, 13.2901f, 19.0f, 12.0f)
                curveTo(19.0f, 10.5697f, 18.2493f, 9.3147f, 17.1203f, 8.6076f)
                lineTo(18.5589f, 7.169f)
                curveTo(20.0396f, 8.2616f, 21.0f, 10.0187f, 21.0f, 12.0f)
                curveTo(21.0f, 13.8422f, 20.1698f, 15.4904f, 18.8631f, 16.5911f)
                close()
            }
        }
        .build()
        return `_volume-down-line`!!
    }

private var `_volume-down-line`: ImageVector? = null
