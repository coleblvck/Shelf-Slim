package com.coleblvck.shelf.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Emoji-sticker-fill`: ImageVector
    get() {
        if (`_emoji-sticker-fill` != null) {
            return `_emoji-sticker-fill`!!
        }
        `_emoji-sticker-fill` = Builder(name = "Emoji-sticker-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9024f, 10.5976f)
                curveTo(21.4442f, 10.5333f, 20.976f, 10.5f, 20.5f, 10.5f)
                curveTo(17.2404f, 10.5f, 14.3455f, 12.0604f, 12.5212f, 14.471f)
                curveTo(12.3501f, 14.4887f, 12.1763f, 14.4978f, 12.0f, 14.4978f)
                curveTo(10.7188f, 14.4978f, 9.5522f, 14.0172f, 8.6669f, 13.2248f)
                lineTo(7.3331f, 14.7151f)
                curveTo(8.4187f, 15.6868f, 9.8114f, 16.3253f, 11.3466f, 16.4676f)
                curveTo(10.8023f, 17.7016f, 10.5f, 19.0662f, 10.5f, 20.5f)
                curveTo(10.5f, 20.976f, 10.5333f, 21.4442f, 10.5976f, 21.9024f)
                curveTo(5.7387f, 21.2205f, 2.0f, 17.0469f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.0469f, 2.0f, 21.2205f, 5.7387f, 21.9024f, 10.5976f)
                close()
                moveTo(21.8707f, 12.617f)
                curveTo(21.4254f, 12.5401f, 20.9674f, 12.5f, 20.5f, 12.5f)
                curveTo(17.7656f, 12.5f, 15.3512f, 13.8709f, 13.9068f, 15.9675f)
                curveTo(13.0194f, 17.2556f, 12.5f, 18.8156f, 12.5f, 20.5f)
                curveTo(12.5f, 20.9674f, 12.5401f, 21.4254f, 12.617f, 21.8707f)
                lineTo(21.8707f, 12.617f)
                close()
                moveTo(8.5f, 11.5f)
                curveTo(9.3284f, 11.5f, 10.0f, 10.8284f, 10.0f, 10.0f)
                curveTo(10.0f, 9.1716f, 9.3284f, 8.5f, 8.5f, 8.5f)
                curveTo(7.6716f, 8.5f, 7.0f, 9.1716f, 7.0f, 10.0f)
                curveTo(7.0f, 10.8284f, 7.6716f, 11.5f, 8.5f, 11.5f)
                close()
                moveTo(15.5f, 11.5f)
                curveTo(16.3284f, 11.5f, 17.0f, 10.8284f, 17.0f, 10.0f)
                curveTo(17.0f, 9.1716f, 16.3284f, 8.5f, 15.5f, 8.5f)
                curveTo(14.6716f, 8.5f, 14.0f, 9.1716f, 14.0f, 10.0f)
                curveTo(14.0f, 10.8284f, 14.6716f, 11.5f, 15.5f, 11.5f)
                close()
            }
        }
        .build()
        return `_emoji-sticker-fill`!!
    }

private var `_emoji-sticker-fill`: ImageVector? = null
