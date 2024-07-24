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

public val BuildingsGroup.`Building-4-fill`: ImageVector
    get() {
        if (`_building-4-fill` != null) {
            return `_building-4-fill`!!
        }
        `_building-4-fill` = Builder(name = "Building-4-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_building-4-fill`!!
    }

private var `_building-4-fill`: ImageVector? = null
