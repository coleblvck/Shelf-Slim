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

public val ArrowsGroup.`Expand-left-line`: ImageVector
    get() {
        if (`_expand-left-line` != null) {
            return `_expand-left-line`!!
        }
        `_expand-left-line` = Builder(name = "Expand-left-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.071f, 4.929f)
                lineTo(11.4852f, 6.3432f)
                lineTo(6.8283f, 11.0001f)
                lineTo(16.0002f, 11.0002f)
                lineTo(16.0002f, 13.0002f)
                lineTo(6.8284f, 13.0001f)
                lineTo(11.4852f, 17.6569f)
                lineTo(10.071f, 19.0712f)
                lineTo(2.9999f, 12.0001f)
                lineTo(10.071f, 4.929f)
                close()
                moveTo(18.0001f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0001f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0001f)
                close()
            }
        }
        .build()
        return `_expand-left-line`!!
    }

private var `_expand-left-line`: ImageVector? = null
