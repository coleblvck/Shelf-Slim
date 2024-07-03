package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`User-settings-line`: ImageVector
    get() {
        if (`_user-settings-line` != null) {
            return `_user-settings-line`!!
        }
        `_user-settings-line` = Builder(name = "User-settings-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(8.6863f, 16.0f, 6.0f, 18.6863f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.21f, 11.0f, 16.0f, 9.21f, 16.0f, 7.0f)
                curveTo(16.0f, 4.79f, 14.21f, 3.0f, 12.0f, 3.0f)
                curveTo(9.79f, 3.0f, 8.0f, 4.79f, 8.0f, 7.0f)
                curveTo(8.0f, 9.21f, 9.79f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(14.5946f, 18.8115f)
                curveTo(14.5327f, 18.5511f, 14.5f, 18.2794f, 14.5f, 18.0f)
                curveTo(14.5f, 17.7207f, 14.5327f, 17.449f, 14.5945f, 17.1886f)
                lineTo(13.6029f, 16.6161f)
                lineTo(14.6029f, 14.884f)
                lineTo(15.5952f, 15.4569f)
                curveTo(15.9883f, 15.0851f, 16.4676f, 14.8034f, 17.0f, 14.6449f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.6449f)
                curveTo(19.5324f, 14.8034f, 20.0116f, 15.0851f, 20.4047f, 15.4569f)
                lineTo(21.3971f, 14.8839f)
                lineTo(22.3972f, 16.616f)
                lineTo(21.4055f, 17.1885f)
                curveTo(21.4673f, 17.449f, 21.5f, 17.7207f, 21.5f, 18.0f)
                curveTo(21.5f, 18.2793f, 21.4673f, 18.551f, 21.4055f, 18.8114f)
                lineTo(22.3972f, 19.3839f)
                lineTo(21.3972f, 21.116f)
                lineTo(20.4048f, 20.543f)
                curveTo(20.0117f, 20.9149f, 19.5325f, 21.1966f, 19.0001f, 21.355f)
                verticalLineTo(22.5f)
                horizontalLineTo(17.0001f)
                verticalLineTo(21.3551f)
                curveTo(16.4677f, 21.1967f, 15.9884f, 20.915f, 15.5953f, 20.5431f)
                lineTo(14.603f, 21.1161f)
                lineTo(13.6029f, 19.384f)
                lineTo(14.5946f, 18.8115f)
                close()
                moveTo(18.0f, 19.5f)
                curveTo(18.8284f, 19.5f, 19.5f, 18.8284f, 19.5f, 18.0f)
                curveTo(19.5f, 17.1716f, 18.8284f, 16.5f, 18.0f, 16.5f)
                curveTo(17.1716f, 16.5f, 16.5f, 17.1716f, 16.5f, 18.0f)
                curveTo(16.5f, 18.8284f, 17.1716f, 19.5f, 18.0f, 19.5f)
                close()
            }
        }
        .build()
        return `_user-settings-line`!!
    }

private var `_user-settings-line`: ImageVector? = null
