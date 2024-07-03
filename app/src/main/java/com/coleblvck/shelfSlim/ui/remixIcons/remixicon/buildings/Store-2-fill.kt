package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Store-2-fill`: ImageVector
    get() {
        if (`_store-2-fill` != null) {
            return `_store-2-fill`!!
        }
        `_store-2-fill` = Builder(name = "Store-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.2422f)
                curveTo(1.794f, 12.435f, 1.0f, 11.0602f, 1.0f, 9.5f)
                curveTo(1.0f, 8.6729f, 1.2244f, 7.8762f, 1.6332f, 7.1975f)
                lineTo(4.3453f, 2.5f)
                curveTo(4.5239f, 2.1906f, 4.8541f, 2.0f, 5.2113f, 2.0f)
                horizontalLineTo(18.7887f)
                curveTo(19.1459f, 2.0f, 19.4761f, 2.1906f, 19.6547f, 2.5f)
                lineTo(22.3575f, 7.1817f)
                curveTo(22.7756f, 7.8762f, 23.0f, 8.6729f, 23.0f, 9.5f)
                curveTo(23.0f, 11.0602f, 22.206f, 12.435f, 21.0f, 13.2422f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(5.7887f, 4.0f)
                lineTo(3.356f, 8.2132f)
                curveTo(3.1241f, 8.5984f, 3.0f, 9.0389f, 3.0f, 9.5f)
                curveTo(3.0f, 10.8807f, 4.1193f, 12.0f, 5.5f, 12.0f)
                curveTo(6.531f, 12.0f, 7.4447f, 11.3703f, 7.8218f, 10.4295f)
                curveTo(8.1574f, 9.5922f, 9.3426f, 9.5922f, 9.6782f, 10.4295f)
                curveTo(10.0553f, 11.3703f, 10.969f, 12.0f, 12.0f, 12.0f)
                curveTo(13.031f, 12.0f, 13.9447f, 11.3703f, 14.3218f, 10.4295f)
                curveTo(14.6574f, 9.5922f, 15.8426f, 9.5922f, 16.1782f, 10.4295f)
                curveTo(16.5553f, 11.3703f, 17.469f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 10.8807f, 21.0f, 9.5f)
                curveTo(21.0f, 9.0389f, 20.8759f, 8.5984f, 20.6347f, 8.1975f)
                lineTo(18.2113f, 4.0f)
                horizontalLineTo(5.7887f)
                close()
            }
        }
        .build()
        return `_store-2-fill`!!
    }

private var `_store-2-fill`: ImageVector? = null
