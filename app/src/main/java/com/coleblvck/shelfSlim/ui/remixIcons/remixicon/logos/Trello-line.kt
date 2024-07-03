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

public val LogosGroup.`Trello-line`: ImageVector
    get() {
        if (`_trello-line` != null) {
            return `_trello-line`!!
        }
        `_trello-line` = Builder(name = "Trello-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.001f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.001f)
                close()
                moveTo(5.001f, 3.0f)
                horizontalLineTo(19.001f)
                curveTo(20.1055f, 3.0f, 21.001f, 3.8954f, 21.001f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.001f, 20.1046f, 20.1055f, 21.0f, 19.001f, 21.0f)
                horizontalLineTo(5.001f)
                curveTo(3.8964f, 21.0f, 3.001f, 20.1046f, 3.001f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.001f, 3.8954f, 3.8964f, 3.0f, 5.001f, 3.0f)
                close()
                moveTo(8.001f, 7.0f)
                horizontalLineTo(10.001f)
                curveTo(10.5533f, 7.0f, 11.001f, 7.4477f, 11.001f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(11.001f, 16.5523f, 10.5533f, 17.0f, 10.001f, 17.0f)
                horizontalLineTo(8.001f)
                curveTo(7.4487f, 17.0f, 7.001f, 16.5523f, 7.001f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(7.001f, 7.4477f, 7.4487f, 7.0f, 8.001f, 7.0f)
                close()
                moveTo(14.001f, 7.0f)
                horizontalLineTo(16.001f)
                curveTo(16.5533f, 7.0f, 17.001f, 7.4477f, 17.001f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(17.001f, 12.5523f, 16.5533f, 13.0f, 16.001f, 13.0f)
                horizontalLineTo(14.001f)
                curveTo(13.4487f, 13.0f, 13.001f, 12.5523f, 13.001f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(13.001f, 7.4477f, 13.4487f, 7.0f, 14.001f, 7.0f)
                close()
            }
        }
        .build()
        return `_trello-line`!!
    }

private var `_trello-line`: ImageVector? = null
