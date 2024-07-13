package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Trello-fill`: ImageVector
    get() {
        if (`_trello-fill` != null) {
            return `_trello-fill`!!
        }
        `_trello-fill` = Builder(name = "Trello-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.251f, 3.0f)
                horizontalLineTo(18.751f)
                curveTo(19.993f, 3.0f, 21.001f, 4.0074f, 21.001f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(21.001f, 19.992f, 19.9935f, 21.0f, 18.751f, 21.0f)
                horizontalLineTo(5.251f)
                curveTo(4.009f, 21.0f, 3.001f, 19.9925f, 3.001f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(3.001f, 4.008f, 4.0083f, 3.0f, 5.251f, 3.0f)
                close()
                moveTo(13.171f, 6.4205f)
                verticalLineTo(12.1795f)
                curveTo(13.171f, 12.7762f, 13.6545f, 13.26f, 14.2507f, 13.26f)
                horizontalLineTo(17.5812f)
                curveTo(18.1776f, 13.26f, 18.661f, 12.7765f, 18.661f, 12.1795f)
                verticalLineTo(6.4205f)
                curveTo(18.661f, 5.8238f, 18.1774f, 5.34f, 17.5812f, 5.34f)
                horizontalLineTo(14.2507f)
                curveTo(13.6543f, 5.34f, 13.171f, 5.8235f, 13.171f, 6.4205f)
                close()
                moveTo(5.341f, 6.4205f)
                verticalLineTo(16.6796f)
                curveTo(5.341f, 17.2762f, 5.8246f, 17.76f, 6.4207f, 17.76f)
                horizontalLineTo(9.7513f)
                curveTo(10.3476f, 17.76f, 10.831f, 17.277f, 10.831f, 16.6796f)
                verticalLineTo(6.4205f)
                curveTo(10.831f, 5.8238f, 10.3474f, 5.34f, 9.7513f, 5.34f)
                horizontalLineTo(6.4207f)
                curveTo(5.8243f, 5.34f, 5.341f, 5.823f, 5.341f, 6.4205f)
                close()
            }
        }
        .build()
        return `_trello-fill`!!
    }

private var `_trello-fill`: ImageVector? = null
