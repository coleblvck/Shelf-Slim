package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Facebook-box-fill`: ImageVector
    get() {
        if (`_facebook-box-fill` != null) {
            return `_facebook-box-fill`!!
        }
        `_facebook-box-fill` = Builder(name = "Facebook-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4024f, 21.0f)
                verticalLineTo(14.0344f)
                horizontalLineTo(17.7347f)
                lineTo(18.0838f, 11.3265f)
                horizontalLineTo(15.4024f)
                verticalLineTo(9.5976f)
                curveTo(15.4024f, 8.8136f, 15.62f, 8.2793f, 16.7443f, 8.2793f)
                lineTo(18.1783f, 8.2787f)
                verticalLineTo(5.8568f)
                curveTo(17.9302f, 5.8238f, 17.0791f, 5.7501f, 16.0888f, 5.7501f)
                curveTo(14.0213f, 5.7501f, 12.606f, 7.012f, 12.606f, 9.3295f)
                verticalLineTo(11.3265f)
                horizontalLineTo(10.2677f)
                verticalLineTo(14.0344f)
                horizontalLineTo(12.606f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(15.4024f)
                close()
            }
        }
        .build()
        return `_facebook-box-fill`!!
    }

private var `_facebook-box-fill`: ImageVector? = null
