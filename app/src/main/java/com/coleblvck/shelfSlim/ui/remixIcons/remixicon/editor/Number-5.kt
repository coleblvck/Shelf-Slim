package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Number-5`: ImageVector
    get() {
        if (`_number-5` != null) {
            return `_number-5`!!
        }
        `_number-5` = Builder(name = "Number-5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0001f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.3002f)
                lineTo(8.6234f, 10.4448f)
                curveTo(9.6075f, 9.8453f, 10.7634f, 9.5f, 12.0001f, 9.5f)
                curveTo(15.5899f, 9.5f, 18.5001f, 12.4101f, 18.5001f, 16.0f)
                curveTo(18.5001f, 19.5899f, 15.5899f, 22.5f, 12.0001f, 22.5f)
                curveTo(8.9543f, 22.5f, 6.3979f, 20.4052f, 5.6929f, 17.5778f)
                lineTo(7.6335f, 17.0922f)
                curveTo(8.1216f, 19.0497f, 9.8914f, 20.5f, 12.0001f, 20.5f)
                curveTo(14.4853f, 20.5f, 16.5001f, 18.4853f, 16.5001f, 16.0f)
                curveTo(16.5001f, 13.5147f, 14.4853f, 11.5f, 12.0001f, 11.5f)
                curveTo(9.9778f, 11.5f, 8.7224f, 12.139f, 8.0399f, 13.0293f)
                lineTo(6.4649f, 11.848f)
                lineTo(7.5001f, 2.0f)
                horizontalLineTo(18.0001f)
                close()
            }
        }
        .build()
        return `_number-5`!!
    }

private var `_number-5`: ImageVector? = null
