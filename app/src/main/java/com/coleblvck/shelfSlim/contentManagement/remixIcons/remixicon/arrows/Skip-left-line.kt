package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Skip-left-line`: ImageVector
    get() {
        if (`_skip-left-line` != null) {
            return `_skip-left-line`!!
        }
        `_skip-left-line` = Builder(name = "Skip-left-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9142f, 12.0f)
                lineTo(18.7071f, 7.2071f)
                lineTo(17.2929f, 5.7929f)
                lineTo(11.0858f, 12.0f)
                lineTo(17.2929f, 18.2071f)
                lineTo(18.7071f, 16.7929f)
                lineTo(13.9142f, 12.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_skip-left-line`!!
    }

private var `_skip-left-line`: ImageVector? = null
