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

public val ArrowsGroup.`Expand-vertical-s-line`: ImageVector
    get() {
        if (`_expand-vertical-s-line` != null) {
            return `_expand-vertical-s-line`!!
        }
        `_expand-vertical-s-line` = Builder(name = "Expand-vertical-s-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9492f, 7.4493f)
                lineTo(11.9995f, 2.4995f)
                lineTo(7.0522f, 7.4468f)
                lineTo(8.4664f, 8.861f)
                lineTo(10.9995f, 6.3279f)
                lineTo(10.9995f, 17.6704f)
                lineTo(8.4645f, 15.1353f)
                lineTo(7.0503f, 16.5496f)
                lineTo(12.0f, 21.4995f)
                lineTo(16.9497f, 16.5498f)
                lineTo(15.5355f, 15.1356f)
                lineTo(12.9995f, 17.6716f)
                lineTo(12.9995f, 6.3279f)
                lineTo(15.535f, 8.8635f)
                lineTo(16.9492f, 7.4493f)
                close()
            }
        }
        .build()
        return `_expand-vertical-s-line`!!
    }

private var `_expand-vertical-s-line`: ImageVector? = null