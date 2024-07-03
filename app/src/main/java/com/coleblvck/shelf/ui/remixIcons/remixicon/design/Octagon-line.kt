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

public val DesignGroup.`Octagon-line`: ImageVector
    get() {
        if (`_octagon-line` != null) {
            return `_octagon-line`!!
        }
        `_octagon-line` = Builder(name = "Octagon-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.1076f, 4.501f)
                horizontalLineTo(8.8944f)
                lineTo(4.501f, 8.8944f)
                verticalLineTo(15.1076f)
                lineTo(8.8944f, 19.501f)
                horizontalLineTo(15.1076f)
                lineTo(19.501f, 15.1076f)
                verticalLineTo(8.8944f)
                lineTo(15.1076f, 4.501f)
                close()
            }
        }
        .build()
        return `_octagon-line`!!
    }

private var `_octagon-line`: ImageVector? = null
