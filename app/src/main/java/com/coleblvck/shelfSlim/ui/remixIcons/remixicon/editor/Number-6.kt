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

public val EditorGroup.`Number-6`: ImageVector
    get() {
        if (`_number-6` != null) {
            return `_number-6`!!
        }
        `_number-6` = Builder(name = "Number-6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.886f, 2.0f)
                lineTo(10.4482f, 9.6864f)
                curveTo(10.9454f, 9.5646f, 11.4652f, 9.5f, 12.0f, 9.5f)
                curveTo(15.5899f, 9.5f, 18.5f, 12.4101f, 18.5f, 16.0f)
                curveTo(18.5f, 19.5899f, 15.5899f, 22.5f, 12.0f, 22.5f)
                curveTo(8.4101f, 22.5f, 5.5f, 19.5899f, 5.5f, 16.0f)
                curveTo(5.5f, 14.7949f, 5.8279f, 13.6665f, 6.3994f, 12.699f)
                lineTo(12.576f, 2.0f)
                horizontalLineTo(14.886f)
                close()
                moveTo(12.0f, 11.5f)
                curveTo(9.5147f, 11.5f, 7.5f, 13.5147f, 7.5f, 16.0f)
                curveTo(7.5f, 18.4853f, 9.5147f, 20.5f, 12.0f, 20.5f)
                curveTo(14.4853f, 20.5f, 16.5f, 18.4853f, 16.5f, 16.0f)
                curveTo(16.5f, 13.5147f, 14.4853f, 11.5f, 12.0f, 11.5f)
                close()
            }
        }
        .build()
        return `_number-6`!!
    }

private var `_number-6`: ImageVector? = null
