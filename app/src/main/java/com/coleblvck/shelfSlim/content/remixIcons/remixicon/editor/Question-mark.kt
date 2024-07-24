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

public val EditorGroup.`Question-mark`: ImageVector
    get() {
        if (`_question-mark` != null) {
            return `_question-mark`!!
        }
        `_question-mark` = Builder(name = "Question-mark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.8284f, 19.0f, 13.5f, 19.6716f, 13.5f, 20.5f)
                curveTo(13.5f, 21.3284f, 12.8284f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1716f, 22.0f, 10.5f, 21.3284f, 10.5f, 20.5f)
                curveTo(10.5f, 19.6716f, 11.1716f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                curveTo(18.0f, 10.1646f, 17.2474f, 11.2907f, 15.3259f, 12.9231f)
                curveTo(13.3986f, 14.5604f, 13.0f, 15.2969f, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 14.526f, 11.787f, 13.3052f, 14.031f, 11.3989f)
                curveTo(15.5479f, 10.1102f, 16.0f, 9.4337f, 16.0f, 8.0f)
                curveTo(16.0f, 5.7909f, 14.2091f, 4.0f, 12.0f, 4.0f)
                curveTo(9.7909f, 4.0f, 8.0f, 5.7909f, 8.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_question-mark`!!
    }

private var `_question-mark`: ImageVector? = null
