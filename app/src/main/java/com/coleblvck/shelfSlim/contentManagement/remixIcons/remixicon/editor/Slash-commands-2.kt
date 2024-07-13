package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Slash-commands-2`: ImageVector
    get() {
        if (`_slash-commands-2` != null) {
            return `_slash-commands-2`!!
        }
        `_slash-commands-2` = Builder(name = "Slash-commands-2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.3431f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 4.4477f, 4.4477f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 4.0f, 20.0f, 4.4477f, 20.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.5523f, 19.5523f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 20.0f, 4.0f, 19.5523f, 4.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.7232f, 18.0f)
                lineTo(16.5803f, 6.0f)
                horizontalLineTo(14.2768f)
                lineTo(7.4197f, 18.0f)
                horizontalLineTo(9.7232f)
                close()
            }
        }
        .build()
        return `_slash-commands-2`!!
    }

private var `_slash-commands-2`: ImageVector? = null
