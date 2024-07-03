package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Apple-fill`: ImageVector
    get() {
        if (`_apple-fill` != null) {
            return `_apple-fill`!!
        }
        `_apple-fill` = Builder(name = "Apple-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6734f, 7.222f)
                curveTo(10.7974f, 7.222f, 9.4414f, 6.226f, 8.0134f, 6.262f)
                curveTo(6.1294f, 6.286f, 4.4014f, 7.354f, 3.4294f, 9.046f)
                curveTo(1.4734f, 12.442f, 2.9254f, 17.458f, 4.8334f, 20.218f)
                curveTo(5.7694f, 21.562f, 6.8734f, 23.074f, 8.3374f, 23.026f)
                curveTo(9.7414f, 22.966f, 10.2694f, 22.114f, 11.9734f, 22.114f)
                curveTo(13.6654f, 22.114f, 14.1454f, 23.026f, 15.6334f, 22.99f)
                curveTo(17.1454f, 22.966f, 18.1054f, 21.622f, 19.0294f, 20.266f)
                curveTo(20.0974f, 18.706f, 20.5414f, 17.194f, 20.5654f, 17.11f)
                curveTo(20.5294f, 17.098f, 17.6254f, 15.982f, 17.5894f, 12.622f)
                curveTo(17.5654f, 9.814f, 19.8814f, 8.47f, 19.9894f, 8.41f)
                curveTo(18.6694f, 6.478f, 16.6414f, 6.262f, 15.9334f, 6.214f)
                curveTo(14.0854f, 6.07f, 12.5374f, 7.222f, 11.6734f, 7.222f)
                close()
                moveTo(14.7934f, 4.39f)
                curveTo(15.5734f, 3.454f, 16.0894f, 2.146f, 15.9454f, 0.85f)
                curveTo(14.8294f, 0.898f, 13.4854f, 1.594f, 12.6814f, 2.53f)
                curveTo(11.9614f, 3.358f, 11.3374f, 4.69f, 11.5054f, 5.962f)
                curveTo(12.7414f, 6.058f, 14.0134f, 5.326f, 14.7934f, 4.39f)
                close()
            }
        }
        .build()
        return `_apple-fill`!!
    }

private var `_apple-fill`: ImageVector? = null
