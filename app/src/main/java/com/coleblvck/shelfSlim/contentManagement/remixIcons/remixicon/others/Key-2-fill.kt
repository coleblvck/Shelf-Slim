package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Key-2-fill`: ImageVector
    get() {
        if (`_key-2-fill` != null) {
            return `_key-2-fill`!!
        }
        `_key-2-fill` = Builder(name = "Key-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.313f, 11.5656f)
                lineTo(18.253f, 3.6256f)
                lineTo(20.3744f, 5.7469f)
                lineTo(18.9602f, 7.1611f)
                lineTo(21.0815f, 9.2825f)
                lineTo(17.5459f, 12.818f)
                lineTo(15.4246f, 10.6967f)
                lineTo(12.4343f, 13.687f)
                curveTo(13.4182f, 15.5719f, 13.1186f, 17.9524f, 11.5355f, 19.5355f)
                curveTo(9.5829f, 21.4881f, 6.4171f, 21.4881f, 4.4645f, 19.5355f)
                curveTo(2.5118f, 17.5829f, 2.5118f, 14.4171f, 4.4645f, 12.4644f)
                curveTo(6.0476f, 10.8814f, 8.4281f, 10.5818f, 10.313f, 11.5656f)
                close()
                moveTo(9.4142f, 17.4142f)
                curveTo(10.1953f, 16.6331f, 10.1953f, 15.3668f, 9.4142f, 14.5858f)
                curveTo(8.6332f, 13.8047f, 7.3668f, 13.8047f, 6.5858f, 14.5858f)
                curveTo(5.8047f, 15.3668f, 5.8047f, 16.6331f, 6.5858f, 17.4142f)
                curveTo(7.3668f, 18.1952f, 8.6332f, 18.1952f, 9.4142f, 17.4142f)
                close()
            }
        }
        .build()
        return `_key-2-fill`!!
    }

private var `_key-2-fill`: ImageVector? = null
