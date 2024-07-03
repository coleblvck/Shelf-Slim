package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Checkbox-circle-fill`: ImageVector
    get() {
        if (`_checkbox-circle-fill` != null) {
            return `_checkbox-circle-fill`!!
        }
        `_checkbox-circle-fill` = Builder(name = "Checkbox-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.0026f, 16.0f)
                lineTo(18.0737f, 8.9289f)
                lineTo(16.6595f, 7.5147f)
                lineTo(11.0026f, 13.1716f)
                lineTo(8.1742f, 10.3431f)
                lineTo(6.76f, 11.7574f)
                lineTo(11.0026f, 16.0f)
                close()
            }
        }
        .build()
        return `_checkbox-circle-fill`!!
    }

private var `_checkbox-circle-fill`: ImageVector? = null
