package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-cloud-fill`: ImageVector
    get() {
        if (`_folder-cloud-fill` != null) {
            return `_folder-cloud-fill`!!
        }
        `_folder-cloud-fill` = Builder(name = "Folder-cloud-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(12.3604f)
                curveTo(21.0023f, 10.9408f, 19.3542f, 10.0f, 17.5f, 10.0f)
                curveTo(14.8979f, 10.0f, 12.7015f, 11.853f, 12.1394f, 14.2817f)
                curveTo(10.8512f, 15.1306f, 10.0f, 16.5894f, 10.0f, 18.25f)
                curveTo(10.0f, 19.2749f, 10.3246f, 20.2239f, 10.8766f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(14.0015f, 15.6031f)
                curveTo(12.8465f, 15.9291f, 12.0f, 16.9907f, 12.0f, 18.25f)
                curveTo(12.0f, 19.7688f, 13.2312f, 21.0f, 14.75f, 21.0f)
                horizontalLineTo(20.25f)
                curveTo(21.7688f, 21.0f, 23.0f, 19.7688f, 23.0f, 18.25f)
                curveTo(23.0f, 16.9907f, 22.1535f, 15.9291f, 20.9985f, 15.6031f)
                curveTo(21.0548f, 13.6578f, 19.4477f, 12.0f, 17.5f, 12.0f)
                curveTo(15.5523f, 12.0f, 13.9452f, 13.6578f, 14.0015f, 15.6031f)
                close()
            }
        }
        .build()
        return `_folder-cloud-fill`!!
    }

private var `_folder-cloud-fill`: ImageVector? = null
