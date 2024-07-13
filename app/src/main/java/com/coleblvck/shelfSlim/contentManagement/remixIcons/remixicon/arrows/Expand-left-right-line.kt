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

public val ArrowsGroup.`Expand-left-right-line`: ImageVector
    get() {
        if (`_expand-left-right-line` != null) {
            return `_expand-left-right-line`!!
        }
        `_expand-left-right-line` = Builder(name = "Expand-left-right-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.043f, 5.7929f)
                lineTo(2.8359f, 12.0f)
                lineTo(9.043f, 18.2071f)
                lineTo(10.4573f, 16.7928f)
                lineTo(5.6644f, 12.0f)
                lineTo(10.4573f, 7.2071f)
                lineTo(9.043f, 5.7929f)
                close()
                moveTo(14.957f, 18.2072f)
                lineTo(21.1641f, 12.0001f)
                lineTo(14.957f, 5.793f)
                lineTo(13.5427f, 7.2072f)
                lineTo(18.3356f, 12.0001f)
                lineTo(13.5427f, 16.793f)
                lineTo(14.957f, 18.2072f)
                close()
            }
        }
        .build()
        return `_expand-left-right-line`!!
    }

private var `_expand-left-right-line`: ImageVector? = null
