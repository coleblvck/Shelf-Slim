package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Phone-camera-fill`: ImageVector
    get() {
        if (`_phone-camera-fill` != null) {
            return `_phone-camera-fill`!!
        }
        `_phone-camera-fill` = Builder(name = "Phone-camera-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8027f, 4.0f)
                curveTo(14.2922f, 4.8825f, 14.0f, 5.9071f, 14.0f, 7.0f)
                curveTo(14.0f, 10.3137f, 16.6863f, 13.0f, 20.0f, 13.0f)
                curveTo(21.0929f, 13.0f, 22.1175f, 12.7078f, 23.0f, 12.1973f)
                verticalLineTo(18.9991f)
                curveTo(23.0f, 19.5519f, 22.5605f, 20.0f, 21.9975f, 20.0f)
                horizontalLineTo(2.0025f)
                curveTo(1.4488f, 20.0f, 1.0f, 19.5554f, 1.0f, 18.9991f)
                verticalLineTo(5.0009f)
                curveTo(1.0f, 4.4481f, 1.4395f, 4.0f, 2.0025f, 4.0f)
                horizontalLineTo(14.8027f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(17.7909f, 11.0f, 16.0f, 9.2091f, 16.0f, 7.0f)
                curveTo(16.0f, 4.7909f, 17.7909f, 3.0f, 20.0f, 3.0f)
                curveTo(22.2091f, 3.0f, 24.0f, 4.7909f, 24.0f, 7.0f)
                curveTo(24.0f, 9.2091f, 22.2091f, 11.0f, 20.0f, 11.0f)
                close()
                moveTo(20.0f, 9.0f)
                curveTo(21.1046f, 9.0f, 22.0f, 8.1046f, 22.0f, 7.0f)
                curveTo(22.0f, 5.8954f, 21.1046f, 5.0f, 20.0f, 5.0f)
                curveTo(18.8954f, 5.0f, 18.0f, 5.8954f, 18.0f, 7.0f)
                curveTo(18.0f, 8.1046f, 18.8954f, 9.0f, 20.0f, 9.0f)
                close()
                moveTo(19.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_phone-camera-fill`!!
    }

private var `_phone-camera-fill`: ImageVector? = null
