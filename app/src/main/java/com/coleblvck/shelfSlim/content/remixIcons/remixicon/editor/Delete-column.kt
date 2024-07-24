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

public val EditorGroup.`Delete-column`: ImageVector
    get() {
        if (`_delete-column` != null) {
            return `_delete-column`!!
        }
        `_delete-column` = Builder(name = "Delete-column", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
                lineTo(12.9998f, 11.9998f)
                curveTo(13.8355f, 11.372f, 14.8743f, 11.0f, 16.0f, 11.0f)
                curveTo(18.7614f, 11.0f, 21.0f, 13.2386f, 21.0f, 16.0f)
                curveTo(21.0f, 18.7614f, 18.7614f, 21.0f, 16.0f, 21.0f)
                curveTo(14.9681f, 21.0f, 14.0092f, 20.6874f, 13.2129f, 20.1518f)
                lineTo(13.0f, 20.0f)
                curveTo(13.0f, 20.5523f, 12.5523f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 21.0f, 5.0f, 20.5523f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.4477f, 5.4477f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_delete-column`!!
    }

private var `_delete-column`: ImageVector? = null
