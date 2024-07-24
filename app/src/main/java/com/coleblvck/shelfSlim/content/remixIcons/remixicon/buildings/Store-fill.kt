package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Store-fill`: ImageVector
    get() {
        if (`_store-fill` != null) {
            return `_store-fill`!!
        }
        `_store-fill` = Builder(name = "Store-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.6458f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(11.6458f)
                curveTo(2.3776f, 10.9407f, 2.0f, 10.0144f, 2.0f, 9.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.4477f, 2.4477f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 2.0f, 22.0f, 2.4477f, 22.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 10.0144f, 21.6224f, 10.9407f, 21.0f, 11.6458f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 8.4477f, 14.4477f, 8.0f, 15.0f, 8.0f)
                curveTo(15.5523f, 8.0f, 16.0f, 8.4477f, 16.0f, 9.0f)
                curveTo(16.0f, 10.1046f, 16.8954f, 11.0f, 18.0f, 11.0f)
                curveTo(19.1046f, 11.0f, 20.0f, 10.1046f, 20.0f, 9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 10.1046f, 4.8954f, 11.0f, 6.0f, 11.0f)
                curveTo(7.1046f, 11.0f, 8.0f, 10.1046f, 8.0f, 9.0f)
                curveTo(8.0f, 8.4477f, 8.4477f, 8.0f, 9.0f, 8.0f)
                curveTo(9.5523f, 8.0f, 10.0f, 8.4477f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_store-fill`!!
    }

private var `_store-fill`: ImageVector? = null
