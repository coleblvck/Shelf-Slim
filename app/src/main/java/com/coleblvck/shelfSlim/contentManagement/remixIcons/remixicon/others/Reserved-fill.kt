package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Reserved-fill`: ImageVector
    get() {
        if (`_reserved-fill` != null) {
            return `_reserved-fill`!!
        }
        `_reserved-fill` = Builder(name = "Reserved-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 15.0f, 3.0f, 14.5523f, 3.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 14.5523f, 20.5523f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_reserved-fill`!!
    }

private var `_reserved-fill`: ImageVector? = null