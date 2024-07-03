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

public val LogosGroup.`Gemini-fill`: ImageVector
    get() {
        if (`_gemini-fill` != null) {
            return `_gemini-fill`!!
        }
        `_gemini-fill` = Builder(name = "Gemini-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9996f, 12.0235f)
                curveTo(17.5625f, 12.4117f, 12.4114f, 17.563f, 12.0232f, 24.0f)
                horizontalLineTo(11.9762f)
                curveTo(11.588f, 17.563f, 6.4369f, 12.4117f, 0.0f, 12.0235f)
                verticalLineTo(11.9765f)
                curveTo(6.4369f, 11.5883f, 11.588f, 6.4372f, 11.9762f, 0.0f)
                horizontalLineTo(12.0232f)
                curveTo(12.4114f, 6.4372f, 17.5625f, 11.5883f, 23.9996f, 11.9765f)
                verticalLineTo(12.0235f)
                close()
            }
        }
        .build()
        return `_gemini-fill`!!
    }

private var `_gemini-fill`: ImageVector? = null
