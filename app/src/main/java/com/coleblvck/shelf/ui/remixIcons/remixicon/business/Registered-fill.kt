package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Registered-fill`: ImageVector
    get() {
        if (`_registered-fill` != null) {
            return `_registered-fill`!!
        }
        `_registered-fill` = Builder(name = "Registered-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.5f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.217f)
                lineTo(14.397f, 17.0f)
                horizontalLineTo(16.869f)
                lineTo(14.3191f, 13.4907f)
                curveTo(15.327f, 12.8763f, 16.0f, 11.7668f, 16.0f, 10.5f)
                curveTo(16.0f, 8.6314f, 14.5357f, 7.1049f, 12.692f, 7.0052f)
                lineTo(12.5f, 7.0f)
                close()
                moveTo(12.5f, 9.0f)
                curveTo(13.2797f, 9.0f, 13.9204f, 9.5949f, 13.9931f, 10.3555f)
                lineTo(14.0f, 10.5f)
                lineTo(13.9931f, 10.6445f)
                curveTo(13.925f, 11.3576f, 13.3576f, 11.925f, 12.6445f, 11.9931f)
                lineTo(12.5f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.5f)
                close()
            }
        }
        .build()
        return `_registered-fill`!!
    }

private var `_registered-fill`: ImageVector? = null
