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

public val BusinessGroup.`Printer-cloud-fill`: ImageVector
    get() {
        if (`_printer-cloud-fill` != null) {
            return `_printer-cloud-fill`!!
        }
        `_printer-cloud-fill` = Builder(name = "Printer-cloud-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 2.0f, 18.0f, 2.4477f, 18.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                curveTo(6.0f, 2.4477f, 6.4477f, 2.0f, 7.0f, 2.0f)
                close()
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 8.4477f, 21.5523f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 8.0f, 2.0f, 8.4477f, 2.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.5523f, 2.4477f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.1938f)
                curveTo(12.4371f, 14.1087f, 12.9094f, 13.3124f, 13.6109f, 12.6109f)
                curveTo(14.6848f, 11.537f, 15.9812f, 11.0f, 17.5f, 11.0f)
                curveTo(19.0188f, 11.0f, 20.3152f, 11.537f, 21.3891f, 12.6109f)
                curveTo(21.6169f, 12.8387f, 21.8205f, 13.0765f, 22.0f, 13.3243f)
                verticalLineTo(9.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(21.0f, 16.5f)
                curveTo(21.0f, 14.567f, 19.433f, 13.0f, 17.5f, 13.0f)
                curveTo(15.567f, 13.0f, 14.0f, 14.567f, 14.0f, 16.5f)
                lineTo(14.0034f, 16.6025f)
                curveTo(12.8474f, 16.9279f, 12.0f, 17.99f, 12.0f, 19.25f)
                curveTo(12.0f, 20.7125f, 13.1417f, 21.9084f, 14.5825f, 21.995f)
                lineTo(14.75f, 22.0f)
                horizontalLineTo(20.25f)
                lineTo(20.4175f, 21.995f)
                curveTo(21.8583f, 21.9084f, 23.0f, 20.7125f, 23.0f, 19.25f)
                curveTo(23.0f, 17.9903f, 22.1531f, 16.9285f, 20.9985f, 16.6033f)
                lineTo(21.0f, 16.5f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineTo(10.562f)
                curveTo(10.1873f, 17.6859f, 10.0f, 18.4359f, 10.0f, 19.25f)
                curveTo(10.0f, 20.2823f, 10.2905f, 21.199f, 10.8715f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_printer-cloud-fill`!!
    }

private var `_printer-cloud-fill`: ImageVector? = null
