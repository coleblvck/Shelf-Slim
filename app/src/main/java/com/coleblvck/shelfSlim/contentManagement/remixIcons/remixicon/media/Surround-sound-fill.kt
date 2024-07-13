package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Surround-sound-fill`: ImageVector
    get() {
        if (`_surround-sound-fill` != null) {
            return `_surround-sound-fill`!!
        }
        `_surround-sound-fill` = Builder(name = "Surround-sound-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(7.0503f, 7.1213f)
                curveTo(5.7835f, 8.3881f, 5.0f, 10.1381f, 5.0f, 12.0711f)
                curveTo(5.0f, 14.0041f, 5.7835f, 15.7541f, 7.0503f, 17.0208f)
                lineTo(8.4645f, 15.6066f)
                curveTo(7.5596f, 14.7018f, 7.0f, 13.4518f, 7.0f, 12.0711f)
                curveTo(7.0f, 10.6904f, 7.5596f, 9.4404f, 8.4645f, 8.5355f)
                lineTo(7.0503f, 7.1213f)
                close()
                moveTo(16.9497f, 7.1213f)
                lineTo(15.5355f, 8.5355f)
                curveTo(16.4404f, 9.4404f, 17.0f, 10.6904f, 17.0f, 12.0711f)
                curveTo(17.0f, 13.4518f, 16.4404f, 14.7018f, 15.5355f, 15.6066f)
                lineTo(16.9497f, 17.0208f)
                curveTo(18.2165f, 15.7541f, 19.0f, 14.0041f, 19.0f, 12.0711f)
                curveTo(19.0f, 10.1381f, 18.2165f, 8.3881f, 16.9497f, 7.1213f)
                close()
                moveTo(12.0f, 15.0711f)
                curveTo(13.6569f, 15.0711f, 15.0f, 13.7279f, 15.0f, 12.0711f)
                curveTo(15.0f, 10.4142f, 13.6569f, 9.0711f, 12.0f, 9.0711f)
                curveTo(10.3431f, 9.0711f, 9.0f, 10.4142f, 9.0f, 12.0711f)
                curveTo(9.0f, 13.7279f, 10.3431f, 15.0711f, 12.0f, 15.0711f)
                close()
                moveTo(12.0f, 13.0711f)
                curveTo(11.4477f, 13.0711f, 11.0f, 12.6234f, 11.0f, 12.0711f)
                curveTo(11.0f, 11.5188f, 11.4477f, 11.0711f, 12.0f, 11.0711f)
                curveTo(12.5523f, 11.0711f, 13.0f, 11.5188f, 13.0f, 12.0711f)
                curveTo(13.0f, 12.6234f, 12.5523f, 13.0711f, 12.0f, 13.0711f)
                close()
            }
        }
        .build()
        return `_surround-sound-fill`!!
    }

private var `_surround-sound-fill`: ImageVector? = null
