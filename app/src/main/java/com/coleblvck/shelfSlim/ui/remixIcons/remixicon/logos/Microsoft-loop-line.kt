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

public val LogosGroup.`Microsoft-loop-line`: ImageVector
    get() {
        if (`_microsoft-loop-line` != null) {
            return `_microsoft-loop-line`!!
        }
        `_microsoft-loop-line` = Builder(name = "Microsoft-loop-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                horizontalLineTo(7.6904f)
                curveTo(8.593f, 19.0595f, 9.2154f, 17.8481f, 9.4235f, 16.5f)
                horizontalLineTo(12.0f)
                curveTo(14.4853f, 16.5f, 16.5f, 14.4853f, 16.5f, 12.0f)
                curveTo(16.5f, 9.5147f, 14.4853f, 7.5f, 12.0f, 7.5f)
                curveTo(9.5147f, 7.5f, 7.5f, 9.5147f, 7.5f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(7.5f, 17.6416f, 6.004f, 19.4338f, 4.0f, 19.8885f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(9.5f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(9.5f, 10.6193f, 10.6193f, 9.5f, 12.0f, 9.5f)
                curveTo(13.3807f, 9.5f, 14.5f, 10.6193f, 14.5f, 12.0f)
                curveTo(14.5f, 13.3807f, 13.3807f, 14.5f, 12.0f, 14.5f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return `_microsoft-loop-line`!!
    }

private var `_microsoft-loop-line`: ImageVector? = null
