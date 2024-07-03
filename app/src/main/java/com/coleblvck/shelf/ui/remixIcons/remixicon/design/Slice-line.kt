package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Slice-line`: ImageVector
    get() {
        if (`_slice-line` != null) {
            return `_slice-line`!!
        }
        `_slice-line` = Builder(name = "Slice-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6909f, 12.9147f)
                lineTo(17.4587f, 14.6824f)
                curveTo(11.4482f, 20.6929f, 6.4985f, 20.6929f, 2.2559f, 19.2786f)
                lineTo(17.8122f, 3.7223f)
                lineTo(21.3477f, 7.2578f)
                lineTo(15.6909f, 12.9147f)
                close()
                moveTo(12.8625f, 12.9147f)
                lineTo(18.5193f, 7.2578f)
                lineTo(17.8122f, 6.5507f)
                lineTo(6.3145f, 18.0484f)
                curveTo(9.0461f, 18.1558f, 11.6722f, 17.142f, 14.5808f, 14.633f)
                lineTo(12.8625f, 12.9147f)
                close()
            }
        }
        .build()
        return `_slice-line`!!
    }

private var `_slice-line`: ImageVector? = null
