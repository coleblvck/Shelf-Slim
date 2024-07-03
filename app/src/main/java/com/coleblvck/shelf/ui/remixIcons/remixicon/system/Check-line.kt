package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Check-line`: ImageVector
    get() {
        if (`_check-line` != null) {
            return `_check-line`!!
        }
        `_check-line` = Builder(name = "Check-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9997f, 15.1709f)
                lineTo(19.1921f, 5.9785f)
                lineTo(20.6063f, 7.3927f)
                lineTo(9.9997f, 17.9993f)
                lineTo(3.6357f, 11.6354f)
                lineTo(5.05f, 10.2212f)
                lineTo(9.9997f, 15.1709f)
                close()
            }
        }
        .build()
        return `_check-line`!!
    }

private var `_check-line`: ImageVector? = null
