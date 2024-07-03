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

public val DesignGroup.`Octagon-fill`: ImageVector
    get() {
        if (`_octagon-fill` != null) {
            return `_octagon-fill`!!
        }
        `_octagon-fill` = Builder(name = "Octagon-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.936f, 2.501f)
                lineTo(21.501f, 8.066f)
                verticalLineTo(15.936f)
                lineTo(15.936f, 21.501f)
                horizontalLineTo(8.066f)
                lineTo(2.501f, 15.936f)
                verticalLineTo(8.066f)
                lineTo(8.066f, 2.501f)
                horizontalLineTo(15.936f)
                close()
            }
        }
        .build()
        return `_octagon-fill`!!
    }

private var `_octagon-fill`: ImageVector? = null
