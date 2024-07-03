package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Checkbox-multiple-blank-fill`: ImageVector
    get() {
        if (`_checkbox-multiple-blank-fill` != null) {
            return `_checkbox-multiple-blank-fill`!!
        }
        `_checkbox-multiple-blank-fill` = Builder(name = "Checkbox-multiple-blank-fill",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9998f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(6.9998f, 2.4477f, 7.4475f, 2.0f, 7.9998f, 2.0f)
                horizontalLineTo(20.9998f)
                curveTo(21.5521f, 2.0f, 21.9998f, 2.4477f, 21.9998f, 3.0f)
                verticalLineTo(16.0f)
                curveTo(21.9998f, 16.5523f, 21.5521f, 17.0f, 20.9998f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.9925f)
                curveTo(17.0f, 21.5489f, 16.551f, 22.0f, 15.9925f, 22.0f)
                horizontalLineTo(3.0073f)
                curveTo(2.4509f, 22.0f, 2.0f, 21.5511f, 2.0f, 20.9925f)
                lineTo(2.0028f, 8.0075f)
                curveTo(2.0029f, 7.4511f, 2.4518f, 7.0f, 3.0103f, 7.0f)
                horizontalLineTo(6.9998f)
                close()
                moveTo(8.9998f, 7.0f)
                horizontalLineTo(15.9927f)
                curveTo(16.549f, 7.0f, 17.0f, 7.4489f, 17.0f, 8.0075f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.9998f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.9998f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_checkbox-multiple-blank-fill`!!
    }

private var `_checkbox-multiple-blank-fill`: ImageVector? = null