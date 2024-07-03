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

public val EditorGroup.Omega: ImageVector
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = Builder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                verticalLineTo(17.8432f)
                curveTo(15.8631f, 16.6512f, 17.5f, 13.9677f, 17.5f, 10.8844f)
                curveTo(17.5f, 7.8107f, 15.5f, 4.8552f, 12.0f, 4.8552f)
                curveTo(8.5f, 4.8552f, 6.5f, 7.8107f, 6.5f, 10.8844f)
                curveTo(6.5f, 13.9677f, 8.1369f, 16.6512f, 10.0f, 17.8432f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.7597f)
                curveTo(5.6663f, 16.5054f, 4.0f, 13.9889f, 4.0f, 10.8844f)
                curveTo(4.0f, 6.2465f, 7.5f, 3.0f, 12.0f, 3.0f)
                curveTo(16.5f, 3.0f, 20.0f, 6.2465f, 20.0f, 10.8844f)
                curveTo(20.0f, 13.9889f, 18.3336f, 16.5054f, 16.2403f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _omega!!
    }

private var _omega: ImageVector? = null
