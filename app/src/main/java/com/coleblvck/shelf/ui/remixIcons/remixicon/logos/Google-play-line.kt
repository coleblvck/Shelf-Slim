package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Google-play-line`: ImageVector
    get() {
        if (`_google-play-line` != null) {
            return `_google-play-line`!!
        }
        `_google-play-line` = Builder(name = "Google-play-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.001f, 1.7344f)
                curveTo(4.1769f, 1.7344f, 4.3498f, 1.7808f, 4.502f, 1.869f)
                lineTo(20.5061f, 11.1345f)
                curveTo(20.9841f, 11.4112f, 21.1473f, 12.023f, 20.8705f, 12.501f)
                curveTo(20.783f, 12.6522f, 20.6574f, 12.7778f, 20.5061f, 12.8654f)
                lineTo(4.502f, 22.1309f)
                curveTo(4.0241f, 22.4076f, 3.4123f, 22.2445f, 3.1356f, 21.7665f)
                curveTo(3.0474f, 21.6143f, 3.001f, 21.4414f, 3.001f, 21.2655f)
                verticalLineTo(2.7344f)
                curveTo(3.001f, 2.1821f, 3.4487f, 1.7344f, 4.001f, 1.7344f)
                close()
                moveTo(12.2931f, 13.4132f)
                lineTo(7.795f, 17.9124f)
                lineTo(13.494f, 14.6134f)
                lineTo(12.2931f, 13.4132f)
                close()
                moveTo(5.0f, 6.1194f)
                verticalLineTo(17.8784f)
                lineTo(10.8791f, 11.9992f)
                lineTo(5.0f, 6.1194f)
                close()
                moveTo(15.284f, 10.4214f)
                lineTo(13.7071f, 11.9992f)
                lineTo(15.285f, 13.5764f)
                lineTo(18.009f, 11.9999f)
                lineTo(15.284f, 10.4214f)
                close()
                moveTo(7.794f, 6.0854f)
                lineTo(12.2931f, 10.5852f)
                lineTo(13.493f, 9.3844f)
                lineTo(7.794f, 6.0854f)
                close()
            }
        }
        .build()
        return `_google-play-line`!!
    }

private var `_google-play-line`: ImageVector? = null
