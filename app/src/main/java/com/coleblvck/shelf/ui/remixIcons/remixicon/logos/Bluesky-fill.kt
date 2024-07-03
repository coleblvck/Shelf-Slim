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

public val LogosGroup.`Bluesky-fill`: ImageVector
    get() {
        if (`_bluesky-fill` != null) {
            return `_bluesky-fill`!!
        }
        `_bluesky-fill` = Builder(name = "Bluesky-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.3884f)
                curveTo(11.0942f, 9.6267f, 8.6283f, 6.3442f, 6.335f, 4.7259f)
                curveTo(4.1383f, 3.1751f, 3.3008f, 3.4434f, 2.7517f, 3.6926f)
                curveTo(2.1158f, 3.9784f, 2.0f, 4.9551f, 2.0f, 5.5284f)
                curveTo(2.0f, 6.1034f, 2.315f, 10.2367f, 2.52f, 10.9276f)
                curveTo(3.1992f, 13.2076f, 5.6142f, 13.9776f, 7.8392f, 13.7309f)
                curveTo(4.5792f, 14.2142f, 1.6833f, 15.4017f, 5.4808f, 19.6292f)
                curveTo(9.6583f, 23.9542f, 11.2058f, 18.7017f, 12.0f, 16.0392f)
                curveTo(12.7942f, 18.7017f, 13.7083f, 23.7651f, 18.4442f, 19.6292f)
                curveTo(22.0f, 16.0392f, 19.4208f, 14.2142f, 16.1608f, 13.7309f)
                curveTo(18.3858f, 13.9784f, 20.8008f, 13.2076f, 21.48f, 10.9276f)
                curveTo(21.685f, 10.2376f, 22.0f, 6.1026f, 22.0f, 5.5292f)
                curveTo(22.0f, 4.9542f, 21.8842f, 3.9784f, 21.2483f, 3.6909f)
                curveTo(20.6992f, 3.4426f, 19.8617f, 3.1742f, 17.665f, 4.7242f)
                curveTo(15.3717f, 6.3451f, 12.9058f, 9.6276f, 12.0f, 11.3884f)
                close()
            }
        }
        .build()
        return `_bluesky-fill`!!
    }

private var `_bluesky-fill`: ImageVector? = null
