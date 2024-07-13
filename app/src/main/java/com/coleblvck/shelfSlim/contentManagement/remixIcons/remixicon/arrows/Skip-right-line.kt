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

public val ArrowsGroup.`Skip-right-line`: ImageVector
    get() {
        if (`_skip-right-line` != null) {
            return `_skip-right-line`!!
        }
        `_skip-right-line` = Builder(name = "Skip-right-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0858f, 12.0f)
                lineTo(5.2929f, 16.7929f)
                lineTo(6.7071f, 18.2071f)
                lineTo(12.9142f, 12.0f)
                lineTo(6.7071f, 5.7929f)
                lineTo(5.2929f, 7.2071f)
                lineTo(10.0858f, 12.0f)
                close()
                moveTo(17.0f, 6.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineTo(15.0f)
                lineTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                close()
            }
        }
        .build()
        return `_skip-right-line`!!
    }

private var `_skip-right-line`: ImageVector? = null
