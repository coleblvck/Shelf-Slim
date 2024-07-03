package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Flutter-fill`: ImageVector
    get() {
        if (`_flutter-fill` != null) {
            return `_flutter-fill`!!
        }
        `_flutter-fill` = Builder(name = "Flutter-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5039f, 2.001f)
                lineTo(3.5039f, 12.001f)
                lineTo(6.5872f, 15.0843f)
                lineTo(19.6673f, 2.001f)
                horizontalLineTo(13.5039f)
                close()
                moveTo(13.4985f, 11.1989f)
                lineTo(8.1233f, 16.6199f)
                lineTo(13.4956f, 21.9998f)
                horizontalLineTo(19.6842f)
                lineTo(14.2975f, 16.5999f)
                lineTo(19.6856f, 11.1998f)
                lineTo(13.4985f, 11.1989f)
                close()
            }
        }
        .build()
        return `_flutter-fill`!!
    }

private var `_flutter-fill`: ImageVector? = null
