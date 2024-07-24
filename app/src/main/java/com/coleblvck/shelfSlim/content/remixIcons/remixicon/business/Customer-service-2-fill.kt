package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Customer-service-2-fill`: ImageVector
    get() {
        if (`_customer-service-2-fill` != null) {
            return `_customer-service-2-fill`!!
        }
        `_customer-service-2-fill` = Builder(name = "Customer-service-2-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveTo(22.1046f, 8.0f, 23.0f, 8.8954f, 23.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 15.1046f, 22.1046f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.446f, 19.9463f, 16.0796f, 23.0f, 12.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(15.3137f, 21.0f, 18.0f, 18.3137f, 18.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 5.6863f, 15.3137f, 3.0f, 12.0f, 3.0f)
                curveTo(8.6863f, 3.0f, 6.0f, 5.6863f, 6.0f, 9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.8954f, 16.0f, 1.0f, 15.1046f, 1.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 8.8954f, 1.8954f, 8.0f, 3.0f, 8.0f)
                horizontalLineTo(4.0619f)
                curveTo(4.554f, 4.0537f, 7.9204f, 1.0f, 12.0f, 1.0f)
                curveTo(16.0796f, 1.0f, 19.446f, 4.0537f, 19.9381f, 8.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(7.7594f, 15.7849f)
                lineTo(8.8196f, 14.0887f)
                curveTo(9.7416f, 14.6662f, 10.8318f, 15.0f, 12.0f, 15.0f)
                curveTo(13.1682f, 15.0f, 14.2584f, 14.6662f, 15.1804f, 14.0887f)
                lineTo(16.2406f, 15.7849f)
                curveTo(15.0112f, 16.5549f, 13.5576f, 17.0f, 12.0f, 17.0f)
                curveTo(10.4424f, 17.0f, 8.9888f, 16.5549f, 7.7594f, 15.7849f)
                close()
            }
        }
        .build()
        return `_customer-service-2-fill`!!
    }

private var `_customer-service-2-fill`: ImageVector? = null
