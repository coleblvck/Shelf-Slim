package com.coleblvck.shelfSlim.content.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Question-answer-line`: ImageVector
    get() {
        if (`_question-answer-line` != null) {
            return `_question-answer-line`!!
        }
        `_question-answer-line` = Builder(name = "Question-answer-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4545f, 15.0f)
                lineTo(1.0f, 18.5f)
                verticalLineTo(3.0f)
                curveTo(1.0f, 2.4477f, 1.4477f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 2.0f, 18.0f, 2.4477f, 18.0f, 3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.4545f)
                close()
                moveTo(4.7628f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.3851f)
                lineTo(4.7628f, 13.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineTo(18.2372f)
                lineTo(20.0f, 18.3851f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 8.4477f, 22.0f, 9.0f)
                verticalLineTo(22.5f)
                lineTo(17.5455f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 19.0f, 8.0f, 18.5523f, 8.0f, 18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_question-answer-line`!!
    }

private var `_question-answer-line`: ImageVector? = null
