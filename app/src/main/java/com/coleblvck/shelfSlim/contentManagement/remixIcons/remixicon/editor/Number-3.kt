package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Number-3`: ImageVector
    get() {
        if (`_number-3` != null) {
            return `_number-3`!!
        }
        `_number-3` = Builder(name = "Number-3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0001f, 2.0f)
                verticalLineTo(3.3622f)
                lineTo(12.8087f, 9.5498f)
                curveTo(16.0169f, 9.9479f, 18.5001f, 12.684f, 18.5001f, 16.0f)
                curveTo(18.5001f, 19.5899f, 15.5899f, 22.5f, 12.0001f, 22.5f)
                curveTo(8.9543f, 22.5f, 6.3979f, 20.4052f, 5.6929f, 17.5778f)
                lineTo(7.6335f, 17.0922f)
                curveTo(8.1216f, 19.0497f, 9.8914f, 20.5f, 12.0001f, 20.5f)
                curveTo(14.4853f, 20.5f, 16.5001f, 18.4853f, 16.5001f, 16.0f)
                curveTo(16.5001f, 13.5147f, 14.4853f, 11.5f, 12.0001f, 11.5f)
                curveTo(11.2795f, 11.5f, 10.5985f, 11.6694f, 9.9946f, 11.9705f)
                lineTo(9.7669f, 12.0923f)
                lineTo(9.0771f, 10.8852f)
                lineTo(14.8551f, 3.9992f)
                lineTo(6.5001f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0001f)
                close()
            }
        }
        .build()
        return `_number-3`!!
    }

private var `_number-3`: ImageVector? = null
