package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-up-down-line`: ImageVector
    get() {
        if (`_arrow-up-down-line` != null) {
            return `_arrow-up-down-line`!!
        }
        `_arrow-up-down-line` = Builder(name = "Arrow-up-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9498f, 7.9497f)
                lineTo(10.5356f, 9.364f)
                lineTo(8.0008f, 6.828f)
                lineTo(8.0f, 20.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0008f, 6.828f)
                lineTo(3.4645f, 9.364f)
                lineTo(2.0503f, 7.9497f)
                lineTo(7.0f, 3.0f)
                lineTo(11.9498f, 7.9497f)
                close()
                moveTo(21.9498f, 16.0503f)
                lineTo(17.0f, 21.0f)
                lineTo(12.0503f, 16.0503f)
                lineTo(13.4645f, 14.636f)
                lineTo(16.0008f, 17.172f)
                lineTo(16.0f, 4.0f)
                horizontalLineTo(18.0f)
                lineTo(18.0008f, 17.172f)
                lineTo(20.5356f, 14.636f)
                lineTo(21.9498f, 16.0503f)
                close()
            }
        }
        .build()
        return `_arrow-up-down-line`!!
    }

private var `_arrow-up-down-line`: ImageVector? = null
