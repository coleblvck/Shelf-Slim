package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Netflix-fill`: ImageVector
    get() {
        if (`_netflix-fill` != null) {
            return `_netflix-fill`!!
        }
        `_netflix-fill` = Builder(name = "Netflix-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2917f, 3.8142f)
                lineTo(13.3102f, 9.5208f)
                lineTo(13.7059f, 10.6371f)
                lineTo(13.7132f, 5.8263f)
                lineTo(13.7222f, 1.0091f)
                horizontalLineTo(17.9931f)
                lineTo(18.0004f, 11.8713f)
                curveTo(18.0031f, 17.8519f, 17.9967f, 22.7617f, 17.9849f, 22.7708f)
                curveTo(17.9731f, 22.7798f, 17.7762f, 22.7708f, 17.5493f, 22.7435f)
                curveTo(16.5601f, 22.6256f, 15.2596f, 22.5076f, 14.2096f, 22.4622f)
                curveTo(13.8629f, 22.4459f, 13.5761f, 22.4277f, 13.5725f, 22.4241f)
                curveTo(13.5698f, 22.4205f, 13.3002f, 21.6618f, 12.7966f, 20.2397f)
                lineTo(12.7967f, 20.2359f)
                curveTo(12.3051f, 18.8476f, 11.5851f, 16.8121f, 10.653f, 14.1746f)
                lineTo(10.3126f, 13.2214f)
                lineTo(10.3054f, 17.8066f)
                curveTo(10.299f, 22.1718f, 10.2954f, 22.4168f, 10.2482f, 22.4168f)
                curveTo(10.0849f, 22.4168f, 8.6782f, 22.5076f, 8.2081f, 22.553f)
                curveTo(7.8995f, 22.5802f, 7.2824f, 22.6437f, 6.8377f, 22.6982f)
                curveTo(6.3921f, 22.749f, 6.0219f, 22.7835f, 6.0146f, 22.7762f)
                curveTo(6.0073f, 22.7689f, 6.001f, 17.8674f, 6.001f, 11.8831f)
                verticalLineTo(1.0018f)
                horizontalLineTo(6.0061f)
                lineTo(6.0055f, 1.0f)
                horizontalLineTo(10.2936f)
                lineTo(10.3217f, 1.0808f)
                curveTo(10.3288f, 1.0956f, 10.3865f, 1.2564f, 10.479f, 1.5168f)
                lineTo(11.1204f, 3.2952f)
                lineTo(11.2928f, 3.7907f)
                lineTo(11.2917f, 3.8142f)
                close()
            }
        }
        .build()
        return `_netflix-fill`!!
    }

private var `_netflix-fill`: ImageVector? = null
