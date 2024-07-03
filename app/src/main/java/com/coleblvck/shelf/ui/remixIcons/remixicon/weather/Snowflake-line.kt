package com.coleblvck.shelf.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Snowflake-line`: ImageVector
    get() {
        if (`_snowflake-line` != null) {
            return `_snowflake-line`!!
        }
        `_snowflake-line` = Builder(name = "Snowflake-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 3.2981f)
                lineTo(14.4451f, 1.6679f)
                lineTo(15.5545f, 3.332f)
                lineTo(12.9998f, 5.0352f)
                verticalLineTo(10.2678f)
                lineTo(17.5313f, 7.6515f)
                lineTo(17.7289f, 4.5875f)
                lineTo(19.7247f, 4.7162f)
                lineTo(19.5356f, 7.649f)
                lineTo(22.17f, 8.9516f)
                lineTo(21.2836f, 10.7444f)
                lineTo(18.5313f, 9.3835f)
                lineTo(14.0001f, 11.9996f)
                lineTo(18.5317f, 14.616f)
                lineTo(21.284f, 13.2551f)
                lineTo(22.1704f, 15.0479f)
                lineTo(19.536f, 16.3505f)
                lineTo(19.7251f, 19.2833f)
                lineTo(17.7293f, 19.412f)
                lineTo(17.5317f, 16.348f)
                lineTo(12.9998f, 13.7315f)
                verticalLineTo(18.9648f)
                lineTo(15.5545f, 20.6679f)
                lineTo(14.4451f, 22.332f)
                lineTo(11.9998f, 20.7018f)
                lineTo(9.5545f, 22.332f)
                lineTo(8.4451f, 20.6679f)
                lineTo(10.9998f, 18.9648f)
                verticalLineTo(13.7319f)
                lineTo(6.4679f, 16.3484f)
                lineTo(6.2703f, 19.4124f)
                lineTo(4.2744f, 19.2836f)
                lineTo(4.4636f, 16.3508f)
                lineTo(1.8291f, 15.0483f)
                lineTo(2.7155f, 13.2554f)
                lineTo(5.4679f, 14.6163f)
                lineTo(10.0001f, 11.9996f)
                lineTo(5.4682f, 9.3832f)
                lineTo(2.7159f, 10.7441f)
                lineTo(1.8295f, 8.9512f)
                lineTo(4.4639f, 7.6486f)
                lineTo(4.2748f, 4.7158f)
                lineTo(6.2706f, 4.5871f)
                lineTo(6.4682f, 7.6511f)
                lineTo(10.9998f, 10.2674f)
                verticalLineTo(5.0352f)
                lineTo(8.4451f, 3.332f)
                lineTo(9.5545f, 1.6679f)
                lineTo(11.9998f, 3.2981f)
                close()
            }
        }
        .build()
        return `_snowflake-line`!!
    }

private var `_snowflake-line`: ImageVector? = null
