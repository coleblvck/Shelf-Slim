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

public val UserGroup.`Emotion-laugh-fill`: ImageVector
    get() {
        if (`_emotion-laugh-fill` != null) {
            return `_emotion-laugh-fill`!!
        }
        `_emotion-laugh-fill` = Builder(name = "Emotion-laugh-fill", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 11.0f)
                curveTo(10.0f, 11.0f, 8.3333f, 11.3333f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7614f, 17.0f, 12.0f)
                curveTo(15.6667f, 11.3333f, 14.0f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(7.3479f, 7.0f, 6.3779f, 7.7793f, 6.0882f, 8.8395f)
                lineTo(6.0499f, 9.0006f)
                horizontalLineTo(10.9501f)
                curveTo(10.7187f, 7.8592f, 9.7097f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(14.3479f, 7.0f, 13.3779f, 7.7793f, 13.0882f, 8.8395f)
                lineTo(13.0499f, 9.0006f)
                horizontalLineTo(17.9501f)
                curveTo(17.7187f, 7.8592f, 16.7097f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return `_emotion-laugh-fill`!!
    }

private var `_emotion-laugh-fill`: ImageVector? = null
