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

public val UserGroup.`Account-pin-box-line`: ImageVector
    get() {
        if (`_account-pin-box-line` != null) {
            return `_account-pin-box-line`!!
        }
        `_account-pin-box-line` = Builder(name = "Account-pin-box-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                lineTo(12.0f, 23.0f)
                lineTo(10.0f, 21.0f)
                horizontalLineTo(4.9951f)
                curveTo(3.8932f, 21.0f, 3.0f, 20.1074f, 3.0f, 19.0049f)
                verticalLineTo(4.9951f)
                curveTo(3.0f, 3.8932f, 3.8926f, 3.0f, 4.9951f, 3.0f)
                horizontalLineTo(19.0049f)
                curveTo(20.1068f, 3.0f, 21.0f, 3.8926f, 21.0f, 4.9951f)
                verticalLineTo(19.0049f)
                curveTo(21.0f, 20.1068f, 20.1074f, 21.0f, 19.0049f, 21.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(19.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.8284f)
                lineTo(12.0f, 20.1716f)
                lineTo(13.1716f, 19.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(7.9722f, 18.1808f)
                curveTo(7.3535f, 17.9129f, 6.7672f, 17.5843f, 6.2208f, 17.2024f)
                curveTo(7.4677f, 15.2753f, 9.636f, 14.0f, 12.1022f, 14.0f)
                curveTo(14.5015f, 14.0f, 16.6189f, 15.2071f, 17.8801f, 17.0472f)
                curveTo(17.3438f, 17.4436f, 16.7664f, 17.7877f, 16.1555f, 18.0718f)
                curveTo(15.2472f, 16.8166f, 13.77f, 16.0f, 12.1022f, 16.0f)
                curveTo(10.3865f, 16.0f, 8.8727f, 16.8641f, 7.9722f, 18.1808f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.067f, 13.0f, 8.5f, 11.433f, 8.5f, 9.5f)
                curveTo(8.5f, 7.567f, 10.067f, 6.0f, 12.0f, 6.0f)
                curveTo(13.933f, 6.0f, 15.5f, 7.567f, 15.5f, 9.5f)
                curveTo(15.5f, 11.433f, 13.933f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.8284f, 11.0f, 13.5f, 10.3284f, 13.5f, 9.5f)
                curveTo(13.5f, 8.6716f, 12.8284f, 8.0f, 12.0f, 8.0f)
                curveTo(11.1716f, 8.0f, 10.5f, 8.6716f, 10.5f, 9.5f)
                curveTo(10.5f, 10.3284f, 11.1716f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_account-pin-box-line`!!
    }

private var `_account-pin-box-line`: ImageVector? = null
