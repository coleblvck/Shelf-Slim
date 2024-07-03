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

public val EditorGroup.Formula: ImageVector
    get() {
        if (_formula != null) {
            return _formula!!
        }
        _formula = Builder(name = "Formula", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(7.7909f, 2.0f, 6.0f, 3.7909f, 6.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 19.1046f, 5.1046f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(6.2091f, 22.0f, 8.0f, 20.2091f, 8.0f, 18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 4.8954f, 8.8954f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(15.2022f, 16.9971f)
                lineTo(11.8907f, 21.0f)
                horizontalLineTo(14.4864f)
                lineTo(16.5f, 18.5659f)
                lineTo(18.5137f, 21.0f)
                horizontalLineTo(21.1093f)
                lineTo(17.7979f, 16.9971f)
                lineTo(21.1046f, 13.0f)
                horizontalLineTo(18.5089f)
                lineTo(16.5f, 15.4283f)
                lineTo(14.4912f, 13.0f)
                horizontalLineTo(11.8955f)
                lineTo(15.2022f, 16.9971f)
                close()
            }
        }
        .build()
        return _formula!!
    }

private var _formula: ImageVector? = null
