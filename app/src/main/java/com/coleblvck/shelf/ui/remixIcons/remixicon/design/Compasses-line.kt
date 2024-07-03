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

public val DesignGroup.`Compasses-line`: ImageVector
    get() {
        if (`_compasses-line` != null) {
            return `_compasses-line`!!
        }
        `_compasses-line` = Builder(name = "Compasses-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9998f, 4.1227f)
                verticalLineTo(1.9967f)
                horizontalLineTo(12.9998f)
                verticalLineTo(4.1227f)
                curveTo(14.725f, 4.5668f, 15.9998f, 6.1329f, 15.9998f, 7.9967f)
                curveTo(15.9998f, 9.1144f, 15.5414f, 10.125f, 14.8023f, 10.8508f)
                lineTo(20.8658f, 21.3531f)
                lineTo(19.1338f, 22.3531f)
                lineTo(13.0708f, 11.8517f)
                curveTo(12.7299f, 11.9462f, 12.3708f, 11.9967f, 11.9998f, 11.9967f)
                curveTo(11.6289f, 11.9967f, 11.2697f, 11.9462f, 10.9288f, 11.8517f)
                lineTo(4.8658f, 22.3531f)
                lineTo(3.1338f, 21.3531f)
                lineTo(9.1973f, 10.8508f)
                curveTo(8.4582f, 10.125f, 7.9998f, 9.1144f, 7.9998f, 7.9967f)
                curveTo(7.9998f, 6.1329f, 9.2746f, 4.5668f, 10.9998f, 4.1227f)
                close()
                moveTo(11.9998f, 9.9967f)
                curveTo(13.1044f, 9.9967f, 13.9998f, 9.1013f, 13.9998f, 7.9967f)
                curveTo(13.9998f, 6.8921f, 13.1044f, 5.9967f, 11.9998f, 5.9967f)
                curveTo(10.8952f, 5.9967f, 9.9998f, 6.8921f, 9.9998f, 7.9967f)
                curveTo(9.9998f, 9.1013f, 10.8952f, 9.9967f, 11.9998f, 9.9967f)
                close()
            }
        }
        .build()
        return `_compasses-line`!!
    }

private var `_compasses-line`: ImageVector? = null
