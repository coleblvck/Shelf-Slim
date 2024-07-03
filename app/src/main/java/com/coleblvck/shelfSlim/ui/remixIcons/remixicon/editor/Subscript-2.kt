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

public val EditorGroup.`Subscript-2`: ImageVector
    get() {
        if (`_subscript-2` != null) {
            return `_subscript-2`!!
        }
        `_subscript-2` = Builder(name = "Subscript-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(19.5507f, 16.5803f)
                curveTo(19.7042f, 16.4345f, 19.8f, 16.2284f, 19.8f, 16.0f)
                curveTo(19.8f, 15.5582f, 19.4418f, 15.2f, 19.0f, 15.2f)
                curveTo(18.5582f, 15.2f, 18.2f, 15.5582f, 18.2f, 16.0f)
                curveTo(18.2f, 16.0762f, 18.2107f, 16.15f, 18.2306f, 16.2198f)
                lineTo(17.0765f, 16.5496f)
                curveTo(17.0267f, 16.375f, 17.0f, 16.1906f, 17.0f, 16.0f)
                curveTo(17.0f, 14.8954f, 17.8954f, 14.0f, 19.0f, 14.0f)
                curveTo(20.1046f, 14.0f, 21.0f, 14.8954f, 21.0f, 16.0f)
                curveTo(21.0f, 16.5727f, 20.7593f, 17.0892f, 20.3735f, 17.4538f)
                lineTo(18.7441f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                lineTo(19.5507f, 16.5803f)
                verticalLineTo(16.5803f)
                close()
            }
        }
        .build()
        return `_subscript-2`!!
    }

private var `_subscript-2`: ImageVector? = null
