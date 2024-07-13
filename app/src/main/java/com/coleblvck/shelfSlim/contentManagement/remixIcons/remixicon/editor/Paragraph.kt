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

public val EditorGroup.Paragraph: ImageVector
    get() {
        if (_paragraph != null) {
            return _paragraph!!
        }
        _paragraph = Builder(name = "Paragraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                curveTo(6.6863f, 16.0f, 4.0f, 13.3137f, 4.0f, 10.0f)
                curveTo(4.0f, 6.6863f, 6.6863f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(7.7909f, 6.0f, 6.0f, 7.7909f, 6.0f, 10.0f)
                curveTo(6.0f, 12.2091f, 7.7909f, 14.0f, 10.0f, 14.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
