package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Id-card-line`: ImageVector
    get() {
        if (`_id-card-line` != null) {
            return `_id-card-line`!!
        }
        `_id-card-line` = Builder(name = "Id-card-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(2.0f, 4.0f)
                curveTo(1.4477f, 4.0f, 1.0f, 4.4477f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.5523f, 1.4477f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 20.0f, 23.0f, 19.5523f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 4.4477f, 22.5523f, 4.0f, 22.0f, 4.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(10.5f, 10.0f)
                curveTo(10.5f, 11.3807f, 9.3807f, 12.5f, 8.0f, 12.5f)
                curveTo(6.6193f, 12.5f, 5.5f, 11.3807f, 5.5f, 10.0f)
                curveTo(5.5f, 8.6193f, 6.6193f, 7.5f, 8.0f, 7.5f)
                curveTo(9.3807f, 7.5f, 10.5f, 8.6193f, 10.5f, 10.0f)
                close()
                moveTo(8.0f, 13.5f)
                curveTo(6.067f, 13.5f, 4.5f, 15.067f, 4.5f, 17.0f)
                horizontalLineTo(11.5f)
                curveTo(11.5f, 15.067f, 9.933f, 13.5f, 8.0f, 13.5f)
                close()
            }
        }
        .build()
        return `_id-card-line`!!
    }

private var `_id-card-line`: ImageVector? = null
