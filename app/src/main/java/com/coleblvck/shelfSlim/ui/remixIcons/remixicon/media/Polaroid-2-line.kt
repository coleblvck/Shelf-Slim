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

public val MediaGroup.`Polaroid-2-line`: ImageVector
    get() {
        if (`_polaroid-2-line` != null) {
            return `_polaroid-2-line`!!
        }
        `_polaroid-2-line` = Builder(name = "Polaroid-2-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(3.0f, 3.9934f)
                curveTo(3.0f, 3.4448f, 3.445f, 3.0f, 3.9934f, 3.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 3.0f, 21.0f, 3.445f, 21.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(21.0f, 20.5552f, 20.5551f, 21.0f, 20.0066f, 21.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 21.0f, 3.0f, 20.5551f, 3.0f, 20.0066f)
                verticalLineTo(3.9934f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8954f, 13.1046f, 8.0f, 12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 8.8954f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(9.7909f, 14.0f, 8.0f, 12.2091f, 8.0f, 10.0f)
                curveTo(8.0f, 7.7909f, 9.7909f, 6.0f, 12.0f, 6.0f)
                curveTo(14.2091f, 6.0f, 16.0f, 7.7909f, 16.0f, 10.0f)
                curveTo(16.0f, 12.2091f, 14.2091f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_polaroid-2-line`!!
    }

private var `_polaroid-2-line`: ImageVector? = null