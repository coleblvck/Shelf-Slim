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

public val EditorGroup.`H-5`: ImageVector
    get() {
        if (`_h-5` != null) {
            return `_h-5`!!
        }
        `_h-5` = Builder(name = "H-5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.6769f)
                lineTo(17.2126f, 12.6358f)
                curveTo(17.5435f, 12.5472f, 17.8912f, 12.5f, 18.25f, 12.5f)
                curveTo(20.4591f, 12.5f, 22.25f, 14.2909f, 22.25f, 16.5f)
                curveTo(22.25f, 18.7091f, 20.4591f, 20.5f, 18.25f, 20.5f)
                curveTo(16.4233f, 20.5f, 14.8827f, 19.2756f, 14.4039f, 17.6027f)
                lineTo(16.3271f, 17.0519f)
                curveTo(16.5667f, 17.8881f, 17.3369f, 18.5f, 18.25f, 18.5f)
                curveTo(19.3546f, 18.5f, 20.25f, 17.6046f, 20.25f, 16.5f)
                curveTo(20.25f, 15.3954f, 19.3546f, 14.5f, 18.25f, 14.5f)
                curveTo(17.6194f, 14.5f, 17.057f, 14.7918f, 16.6904f, 15.2478f)
                lineTo(14.8803f, 14.3439f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_h-5`!!
    }

private var `_h-5`: ImageVector? = null
