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

public val LogosGroup.`Chrome-fill`: ImageVector
    get() {
        if (`_chrome-fill` != null) {
            return `_chrome-fill`!!
        }
        `_chrome-fill` = Builder(name = "Chrome-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8273f, 21.7633f)
                curveTo(5.3491f, 20.7712f, 2.0f, 16.7767f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1779f, 2.4873f, 8.4696f, 3.3388f, 6.9983f)
                lineTo(7.6219f, 14.4169f)
                curveTo(8.474f, 15.9571f, 10.1152f, 17.0f, 12.0f, 17.0f)
                curveTo(12.2023f, 17.0f, 12.4018f, 16.988f, 12.5978f, 16.9646f)
                lineTo(9.8273f, 21.7633f)
                close()
                moveTo(12.0f, 22.0f)
                lineTo(16.2868f, 14.5751f)
                curveTo(16.7396f, 13.8229f, 17.0f, 12.9419f, 17.0f, 12.0f)
                curveTo(17.0f, 10.8744f, 16.6281f, 9.8357f, 16.0004f, 9.0f)
                horizontalLineTo(21.5422f)
                curveTo(21.8396f, 9.947f, 22.0f, 10.9548f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.5721f, 13.545f)
                curveTo(14.0473f, 14.4168f, 13.0917f, 15.0f, 12.0f, 15.0f)
                curveTo(10.8897f, 15.0f, 9.9202f, 14.3968f, 9.4015f, 13.5002f)
                lineTo(9.3731f, 13.4501f)
                curveTo(9.1354f, 13.0203f, 9.0f, 12.526f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 12.5465f, 14.8539f, 13.0589f, 14.5985f, 13.5002f)
                lineTo(14.5721f, 13.545f)
                close()
                moveTo(4.6322f, 5.2386f)
                curveTo(6.4601f, 3.2478f, 9.0843f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7014f, 2.0f, 18.9331f, 4.011f, 20.6622f, 7.0f)
                horizontalLineTo(12.0f)
                curveTo(9.9363f, 7.0f, 8.1647f, 8.2502f, 7.4011f, 10.0345f)
                lineTo(4.6322f, 5.2386f)
                close()
            }
        }
        .build()
        return `_chrome-fill`!!
    }

private var `_chrome-fill`: ImageVector? = null
