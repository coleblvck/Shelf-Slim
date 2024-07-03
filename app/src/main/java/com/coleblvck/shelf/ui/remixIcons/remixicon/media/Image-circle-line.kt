package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Image-circle-line`: ImageVector
    get() {
        if (`_image-circle-line` != null) {
            return `_image-circle-line`!!
        }
        `_image-circle-line` = Builder(name = "Image-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5761f, 14.5764f)
                lineTo(15.7067f, 10.707f)
                curveTo(15.3162f, 10.3164f, 14.683f, 10.3164f, 14.2925f, 10.707f)
                lineTo(6.8648f, 18.1346f)
                curveTo(5.1136f, 16.6671f, 4.0f, 14.4636f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 12.9014f, 19.8509f, 13.7679f, 19.5761f, 14.5764f)
                close()
                moveTo(8.5893f, 19.2386f)
                lineTo(14.9996f, 12.8283f)
                lineTo(18.6379f, 16.4666f)
                curveTo(17.1992f, 18.6003f, 14.7613f, 19.9998f, 11.9996f, 19.9998f)
                curveTo(10.7785f, 19.9998f, 9.6235f, 19.7268f, 8.5893f, 19.2386f)
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
        return `_image-circle-line`!!
    }

private var `_image-circle-line`: ImageVector? = null
