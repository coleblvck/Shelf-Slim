package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Thermometer-line`: ImageVector
    get() {
        if (`_thermometer-line` != null) {
            return `_thermometer-line`!!
        }
        `_thermometer-line` = Builder(name = "Thermometer-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5565f, 3.4437f)
                curveTo(22.1186f, 5.0058f, 22.1186f, 7.5384f, 20.5565f, 9.1005f)
                lineTo(12.3563f, 17.3008f)
                curveTo(11.714f, 17.943f, 10.8723f, 18.3476f, 9.9696f, 18.4479f)
                lineTo(6.5909f, 18.8221f)
                lineTo(4.293f, 21.1213f)
                curveTo(3.9025f, 21.5119f, 3.2694f, 21.5119f, 2.8788f, 21.1213f)
                curveTo(2.4883f, 20.7308f, 2.4883f, 20.0976f, 2.8788f, 19.7071f)
                lineTo(5.1769f, 17.4081f)
                lineTo(5.5523f, 14.0306f)
                curveTo(5.6526f, 13.1279f, 6.0572f, 12.2862f, 6.6994f, 11.6439f)
                lineTo(14.8996f, 3.4437f)
                curveTo(16.4617f, 1.8816f, 18.9944f, 1.8816f, 20.5565f, 3.4437f)
                close()
                moveTo(16.3139f, 4.8579f)
                lineTo(8.1136f, 13.0581f)
                curveTo(7.7925f, 13.3792f, 7.5902f, 13.8001f, 7.5401f, 14.2515f)
                lineTo(7.264f, 16.7362f)
                lineTo(9.7487f, 16.4601f)
                curveTo(10.2001f, 16.4099f, 10.6209f, 16.2077f, 10.9421f, 15.8865f)
                lineTo(11.3639f, 15.4641f)
                lineTo(9.9499f, 14.0503f)
                lineTo(11.3641f, 12.6361f)
                lineTo(12.7779f, 14.0501f)
                lineTo(14.1919f, 12.6361f)
                lineTo(12.7783f, 11.2218f)
                lineTo(14.1925f, 9.8076f)
                lineTo(15.6069f, 11.2221f)
                lineTo(17.0209f, 9.8071f)
                lineTo(15.6068f, 8.3934f)
                lineTo(17.021f, 6.9792f)
                lineTo(18.4349f, 8.3931f)
                lineTo(19.1423f, 7.6863f)
                curveTo(19.9233f, 6.9053f, 19.9233f, 5.6389f, 19.1423f, 4.8579f)
                curveTo(18.3612f, 4.0768f, 17.0949f, 4.0768f, 16.3139f, 4.8579f)
                close()
            }
        }
        .build()
        return `_thermometer-line`!!
    }

private var `_thermometer-line`: ImageVector? = null
