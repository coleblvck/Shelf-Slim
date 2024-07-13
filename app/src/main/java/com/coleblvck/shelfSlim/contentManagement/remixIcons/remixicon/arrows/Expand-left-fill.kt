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

public val ArrowsGroup.`Expand-left-fill`: ImageVector
    get() {
        if (`_expand-left-fill` != null) {
            return `_expand-left-fill`!!
        }
        `_expand-left-fill` = Builder(name = "Expand-left-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9999f, 4.9998f)
                verticalLineTo(10.9998f)
                lineTo(16.0002f, 11.0002f)
                lineTo(16.0002f, 13.0002f)
                lineTo(9.9999f, 12.9998f)
                verticalLineTo(18.9998f)
                lineTo(2.9999f, 12.0f)
                lineTo(9.9999f, 4.9998f)
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
        return `_expand-left-fill`!!
    }

private var `_expand-left-fill`: ImageVector? = null
