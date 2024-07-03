package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Skip-up-line`: ImageVector
    get() {
        if (`_skip-up-line` != null) {
            return `_skip-up-line`!!
        }
        `_skip-up-line` = Builder(name = "Skip-up-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.9142f)
                lineTo(16.7929f, 18.7071f)
                lineTo(18.2071f, 17.2929f)
                lineTo(12.0f, 11.0858f)
                lineTo(5.7929f, 17.2929f)
                lineTo(7.2071f, 18.7071f)
                lineTo(12.0f, 13.9142f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_skip-up-line`!!
    }

private var `_skip-up-line`: ImageVector? = null
