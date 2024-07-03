package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`List-check`: ImageVector
    get() {
        if (`_list-check` != null) {
            return `_list-check`!!
        }
        `_list-check` = Builder(name = "List-check", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(3.0f, 3.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(3.0f, 10.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(3.0f, 17.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.5f)
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
        return `_list-check`!!
    }

private var `_list-check`: ImageVector? = null
