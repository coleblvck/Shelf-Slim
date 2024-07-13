package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Image-circle-fill`: ImageVector
    get() {
        if (`_image-circle-fill` != null) {
            return `_image-circle-fill`!!
        }
        `_image-circle-fill` = Builder(name = "Image-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5762f, 14.5759f)
                lineTo(15.7073f, 10.707f)
                curveTo(15.3168f, 10.3164f, 14.6836f, 10.3164f, 14.2931f, 10.707f)
                lineTo(6.8652f, 18.1349f)
                curveTo(5.1137f, 16.6674f, 4.0f, 14.4637f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 12.9012f, 19.851f, 13.7676f, 19.5762f, 14.5759f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 11.1046f, 10.1046f, 12.0f, 9.0f, 12.0f)
                curveTo(7.8954f, 12.0f, 7.0f, 11.1046f, 7.0f, 10.0f)
                curveTo(7.0f, 8.8954f, 7.8954f, 8.0f, 9.0f, 8.0f)
                curveTo(10.1046f, 8.0f, 11.0f, 8.8954f, 11.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_image-circle-fill`!!
    }

private var `_image-circle-fill`: ImageVector? = null
