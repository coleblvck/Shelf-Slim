package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Quill-pen-fill`: ImageVector
    get() {
        if (`_quill-pen-fill` != null) {
            return `_quill-pen-fill`!!
        }
        `_quill-pen-fill` = Builder(name = "Quill-pen-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.9967f)
                curveTo(6.0f, 1.9967f, 4.0f, 15.9967f, 3.0f, 21.9967f)
                curveTo(3.6667f, 21.9967f, 4.3327f, 21.9967f, 4.9982f, 21.9967f)
                curveTo(5.6642f, 18.6636f, 7.3315f, 16.8303f, 10.0f, 16.4967f)
                curveTo(14.0f, 15.9967f, 17.0f, 12.4967f, 18.0f, 9.4967f)
                lineTo(16.5f, 8.4967f)
                curveTo(16.8333f, 8.1634f, 17.1667f, 7.83f, 17.5f, 7.4967f)
                curveTo(18.5f, 6.4967f, 19.5042f, 4.9967f, 21.0f, 1.9967f)
                close()
            }
        }
        .build()
        return `_quill-pen-fill`!!
    }

private var `_quill-pen-fill`: ImageVector? = null
