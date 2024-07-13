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

public val ArrowsGroup.`Arrow-up-double-fill`: ImageVector
    get() {
        if (`_arrow-up-double-fill` != null) {
            return `_arrow-up-double-fill`!!
        }
        `_arrow-up-double-fill` = Builder(name = "Arrow-up-double-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.8358f)
                lineTo(5.7929f, 11.0429f)
                lineTo(7.2071f, 12.4571f)
                lineTo(12.0f, 7.6642f)
                lineTo(16.7929f, 12.4571f)
                lineTo(18.2071f, 11.0429f)
                lineTo(12.0f, 4.8358f)
                close()
                moveTo(12.0f, 10.4857f)
                lineTo(5.7929f, 16.6928f)
                lineTo(7.2071f, 18.107f)
                lineTo(12.0f, 13.3141f)
                lineTo(16.7929f, 18.107f)
                lineTo(18.2071f, 16.6928f)
                lineTo(12.0f, 10.4857f)
                close()
            }
        }
        .build()
        return `_arrow-up-double-fill`!!
    }

private var `_arrow-up-double-fill`: ImageVector? = null
