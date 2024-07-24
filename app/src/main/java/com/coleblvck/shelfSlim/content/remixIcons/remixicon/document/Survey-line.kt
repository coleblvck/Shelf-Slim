package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Survey-line`: ImageVector
    get() {
        if (`_survey-line` != null) {
            return `_survey-line`!!
        }
        `_survey-line` = Builder(name = "Survey-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 4.0f, 21.0f, 4.445f, 21.0f, 4.9934f)
                verticalLineTo(21.0066f)
                curveTo(21.0f, 21.5552f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5551f, 3.0f, 21.0066f)
                verticalLineTo(4.9934f)
                curveTo(3.0f, 4.4448f, 3.445f, 4.0f, 3.9934f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_survey-line`!!
    }

private var `_survey-line`: ImageVector? = null
