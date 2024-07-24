package com.coleblvck.shelfSlim.content.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.UserGroup

public val UserGroup.`Emotion-laugh-line`: ImageVector
    get() {
        if (`_emotion-laugh-line` != null) {
            return `_emotion-laugh-line`!!
        }
        `_emotion-laugh-line` = Builder(name = "Emotion-laugh-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.0f, 11.0f, 15.6667f, 11.3333f, 17.0f, 12.0f)
                curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                curveTo(8.3333f, 11.3333f, 10.0f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(9.7097f, 7.0f, 10.7187f, 7.8592f, 10.9501f, 9.0006f)
                horizontalLineTo(6.0499f)
                curveTo(6.2813f, 7.8592f, 7.2903f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(16.7097f, 7.0f, 17.7187f, 7.8592f, 17.9501f, 9.0006f)
                horizontalLineTo(13.0499f)
                curveTo(13.2813f, 7.8592f, 14.2903f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return `_emotion-laugh-line`!!
    }

private var `_emotion-laugh-line`: ImageVector? = null
