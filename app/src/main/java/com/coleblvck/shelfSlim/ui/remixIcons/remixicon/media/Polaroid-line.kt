package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Polaroid-line`: ImageVector
    get() {
        if (`_polaroid-line` != null) {
            return `_polaroid-line`!!
        }
        `_polaroid-line` = Builder(name = "Polaroid-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveTo(17.2091f, 16.0f, 19.0f, 14.2091f, 19.0f, 12.0f)
                curveTo(19.0f, 9.7909f, 17.2091f, 8.0f, 15.0f, 8.0f)
                curveTo(12.7909f, 8.0f, 11.0f, 9.7909f, 11.0f, 12.0f)
                curveTo(11.0f, 14.2091f, 12.7909f, 16.0f, 15.0f, 16.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(11.6863f, 18.0f, 9.0f, 15.3137f, 9.0f, 12.0f)
                curveTo(9.0f, 8.6863f, 11.6863f, 6.0f, 15.0f, 6.0f)
                curveTo(18.3137f, 6.0f, 21.0f, 8.6863f, 21.0f, 12.0f)
                curveTo(21.0f, 15.3137f, 18.3137f, 18.0f, 15.0f, 18.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(13.8954f, 14.0f, 13.0f, 13.1046f, 13.0f, 12.0f)
                curveTo(13.0f, 10.8954f, 13.8954f, 10.0f, 15.0f, 10.0f)
                curveTo(16.1046f, 10.0f, 17.0f, 10.8954f, 17.0f, 12.0f)
                curveTo(17.0f, 13.1046f, 16.1046f, 14.0f, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_polaroid-line`!!
    }

private var `_polaroid-line`: ImageVector? = null
