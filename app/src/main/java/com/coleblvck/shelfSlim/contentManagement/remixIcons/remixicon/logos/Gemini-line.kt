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

public val LogosGroup.`Gemini-line`: ImageVector
    get() {
        if (`_gemini-line` != null) {
            return `_gemini-line`!!
        }
        `_gemini-line` = Builder(name = "Gemini-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1244f, 1.0909f)
                horizontalLineTo(12.8753f)
                lineTo(12.9269f, 1.9453f)
                curveTo(13.2227f, 6.8507f, 17.1493f, 10.7773f, 22.0546f, 11.0732f)
                lineTo(22.909f, 11.1247f)
                verticalLineTo(12.8757f)
                lineTo(22.0546f, 12.9272f)
                curveTo(17.1493f, 13.2231f, 13.2227f, 17.1498f, 12.9269f, 22.0551f)
                lineTo(12.8753f, 22.9095f)
                horizontalLineTo(11.1244f)
                lineTo(11.0728f, 22.0551f)
                curveTo(10.777f, 17.1498f, 6.8504f, 13.2231f, 1.9452f, 12.9272f)
                lineTo(1.0908f, 12.8757f)
                verticalLineTo(11.1247f)
                lineTo(1.9452f, 11.0732f)
                curveTo(6.8504f, 10.7773f, 10.777f, 6.8507f, 11.0728f, 1.9453f)
                lineTo(11.1244f, 1.0909f)
                close()
                moveTo(11.9999f, 5.8502f)
                curveTo(10.83f, 8.6155f, 8.6151f, 10.8304f, 5.85f, 12.0002f)
                curveTo(8.6151f, 13.1701f, 10.83f, 15.385f, 11.9999f, 18.1502f)
                curveTo(13.1697f, 15.385f, 15.3846f, 13.1701f, 18.1498f, 12.0002f)
                curveTo(15.3846f, 10.8304f, 13.1697f, 8.6155f, 11.9999f, 5.8502f)
                close()
            }
        }
        .build()
        return `_gemini-line`!!
    }

private var `_gemini-line`: ImageVector? = null
