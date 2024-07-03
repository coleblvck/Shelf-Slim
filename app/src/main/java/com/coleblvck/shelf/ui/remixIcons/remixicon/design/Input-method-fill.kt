package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Input-method-fill`: ImageVector
    get() {
        if (`_input-method-fill` != null) {
            return `_input-method-fill`!!
        }
        `_input-method-fill` = Builder(name = "Input-method-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(9.8688f, 15.0f)
                horizontalLineTo(14.1311f)
                lineTo(14.9508f, 17.0f)
                horizontalLineTo(17.1667f)
                lineTo(13.0f, 7.0f)
                horizontalLineTo(11.0f)
                lineTo(6.8333f, 17.0f)
                horizontalLineTo(9.0492f)
                lineTo(9.8688f, 15.0f)
                close()
                moveTo(10.6885f, 13.0f)
                lineTo(12.0f, 9.8f)
                lineTo(13.3115f, 13.0f)
                horizontalLineTo(10.6885f)
                close()
            }
        }
        .build()
        return `_input-method-fill`!!
    }

private var `_input-method-fill`: ImageVector? = null
