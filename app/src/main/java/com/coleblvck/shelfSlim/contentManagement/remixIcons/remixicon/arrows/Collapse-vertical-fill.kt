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

public val ArrowsGroup.`Collapse-vertical-fill`: ImageVector
    get() {
        if (`_collapse-vertical-fill` != null) {
            return `_collapse-vertical-fill`!!
        }
        `_collapse-vertical-fill` = Builder(name = "Collapse-vertical-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 13.4995f)
                lineTo(16.9493f, 18.4493f)
                lineTo(12.9995f, 18.4483f)
                lineTo(12.9995f, 22.9995f)
                horizontalLineTo(10.9995f)
                lineTo(10.9995f, 18.4478f)
                lineTo(7.0522f, 18.4468f)
                lineTo(11.9995f, 13.4995f)
                close()
                moveTo(10.9995f, 0.9995f)
                lineTo(10.9995f, 5.5496f)
                lineTo(7.0503f, 5.5496f)
                lineTo(12.0f, 10.4995f)
                lineTo(16.9497f, 5.5498f)
                lineTo(12.9995f, 5.5497f)
                verticalLineTo(0.9995f)
                lineTo(10.9995f, 0.9995f)
                close()
            }
        }
        .build()
        return `_collapse-vertical-fill`!!
    }

private var `_collapse-vertical-fill`: ImageVector? = null
