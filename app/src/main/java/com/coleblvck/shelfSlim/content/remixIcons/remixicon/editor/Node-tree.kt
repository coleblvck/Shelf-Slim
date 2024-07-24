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

public val EditorGroup.`Node-tree`: ImageVector
    get() {
        if (`_node-tree` != null) {
            return `_node-tree`!!
        }
        `_node-tree` = Builder(name = "Node-tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(10.5523f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 7.5523f, 10.5523f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 8.4477f, 13.4477f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 8.0f, 21.0f, 8.4477f, 21.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 13.5523f, 20.5523f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 16.4477f, 13.4477f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 16.0f, 21.0f, 16.4477f, 21.0f, 17.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 8.0f, 3.0f, 7.5523f, 3.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_node-tree`!!
    }

private var `_node-tree`: ImageVector? = null
