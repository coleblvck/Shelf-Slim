package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Ancient-gate-fill`: ImageVector
    get() {
        if (`_ancient-gate-fill` != null) {
            return `_ancient-gate-fill`!!
        }
        `_ancient-gate-fill` = Builder(name = "Ancient-gate-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9641f, 3.0f)
                horizontalLineTo(17.0359f)
                curveTo(17.2844f, 4.722f, 18.7602f, 6.0f, 20.5f, 6.0f)
                curveTo(20.8322f, 6.0f, 21.1626f, 5.9527f, 21.4815f, 5.8596f)
                curveTo(21.2972f, 7.6439f, 19.7938f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(4.2062f, 9.0f, 2.7028f, 7.6439f, 2.5185f, 5.8596f)
                curveTo(2.8374f, 5.9527f, 3.1678f, 6.0f, 3.5f, 6.0f)
                curveTo(5.2399f, 6.0f, 6.7155f, 4.722f, 6.9641f, 3.0f)
                close()
                moveTo(22.9786f, 11.1114f)
                curveTo(22.5422f, 11.3591f, 22.0376f, 11.5005f, 21.5f, 11.5005f)
                curveTo(20.3896f, 11.5005f, 19.4201f, 10.8972f, 18.9013f, 10.0005f)
                horizontalLineTo(5.0986f)
                curveTo(4.5799f, 10.8972f, 3.6104f, 11.5005f, 2.5f, 11.5005f)
                curveTo(1.9624f, 11.5005f, 1.4578f, 11.3591f, 1.0214f, 11.1114f)
                curveTo(1.0072f, 11.2391f, 1.0f, 11.369f, 1.0f, 11.5005f)
                curveTo(1.0f, 12.8967f, 1.8175f, 14.1019f, 3.0f, 14.6637f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 17.3431f, 10.3432f, 16.0f, 12.0f, 16.0f)
                curveTo(13.6569f, 16.0f, 15.0f, 17.3431f, 15.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.6637f)
                curveTo(22.1825f, 14.1019f, 23.0f, 12.8967f, 23.0f, 11.5005f)
                curveTo(23.0f, 11.369f, 22.9927f, 11.2391f, 22.9786f, 11.1114f)
                close()
            }
        }
        .build()
        return `_ancient-gate-fill`!!
    }

private var `_ancient-gate-fill`: ImageVector? = null
