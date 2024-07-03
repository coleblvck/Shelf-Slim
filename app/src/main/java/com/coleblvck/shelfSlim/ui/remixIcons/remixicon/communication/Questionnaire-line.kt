package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Questionnaire-line`: ImageVector
    get() {
        if (`_questionnaire-line` != null) {
            return `_questionnaire-line`!!
        }
        `_questionnaire-line` = Builder(name = "Questionnaire-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7628f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.3851f)
                lineTo(5.7628f, 17.0f)
                close()
                moveTo(6.4545f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.5523f, 21.5523f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.4545f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(8.5673f, 8.8135f)
                curveTo(8.8864f, 7.2092f, 10.302f, 6.0f, 12.0f, 6.0f)
                curveTo(13.933f, 6.0f, 15.5f, 7.567f, 15.5f, 9.5f)
                curveTo(15.5f, 11.433f, 13.933f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                curveTo(12.8284f, 11.0f, 13.5f, 10.3284f, 13.5f, 9.5f)
                curveTo(13.5f, 8.6716f, 12.8284f, 8.0f, 12.0f, 8.0f)
                curveTo(11.2723f, 8.0f, 10.6656f, 8.5182f, 10.5288f, 9.2058f)
                lineTo(8.5673f, 8.8135f)
                close()
            }
        }
        .build()
        return `_questionnaire-line`!!
    }

private var `_questionnaire-line`: ImageVector? = null
