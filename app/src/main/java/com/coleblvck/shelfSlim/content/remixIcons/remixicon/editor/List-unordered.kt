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

public val EditorGroup.`List-unordered`: ImageVector
    get() {
        if (`_list-unordered` != null) {
            return `_list-unordered`!!
        }
        `_list-unordered` = Builder(name = "List-unordered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.5f, 6.5f)
                curveTo(3.6716f, 6.5f, 3.0f, 5.8284f, 3.0f, 5.0f)
                curveTo(3.0f, 4.1716f, 3.6716f, 3.5f, 4.5f, 3.5f)
                curveTo(5.3284f, 3.5f, 6.0f, 4.1716f, 6.0f, 5.0f)
                curveTo(6.0f, 5.8284f, 5.3284f, 6.5f, 4.5f, 6.5f)
                close()
                moveTo(4.5f, 13.5f)
                curveTo(3.6716f, 13.5f, 3.0f, 12.8284f, 3.0f, 12.0f)
                curveTo(3.0f, 11.1716f, 3.6716f, 10.5f, 4.5f, 10.5f)
                curveTo(5.3284f, 10.5f, 6.0f, 11.1716f, 6.0f, 12.0f)
                curveTo(6.0f, 12.8284f, 5.3284f, 13.5f, 4.5f, 13.5f)
                close()
                moveTo(4.5f, 20.4f)
                curveTo(3.6716f, 20.4f, 3.0f, 19.7284f, 3.0f, 18.9f)
                curveTo(3.0f, 18.0716f, 3.6716f, 17.4f, 4.5f, 17.4f)
                curveTo(5.3284f, 17.4f, 6.0f, 18.0716f, 6.0f, 18.9f)
                curveTo(6.0f, 19.7284f, 5.3284f, 20.4f, 4.5f, 20.4f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_list-unordered`!!
    }

private var `_list-unordered`: ImageVector? = null
