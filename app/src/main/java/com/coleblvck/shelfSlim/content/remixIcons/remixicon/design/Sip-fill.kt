package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Sip-fill`: ImageVector
    get() {
        if (`_sip-fill` != null) {
            return `_sip-fill`!!
        }
        `_sip-fill` = Builder(name = "Sip-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9602f, 6.5011f)
                lineTo(16.7886f, 3.6727f)
                curveTo(17.1791f, 3.2821f, 17.8123f, 3.2821f, 18.2028f, 3.6727f)
                lineTo(20.3241f, 5.794f)
                curveTo(20.7146f, 6.1845f, 20.7146f, 6.8177f, 20.3241f, 7.2082f)
                lineTo(17.4957f, 10.0366f)
                lineTo(19.2635f, 11.8044f)
                lineTo(17.8492f, 13.2186f)
                lineTo(10.7782f, 6.1475f)
                lineTo(12.1924f, 4.7333f)
                lineTo(13.9602f, 6.5011f)
                close()
                moveTo(10.7782f, 8.976f)
                lineTo(15.0208f, 13.2186f)
                lineTo(7.2426f, 20.9968f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.7541f)
                lineTo(10.7782f, 8.976f)
                close()
            }
        }
        .build()
        return `_sip-fill`!!
    }

private var `_sip-fill`: ImageVector? = null
