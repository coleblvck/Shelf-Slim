package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Advertisement-fill`: ImageVector
    get() {
        if (`_advertisement-fill` != null) {
            return `_advertisement-fill`!!
        }
        `_advertisement-fill` = Builder(name = "Advertisement-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.552f, 13.0f)
                lineTo(8.399f, 10.8852f)
                lineTo(9.244f, 13.0f)
                horizontalLineTo(7.552f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                curveTo(15.4477f, 14.0f, 15.0f, 13.5523f, 15.0f, 13.0f)
                curveTo(15.0f, 12.4477f, 15.4477f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(12.598f, 16.0f)
                horizontalLineTo(10.443f)
                lineTo(10.043f, 15.0f)
                horizontalLineTo(6.753f)
                lineTo(6.353f, 16.0f)
                horizontalLineTo(4.199f)
                lineTo(5.398f, 13.002f)
                lineTo(5.399f, 13.0f)
                lineTo(7.399f, 8.0f)
                horizontalLineTo(9.399f)
                lineTo(12.598f, 16.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                curveTo(14.3431f, 16.0f, 13.0f, 14.6569f, 13.0f, 13.0f)
                curveTo(13.0f, 11.3431f, 14.3431f, 10.0f, 16.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_advertisement-fill`!!
    }

private var `_advertisement-fill`: ImageVector? = null