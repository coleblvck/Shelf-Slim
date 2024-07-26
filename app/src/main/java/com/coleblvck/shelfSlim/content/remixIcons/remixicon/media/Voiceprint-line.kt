package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Voiceprint-line`: ImageVector
    get() {
        if (`_voiceprint-line` != null) {
            return `_voiceprint-line`!!
        }
        `_voiceprint-line` = Builder(name = "Voiceprint-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(1.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_voiceprint-line`!!
    }

private var `_voiceprint-line`: ImageVector? = null