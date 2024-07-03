package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-cloud-fill`: ImageVector
    get() {
        if (`_file-cloud-fill` != null) {
            return `_file-cloud-fill`!!
        }
        `_file-cloud-fill` = Builder(name = "File-cloud-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9968f, 2.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0012f, 12.2606f)
                curveTo(20.0501f, 11.4722f, 18.8302f, 11.0f, 17.5f, 11.0f)
                lineTo(17.2788f, 11.0044f)
                curveTo(14.784f, 11.103f, 12.7164f, 12.8635f, 12.1523f, 15.2093f)
                lineTo(12.136f, 15.283f)
                lineTo(12.1068f, 15.3024f)
                curveTo(10.8223f, 16.1634f, 10.0f, 17.6255f, 10.0f, 19.25f)
                curveTo(10.0f, 20.273f, 10.3242f, 21.2231f, 10.8771f, 22.0006f)
                lineTo(3.9934f, 22.0f)
                curveTo(3.4841f, 22.0f, 3.0641f, 21.6171f, 3.0067f, 21.1239f)
                lineTo(3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4936f, 3.3869f, 2.0655f, 3.8853f, 2.0068f)
                lineTo(4.0022f, 2.0f)
                horizontalLineTo(14.9968f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.433f, 13.0f, 21.0f, 14.567f, 21.0f, 16.5f)
                lineTo(20.9985f, 16.6033f)
                curveTo(22.1531f, 16.9285f, 23.0f, 17.9903f, 23.0f, 19.25f)
                curveTo(23.0f, 20.7125f, 21.8583f, 21.9084f, 20.4175f, 21.995f)
                lineTo(20.25f, 22.0f)
                horizontalLineTo(14.75f)
                lineTo(14.5825f, 21.995f)
                curveTo(13.1417f, 21.9084f, 12.0f, 20.7125f, 12.0f, 19.25f)
                curveTo(12.0f, 17.99f, 12.8474f, 16.9279f, 14.0034f, 16.6025f)
                lineTo(14.0f, 16.5f)
                curveTo(14.0f, 14.567f, 15.567f, 13.0f, 17.5f, 13.0f)
                close()
            }
        }
        .build()
        return `_file-cloud-fill`!!
    }

private var `_file-cloud-fill`: ImageVector? = null
