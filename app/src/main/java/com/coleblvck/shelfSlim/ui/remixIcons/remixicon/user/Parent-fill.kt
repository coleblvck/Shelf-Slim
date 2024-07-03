package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Parent-fill`: ImageVector
    get() {
        if (`_parent-fill` != null) {
            return `_parent-fill`!!
        }
        `_parent-fill` = Builder(name = "Parent-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                curveTo(4.5147f, 11.0f, 2.5f, 8.9853f, 2.5f, 6.5f)
                curveTo(2.5f, 4.0147f, 4.5147f, 2.0f, 7.0f, 2.0f)
                curveTo(9.4853f, 2.0f, 11.5f, 4.0147f, 11.5f, 6.5f)
                curveTo(11.5f, 8.9853f, 9.4853f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(17.5f, 15.0f)
                curveTo(15.2909f, 15.0f, 13.5f, 13.2091f, 13.5f, 11.0f)
                curveTo(13.5f, 8.7909f, 15.2909f, 7.0f, 17.5f, 7.0f)
                curveTo(19.7091f, 7.0f, 21.5f, 8.7909f, 21.5f, 11.0f)
                curveTo(21.5f, 13.2091f, 19.7091f, 15.0f, 17.5f, 15.0f)
                close()
                moveTo(17.5f, 16.0f)
                curveTo(19.9853f, 16.0f, 22.0f, 18.0147f, 22.0f, 20.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.5f)
                curveTo(13.0f, 18.0147f, 15.0147f, 16.0f, 17.5f, 16.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(9.7614f, 12.0f, 12.0f, 14.2386f, 12.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.2386f, 4.2386f, 12.0f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_parent-fill`!!
    }

private var `_parent-fill`: ImageVector? = null
