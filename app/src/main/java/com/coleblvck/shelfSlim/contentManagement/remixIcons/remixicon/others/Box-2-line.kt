package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Box-2-line`: ImageVector
    get() {
        if (`_box-2-line` != null) {
            return `_box-2-line`!!
        }
        `_box-2-line` = Builder(name = "Box-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(21.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(2.5f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(4.5f, 7.6531f)
                verticalLineTo(7.6579f)
                lineTo(12.0f, 12.0f)
                verticalLineTo(20.689f)
                lineTo(19.5f, 16.3469f)
                verticalLineTo(7.6531f)
                lineTo(12.0f, 3.311f)
                lineTo(4.5f, 7.6531f)
                close()
            }
        }
        .build()
        return `_box-2-line`!!
    }

private var `_box-2-line`: ImageVector? = null
