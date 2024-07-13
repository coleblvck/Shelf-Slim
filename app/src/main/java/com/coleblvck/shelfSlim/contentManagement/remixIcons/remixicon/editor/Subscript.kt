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

public val EditorGroup.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5957f, 4.0f)
                lineTo(10.5f, 9.9283f)
                lineTo(15.4043f, 4.0f)
                horizontalLineTo(18.0f)
                lineTo(11.7978f, 11.4971f)
                lineTo(18.0f, 18.9943f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.4091f)
                lineTo(10.5f, 13.0659f)
                lineTo(5.5909f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.9943f)
                lineTo(9.2022f, 11.4971f)
                lineTo(3.0f, 4.0f)
                horizontalLineTo(5.5957f)
                close()
                moveTo(21.8f, 16.0f)
                curveTo(21.8f, 15.5582f, 21.4418f, 15.2f, 21.0f, 15.2f)
                curveTo(20.5582f, 15.2f, 20.2f, 15.5582f, 20.2f, 16.0f)
                curveTo(20.2f, 16.0762f, 20.2107f, 16.15f, 20.2306f, 16.2198f)
                lineTo(19.0765f, 16.5496f)
                curveTo(19.0267f, 16.375f, 19.0f, 16.1906f, 19.0f, 16.0f)
                curveTo(19.0f, 14.8954f, 19.8954f, 14.0f, 21.0f, 14.0f)
                curveTo(22.1046f, 14.0f, 23.0f, 14.8954f, 23.0f, 16.0f)
                curveTo(23.0f, 16.5727f, 22.7593f, 17.0892f, 22.3735f, 17.4538f)
                lineTo(20.7441f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                lineTo(21.5507f, 16.5803f)
                curveTo(21.7042f, 16.4345f, 21.8f, 16.2284f, 21.8f, 16.0f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
