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

public val ArrowsGroup.`Arrow-left-right-line`: ImageVector
    get() {
        if (`_arrow-left-right-line` != null) {
            return `_arrow-left-right-line`!!
        }
        `_arrow-left-right-line` = Builder(name = "Arrow-left-right-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0503f, 12.0498f)
                lineTo(21.0f, 16.9996f)
                lineTo(16.0503f, 21.9493f)
                lineTo(14.636f, 20.5351f)
                lineTo(17.172f, 17.9988f)
                lineTo(4.0f, 17.9996f)
                verticalLineTo(15.9996f)
                lineTo(17.172f, 15.9988f)
                lineTo(14.636f, 13.464f)
                lineTo(16.0503f, 12.0498f)
                close()
                moveTo(7.9497f, 2.0498f)
                lineTo(9.364f, 3.464f)
                lineTo(6.828f, 5.9988f)
                lineTo(20.0f, 5.9995f)
                verticalLineTo(7.9995f)
                lineTo(6.828f, 7.9988f)
                lineTo(9.364f, 10.5351f)
                lineTo(7.9497f, 11.9493f)
                lineTo(3.0f, 6.9995f)
                lineTo(7.9497f, 2.0498f)
                close()
            }
        }
        .build()
        return `_arrow-left-right-line`!!
    }

private var `_arrow-left-right-line`: ImageVector? = null
