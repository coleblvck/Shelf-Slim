package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Stacked-view`: ImageVector
    get() {
        if (`_stacked-view` != null) {
            return `_stacked-view`!!
        }
        `_stacked-view` = Builder(name = "Stacked-view", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(3.4477f, 2.0f, 3.0f, 2.4477f, 3.0f, 3.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 14.5523f, 3.4477f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 15.0f, 21.0f, 14.5523f, 21.0f, 14.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.4477f, 20.5523f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.0f, 17.0f)
                curveTo(3.4477f, 17.0f, 3.0f, 17.4477f, 3.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 17.4477f, 20.5523f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_stacked-view`!!
    }

private var `_stacked-view`: ImageVector? = null
