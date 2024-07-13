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

public val EditorGroup.`Text-direction-l`: ImageVector
    get() {
        if (`_text-direction-l` != null) {
            return `_text-direction-l`!!
        }
        `_text-direction-l` = Builder(name = "Text-direction-l", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                curveTo(6.7909f, 11.0f, 5.0f, 9.2091f, 5.0f, 7.0f)
                curveTo(5.0f, 4.7909f, 6.7909f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveTo(7.8954f, 5.0f, 7.0f, 5.8954f, 7.0f, 7.0f)
                curveTo(7.0f, 8.1046f, 7.8954f, 9.0f, 9.0f, 9.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineTo(14.5f)
                lineTo(21.0f, 18.0f)
                lineTo(17.0f, 21.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_text-direction-l`!!
    }

private var `_text-direction-l`: ImageVector? = null