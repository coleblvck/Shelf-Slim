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

public val EditorGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9998f, 3.0f)
                lineTo(12.9996f, 10.267f)
                lineTo(19.294f, 6.634f)
                lineTo(20.294f, 8.366f)
                lineTo(14.0006f, 11.999f)
                lineTo(20.294f, 15.634f)
                lineTo(19.294f, 17.366f)
                lineTo(12.9996f, 13.732f)
                lineTo(12.9998f, 21.0f)
                horizontalLineTo(10.9998f)
                lineTo(10.9996f, 13.732f)
                lineTo(4.7056f, 17.366f)
                lineTo(3.7056f, 15.634f)
                lineTo(9.9986f, 12.0f)
                lineTo(3.7056f, 8.366f)
                lineTo(4.7056f, 6.634f)
                lineTo(10.9996f, 10.267f)
                lineTo(10.9998f, 3.0f)
                horizontalLineTo(12.9998f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
