package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Passport-line`: ImageVector
    get() {
        if (`_passport-line` != null) {
            return `_passport-line`!!
        }
        `_passport-line` = Builder(name = "Passport-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(16.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(14.2091f, 6.0f, 16.0f, 7.7909f, 16.0f, 10.0f)
                curveTo(16.0f, 12.2091f, 14.2091f, 14.0f, 12.0f, 14.0f)
                curveTo(9.7909f, 14.0f, 8.0f, 12.2091f, 8.0f, 10.0f)
                curveTo(8.0f, 7.7909f, 9.7909f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 8.8954f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f)
                curveTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8954f, 13.1046f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_passport-line`!!
    }

private var `_passport-line`: ImageVector? = null
