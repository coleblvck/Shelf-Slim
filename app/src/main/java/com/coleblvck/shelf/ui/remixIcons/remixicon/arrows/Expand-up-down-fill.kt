package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-up-down-fill`: ImageVector
    get() {
        if (`_expand-up-down-fill` != null) {
            return `_expand-up-down-fill`!!
        }
        `_expand-up-down-fill` = Builder(name = "Expand-up-down-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(12.0f, 21.0f)
                lineTo(6.0f, 15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_expand-up-down-fill`!!
    }

private var `_expand-up-down-fill`: ImageVector? = null
