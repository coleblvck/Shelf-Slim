package com.coleblvck.shelf.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`List-radio`: ImageVector
    get() {
        if (`_list-radio` != null) {
            return `_list-radio`!!
        }
        `_list-radio` = Builder(name = "List-radio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                curveTo(8.5f, 5.8954f, 7.6046f, 5.0f, 6.5f, 5.0f)
                curveTo(5.3954f, 5.0f, 4.5f, 5.8954f, 4.5f, 7.0f)
                curveTo(4.5f, 8.1046f, 5.3954f, 9.0f, 6.5f, 9.0f)
                curveTo(7.6046f, 9.0f, 8.5f, 8.1046f, 8.5f, 7.0f)
                close()
                moveTo(10.5f, 7.0f)
                curveTo(10.5f, 9.2091f, 8.7091f, 11.0f, 6.5f, 11.0f)
                curveTo(4.2909f, 11.0f, 2.5f, 9.2091f, 2.5f, 7.0f)
                curveTo(2.5f, 4.7909f, 4.2909f, 3.0f, 6.5f, 3.0f)
                curveTo(8.7091f, 3.0f, 10.5f, 4.7909f, 10.5f, 7.0f)
                close()
                moveTo(21.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveTo(5.3954f, 19.0f, 4.5f, 18.1046f, 4.5f, 17.0f)
                curveTo(4.5f, 15.8954f, 5.3954f, 15.0f, 6.5f, 15.0f)
                curveTo(7.6046f, 15.0f, 8.5f, 15.8954f, 8.5f, 17.0f)
                curveTo(8.5f, 18.1046f, 7.6046f, 19.0f, 6.5f, 19.0f)
                close()
                moveTo(6.5f, 21.0f)
                curveTo(8.7091f, 21.0f, 10.5f, 19.2091f, 10.5f, 17.0f)
                curveTo(10.5f, 14.7909f, 8.7091f, 13.0f, 6.5f, 13.0f)
                curveTo(4.2909f, 13.0f, 2.5f, 14.7909f, 2.5f, 17.0f)
                curveTo(2.5f, 19.2091f, 4.2909f, 21.0f, 6.5f, 21.0f)
                close()
                moveTo(6.5f, 8.0f)
                curveTo(7.0523f, 8.0f, 7.5f, 7.5523f, 7.5f, 7.0f)
                curveTo(7.5f, 6.4477f, 7.0523f, 6.0f, 6.5f, 6.0f)
                curveTo(5.9477f, 6.0f, 5.5f, 6.4477f, 5.5f, 7.0f)
                curveTo(5.5f, 7.5523f, 5.9477f, 8.0f, 6.5f, 8.0f)
                close()
            }
        }
        .build()
        return `_list-radio`!!
    }

private var `_list-radio`: ImageVector? = null
