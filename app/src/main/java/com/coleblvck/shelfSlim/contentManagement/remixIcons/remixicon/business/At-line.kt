package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`At-line`: ImageVector
    get() {
        if (`_at-line` != null) {
            return `_at-line`!!
        }
        `_at-line` = Builder(name = "At-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(13.6418f, 20.0f, 15.1681f, 19.5054f, 16.4381f, 18.6571f)
                lineTo(17.5476f, 20.3214f)
                curveTo(15.9602f, 21.3818f, 14.0523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(22.0f, 15.433f, 20.433f, 17.0f, 18.5f, 17.0f)
                curveTo(17.2958f, 17.0f, 16.2336f, 16.3918f, 15.6038f, 15.4659f)
                curveTo(14.6942f, 16.4115f, 13.4158f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
                curveTo(13.1258f, 7.0f, 14.1647f, 7.3721f, 15.0005f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.5f)
                curveTo(17.0f, 14.3284f, 17.6716f, 15.0f, 18.5f, 15.0f)
                curveTo(19.3284f, 15.0f, 20.0f, 14.3284f, 20.0f, 13.5f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_at-line`!!
    }

private var `_at-line`: ImageVector? = null
