package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Key-fill`: ImageVector
    get() {
        if (`_key-fill` != null) {
            return `_key-fill`!!
        }
        `_key-fill` = Builder(name = "Key-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineTo(12.6586f)
                curveTo(11.8349f, 16.3304f, 9.6124f, 18.0f, 7.0f, 18.0f)
                curveTo(3.6863f, 18.0f, 1.0f, 15.3137f, 1.0f, 12.0f)
                curveTo(1.0f, 8.6863f, 3.6863f, 6.0f, 7.0f, 6.0f)
                curveTo(9.6124f, 6.0f, 11.8349f, 7.6696f, 12.6586f, 10.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(7.0f, 14.0f)
                curveTo(8.1046f, 14.0f, 9.0f, 13.1046f, 9.0f, 12.0f)
                curveTo(9.0f, 10.8954f, 8.1046f, 10.0f, 7.0f, 10.0f)
                curveTo(5.8954f, 10.0f, 5.0f, 10.8954f, 5.0f, 12.0f)
                curveTo(5.0f, 13.1046f, 5.8954f, 14.0f, 7.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_key-fill`!!
    }

private var `_key-fill`: ImageVector? = null
