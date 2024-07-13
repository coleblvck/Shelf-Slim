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

public val LogosGroup.`Windows-fill`: ImageVector
    get() {
        if (`_windows-fill` != null) {
            return `_windows-fill`!!
        }
        `_windows-fill` = Builder(name = "Windows-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.001f, 5.479f)
                lineTo(10.3778f, 4.4625f)
                verticalLineTo(11.5902f)
                horizontalLineTo(3.001f)
                verticalLineTo(5.479f)
                close()
                moveTo(3.001f, 18.521f)
                lineTo(10.3778f, 19.5375f)
                verticalLineTo(12.4982f)
                horizontalLineTo(3.001f)
                verticalLineTo(18.521f)
                close()
                moveTo(11.1894f, 19.646f)
                lineTo(21.001f, 21.0f)
                verticalLineTo(12.4982f)
                horizontalLineTo(11.1894f)
                verticalLineTo(19.646f)
                close()
                moveTo(11.1894f, 4.354f)
                verticalLineTo(11.5902f)
                horizontalLineTo(21.001f)
                verticalLineTo(3.0f)
                lineTo(11.1894f, 4.354f)
                close()
            }
        }
        .build()
        return `_windows-fill`!!
    }

private var `_windows-fill`: ImageVector? = null
