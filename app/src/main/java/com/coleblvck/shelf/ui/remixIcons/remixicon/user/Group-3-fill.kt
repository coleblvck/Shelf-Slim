package com.coleblvck.shelf.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Group-3-fill`: ImageVector
    get() {
        if (`_group-3-fill` != null) {
            return `_group-3-fill`!!
        }
        `_group-3-fill` = Builder(name = "Group-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.0f)
                curveTo(2.5f, 9.2091f, 4.2909f, 11.0f, 6.5f, 11.0f)
                curveTo(8.7091f, 11.0f, 10.5f, 9.2091f, 10.5f, 7.0f)
                curveTo(10.5f, 4.7909f, 8.7091f, 3.0f, 6.5f, 3.0f)
                curveTo(4.2909f, 3.0f, 2.5f, 4.7909f, 2.5f, 7.0f)
                close()
                moveTo(2.0f, 21.0f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 14.0147f, 4.0147f, 12.0f, 6.5f, 12.0f)
                curveTo(8.9853f, 12.0f, 11.0f, 14.0147f, 11.0f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(15.2909f, 11.0f, 13.5f, 9.2091f, 13.5f, 7.0f)
                curveTo(13.5f, 4.7909f, 15.2909f, 3.0f, 17.5f, 3.0f)
                curveTo(19.7091f, 3.0f, 21.5f, 4.7909f, 21.5f, 7.0f)
                curveTo(21.5f, 9.2091f, 19.7091f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(13.0f, 21.0f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 14.0147f, 15.0147f, 12.0f, 17.5f, 12.0f)
                curveTo(19.9853f, 12.0f, 22.0f, 14.0147f, 22.0f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_group-3-fill`!!
    }

private var `_group-3-fill`: ImageVector? = null
