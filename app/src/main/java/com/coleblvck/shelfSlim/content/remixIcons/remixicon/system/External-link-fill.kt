package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`External-link-fill`: ImageVector
    get() {
        if (`_external-link-fill` != null) {
            return `_external-link-fill`!!
        }
        `_external-link-fill` = Builder(name = "External-link-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.5523f, 17.5523f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 6.4477f, 3.4477f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(21.0f, 3.0f)
                verticalLineTo(12.0f)
                lineTo(17.206f, 8.207f)
                lineTo(11.2071f, 14.2071f)
                lineTo(9.7929f, 12.7929f)
                lineTo(15.792f, 6.793f)
                lineTo(12.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_external-link-fill`!!
    }

private var `_external-link-fill`: ImageVector? = null
