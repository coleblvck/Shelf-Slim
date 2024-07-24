package com.coleblvck.shelfSlim.content.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.UserGroup

public val UserGroup.`Star-smile-fill`: ImageVector
    get() {
        if (`_star-smile-fill` != null) {
            return `_star-smile-fill`!!
        }
        `_star-smile-fill` = Builder(name = "Star-smile-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9996f, 0.5f)
                lineTo(16.2256f, 6.6834f)
                lineTo(23.4123f, 8.7918f)
                lineTo(18.8374f, 14.7217f)
                lineTo(19.053f, 22.2082f)
                lineTo(11.9996f, 19.6897f)
                lineTo(4.9462f, 22.2082f)
                lineTo(5.1618f, 14.7217f)
                lineTo(0.5869f, 8.7918f)
                lineTo(7.7736f, 6.6834f)
                lineTo(11.9996f, 0.5f)
                close()
                moveTo(9.9996f, 12.0f)
                horizontalLineTo(7.9996f)
                curveTo(7.9996f, 14.2091f, 9.7905f, 16.0f, 11.9996f, 16.0f)
                curveTo(14.1418f, 16.0f, 15.8907f, 14.316f, 15.9947f, 12.1996f)
                lineTo(15.9996f, 12.0f)
                horizontalLineTo(13.9996f)
                curveTo(13.9996f, 13.1046f, 13.1042f, 14.0f, 11.9996f, 14.0f)
                curveTo(10.9452f, 14.0f, 10.0814f, 13.1841f, 10.0051f, 12.1493f)
                lineTo(9.9996f, 12.0f)
                close()
            }
        }
        .build()
        return `_star-smile-fill`!!
    }

private var `_star-smile-fill`: ImageVector? = null
