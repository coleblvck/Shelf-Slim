package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Code-block`: ImageVector
    get() {
        if (`_code-block` != null) {
            return `_code-block`!!
        }
        `_code-block` = Builder(name = "Code-block", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4144f, 5.9999f)
                lineTo(5.7073f, 3.7071f)
                lineTo(4.293f, 2.2929f)
                lineTo(0.5859f, 5.9999f)
                lineTo(4.293f, 9.7071f)
                lineTo(5.7073f, 8.2928f)
                lineTo(3.4144f, 5.9999f)
                close()
                moveTo(9.5859f, 5.9999f)
                lineTo(7.293f, 3.7071f)
                lineTo(8.7073f, 2.2929f)
                lineTo(12.4144f, 5.9999f)
                lineTo(8.7073f, 9.7071f)
                lineTo(7.293f, 8.2928f)
                lineTo(9.5859f, 5.9999f)
                close()
                moveTo(14.0002f, 2.9999f)
                horizontalLineTo(21.0002f)
                curveTo(21.5524f, 2.9999f, 22.0002f, 3.4477f, 22.0002f, 3.9999f)
                verticalLineTo(20.0f)
                curveTo(22.0002f, 20.5522f, 21.5524f, 21.0f, 21.0002f, 21.0f)
                horizontalLineTo(3.0001f)
                curveTo(2.4479f, 21.0f, 2.0001f, 20.5522f, 2.0001f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0002f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0002f)
                verticalLineTo(4.9999f)
                horizontalLineTo(14.0002f)
                verticalLineTo(2.9999f)
                close()
            }
        }
        .build()
        return `_code-block`!!
    }

private var `_code-block`: ImageVector? = null
