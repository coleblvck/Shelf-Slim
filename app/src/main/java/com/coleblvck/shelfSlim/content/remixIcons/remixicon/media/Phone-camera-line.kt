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

public val MediaGroup.`Phone-camera-line`: ImageVector
    get() {
        if (`_phone-camera-line` != null) {
            return `_phone-camera-line`!!
        }
        `_phone-camera-line` = Builder(name = "Phone-camera-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8027f, 4.0f)
                curveTo(14.4513f, 4.6074f, 14.2034f, 5.2821f, 14.083f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.917f)
                curveTo(21.7179f, 12.7966f, 22.3926f, 12.5487f, 23.0f, 12.1973f)
                verticalLineTo(18.9991f)
                curveTo(23.0f, 19.5519f, 22.5605f, 20.0f, 21.9975f, 20.0f)
                horizontalLineTo(2.0025f)
                curveTo(1.4488f, 20.0f, 1.0f, 19.5554f, 1.0f, 18.9991f)
                verticalLineTo(5.0009f)
                curveTo(1.0f, 4.4481f, 1.4395f, 4.0f, 2.0025f, 4.0f)
                horizontalLineTo(14.8027f)
                close()
                moveTo(20.0f, 9.0f)
                curveTo(21.1046f, 9.0f, 22.0f, 8.1046f, 22.0f, 7.0f)
                curveTo(22.0f, 5.8954f, 21.1046f, 5.0f, 20.0f, 5.0f)
                curveTo(18.8954f, 5.0f, 18.0f, 5.8954f, 18.0f, 7.0f)
                curveTo(18.0f, 8.1046f, 18.8954f, 9.0f, 20.0f, 9.0f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(17.7909f, 11.0f, 16.0f, 9.2091f, 16.0f, 7.0f)
                curveTo(16.0f, 4.7909f, 17.7909f, 3.0f, 20.0f, 3.0f)
                curveTo(22.2091f, 3.0f, 24.0f, 4.7909f, 24.0f, 7.0f)
                curveTo(24.0f, 9.2091f, 22.2091f, 11.0f, 20.0f, 11.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_phone-camera-line`!!
    }

private var `_phone-camera-line`: ImageVector? = null
