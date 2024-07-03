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

public val EditorGroup.Emphasis: ImageVector
    get() {
        if (_emphasis != null) {
            return _emphasis!!
        }
        _emphasis = Builder(name = "Emphasis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.8284f, 19.0f, 13.5f, 19.6716f, 13.5f, 20.5f)
                curveTo(13.5f, 21.3284f, 12.8284f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1716f, 22.0f, 10.5f, 21.3284f, 10.5f, 20.5f)
                curveTo(10.5f, 19.6716f, 11.1716f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveTo(7.3284f, 19.0f, 8.0f, 19.6716f, 8.0f, 20.5f)
                curveTo(8.0f, 21.3284f, 7.3284f, 22.0f, 6.5f, 22.0f)
                curveTo(5.6716f, 22.0f, 5.0f, 21.3284f, 5.0f, 20.5f)
                curveTo(5.0f, 19.6716f, 5.6716f, 19.0f, 6.5f, 19.0f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(18.3284f, 19.0f, 19.0f, 19.6716f, 19.0f, 20.5f)
                curveTo(19.0f, 21.3284f, 18.3284f, 22.0f, 17.5f, 22.0f)
                curveTo(16.6716f, 22.0f, 16.0f, 21.3284f, 16.0f, 20.5f)
                curveTo(16.0f, 19.6716f, 16.6716f, 19.0f, 17.5f, 19.0f)
                close()
                moveTo(18.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _emphasis!!
    }

private var _emphasis: ImageVector? = null
