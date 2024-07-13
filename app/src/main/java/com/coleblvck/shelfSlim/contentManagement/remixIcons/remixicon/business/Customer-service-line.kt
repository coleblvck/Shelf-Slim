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

public val BusinessGroup.`Customer-service-line`: ImageVector
    get() {
        if (`_customer-service-line` != null) {
            return `_customer-service-line`!!
        }
        `_customer-service-line` = Builder(name = "Customer-service-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0022f)
                curveTo(21.999f, 19.8731f, 19.9816f, 22.2726f, 17.2872f, 22.8616f)
                lineTo(16.6492f, 20.9476f)
                curveTo(17.8532f, 20.7511f, 18.8765f, 20.0171f, 19.4649f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(15.8954f, 19.0f, 15.0f, 18.1046f, 15.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 11.8954f, 15.8954f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.446f, 7.0537f, 16.0796f, 4.0f, 12.0f, 4.0f)
                curveTo(7.9204f, 4.0f, 4.554f, 7.0537f, 4.0619f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1046f, 11.0f, 9.0f, 11.8954f, 9.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 18.1046f, 8.1046f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 19.0f, 2.0f, 18.1046f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                verticalLineTo(12.9987f)
                verticalLineTo(13.0f)
                verticalLineTo(17.0f)
                verticalLineTo(17.0013f)
                verticalLineTo(17.0022f)
                close()
                moveTo(20.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_customer-service-line`!!
    }

private var `_customer-service-line`: ImageVector? = null
