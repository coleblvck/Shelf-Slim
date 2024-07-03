package com.coleblvck.shelf.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Question-answer-fill`: ImageVector
    get() {
        if (`_question-answer-fill` != null) {
            return `_question-answer-fill`!!
        }
        `_question-answer-fill` = Builder(name = "Question-answer-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                horizontalLineTo(18.2372f)
                lineTo(20.0f, 19.3851f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 9.0f, 22.0f, 9.4477f, 22.0f, 10.0f)
                verticalLineTo(23.5f)
                lineTo(17.5455f, 20.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 20.0f, 8.0f, 19.5523f, 8.0f, 19.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(5.4545f, 16.0f)
                lineTo(1.0f, 19.5f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 3.4477f, 1.4477f, 3.0f, 2.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 3.0f, 18.0f, 3.4477f, 18.0f, 4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.4545f)
                close()
            }
        }
        .build()
        return `_question-answer-fill`!!
    }

private var `_question-answer-fill`: ImageVector? = null
