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

public val EditorGroup.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5957f, 5.0f)
                lineTo(10.5f, 10.9283f)
                lineTo(15.4043f, 5.0f)
                horizontalLineTo(18.0f)
                lineTo(11.7978f, 12.4971f)
                lineTo(18.0f, 19.9943f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.4091f)
                lineTo(10.5f, 14.0659f)
                lineTo(5.5909f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.9943f)
                lineTo(9.2022f, 12.4971f)
                lineTo(3.0f, 5.0f)
                horizontalLineTo(5.5957f)
                close()
                moveTo(21.5507f, 6.5803f)
                curveTo(21.7042f, 6.4345f, 21.8f, 6.2284f, 21.8f, 6.0f)
                curveTo(21.8f, 5.5582f, 21.4418f, 5.2f, 21.0f, 5.2f)
                curveTo(20.5582f, 5.2f, 20.2f, 5.5582f, 20.2f, 6.0f)
                curveTo(20.2f, 6.0762f, 20.2107f, 6.15f, 20.2306f, 6.2198f)
                lineTo(19.0765f, 6.5496f)
                curveTo(19.0267f, 6.375f, 19.0f, 6.1906f, 19.0f, 6.0f)
                curveTo(19.0f, 4.8954f, 19.8954f, 4.0f, 21.0f, 4.0f)
                curveTo(22.1046f, 4.0f, 23.0f, 4.8954f, 23.0f, 6.0f)
                curveTo(23.0f, 6.5727f, 22.7593f, 7.0892f, 22.3735f, 7.4538f)
                lineTo(20.7441f, 9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                lineTo(21.5507f, 6.5803f)
                verticalLineTo(6.5803f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
