package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Home-gear-fill`: ImageVector
    get() {
        if (`_home-gear-fill` != null) {
            return `_home-gear-fill`!!
        }
        `_home-gear-fill` = Builder(name = "Home-gear-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(20.0f, 20.5523f, 19.5523f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.7087f, 1.2648f, 12.2913f, 1.2648f, 12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(8.5921f, 13.808f)
                lineTo(7.601f, 14.3802f)
                lineTo(8.6017f, 16.1133f)
                lineTo(9.5943f, 15.5402f)
                curveTo(9.9876f, 15.9116f, 10.467f, 16.193f, 10.9994f, 16.3512f)
                verticalLineTo(17.4956f)
                horizontalLineTo(13.0007f)
                verticalLineTo(16.3512f)
                curveTo(13.5331f, 16.1929f, 14.0125f, 15.9115f, 14.4057f, 15.5401f)
                lineTo(15.3984f, 16.1132f)
                lineTo(16.399f, 14.3801f)
                lineTo(15.4079f, 13.8078f)
                curveTo(15.4696f, 13.5478f, 15.5022f, 13.2766f, 15.5022f, 12.9978f)
                curveTo(15.5022f, 12.7189f, 15.4696f, 12.4477f, 15.4078f, 12.1877f)
                lineTo(16.399f, 11.6154f)
                lineTo(15.3983f, 9.8822f)
                lineTo(14.4056f, 10.4554f)
                curveTo(14.0124f, 10.084f, 13.533f, 9.8026f, 13.0006f, 9.6444f)
                verticalLineTo(8.5f)
                horizontalLineTo(10.9993f)
                verticalLineTo(9.6444f)
                curveTo(10.4669f, 9.8027f, 9.9875f, 10.084f, 9.5942f, 10.4554f)
                lineTo(8.6016f, 9.8823f)
                lineTo(7.601f, 11.6155f)
                lineTo(8.592f, 12.1877f)
                curveTo(8.5303f, 12.4477f, 8.4977f, 12.7189f, 8.4977f, 12.9978f)
                curveTo(8.4977f, 13.2767f, 8.5303f, 13.5479f, 8.5921f, 13.808f)
                close()
                moveTo(12.0f, 14.4971f)
                curveTo(11.171f, 14.4971f, 10.499f, 13.8258f, 10.499f, 12.9978f)
                curveTo(10.499f, 12.1698f, 11.171f, 11.4985f, 12.0f, 11.4985f)
                curveTo(12.8289f, 11.4985f, 13.5009f, 12.1698f, 13.5009f, 12.9978f)
                curveTo(13.5009f, 13.8258f, 12.8289f, 14.4971f, 12.0f, 14.4971f)
                close()
            }
        }
        .build()
        return `_home-gear-fill`!!
    }

private var `_home-gear-fill`: ImageVector? = null
