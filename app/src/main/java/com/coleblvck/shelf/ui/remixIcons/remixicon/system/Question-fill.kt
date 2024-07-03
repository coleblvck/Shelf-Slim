package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Question-fill`: ImageVector
    get() {
        if (`_question-fill` != null) {
            return `_question-fill`!!
        }
        `_question-fill` = Builder(name = "Question-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 13.3551f)
                curveTo(14.4457f, 12.9248f, 15.5f, 11.5855f, 15.5f, 10.0f)
                curveTo(15.5f, 8.067f, 13.933f, 6.5f, 12.0f, 6.5f)
                curveTo(10.302f, 6.5f, 8.8864f, 7.7092f, 8.5673f, 9.3135f)
                lineTo(10.5288f, 9.7058f)
                curveTo(10.6656f, 9.0182f, 11.2723f, 8.5f, 12.0f, 8.5f)
                curveTo(12.8284f, 8.5f, 13.5f, 9.1716f, 13.5f, 10.0f)
                curveTo(13.5f, 10.8284f, 12.8284f, 11.5f, 12.0f, 11.5f)
                curveTo(11.4477f, 11.5f, 11.0f, 11.9477f, 11.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.3551f)
                close()
            }
        }
        .build()
        return `_question-fill`!!
    }

private var `_question-fill`: ImageVector? = null
