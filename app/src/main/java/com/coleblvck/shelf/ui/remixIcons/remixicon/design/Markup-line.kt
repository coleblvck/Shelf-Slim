package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Markup-line`: ImageVector
    get() {
        if (`_markup-line` != null) {
            return `_markup-line`!!
        }
        `_markup-line` = Builder(name = "Markup-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.4967f)
                lineTo(11.0385f, 6.862f)
                curveTo(11.1902f, 6.331f, 11.7437f, 6.0235f, 12.2747f, 6.1752f)
                curveTo(12.6069f, 6.2701f, 12.8666f, 6.5298f, 12.9615f, 6.862f)
                lineTo(14.0f, 10.4967f)
                verticalLineTo(11.9967f)
                horizontalLineTo(14.7192f)
                curveTo(15.1781f, 11.9967f, 15.5781f, 12.309f, 15.6894f, 12.7542f)
                lineTo(17.051f, 18.2008f)
                curveTo(18.8507f, 16.7339f, 20.0f, 14.4995f, 20.0f, 11.9967f)
                curveTo(20.0f, 7.5784f, 16.4183f, 3.9967f, 12.0f, 3.9967f)
                curveTo(7.5817f, 3.9967f, 4.0f, 7.5784f, 4.0f, 11.9967f)
                curveTo(4.0f, 14.4995f, 5.1493f, 16.7339f, 6.949f, 18.2008f)
                lineTo(8.3106f, 12.7542f)
                curveTo(8.4219f, 12.309f, 8.8219f, 11.9967f, 9.2808f, 11.9967f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.4967f)
                close()
                moveTo(12.0f, 19.9967f)
                curveTo(12.2415f, 19.9967f, 12.4813f, 19.986f, 12.7189f, 19.9649f)
                curveTo(13.6187f, 19.8847f, 14.4756f, 19.6556f, 15.2649f, 19.3023f)
                lineTo(13.9384f, 13.9967f)
                horizontalLineTo(10.0616f)
                lineTo(8.7351f, 19.3023f)
                curveTo(9.5244f, 19.6556f, 10.3813f, 19.8847f, 11.2811f, 19.9648f)
                curveTo(11.5187f, 19.986f, 11.7585f, 19.9967f, 12.0f, 19.9967f)
                close()
                moveTo(12.0f, 21.9967f)
                curveTo(6.4771f, 21.9967f, 2.0f, 17.5195f, 2.0f, 11.9967f)
                curveTo(2.0f, 6.4738f, 6.4771f, 1.9967f, 12.0f, 1.9967f)
                curveTo(17.5228f, 1.9967f, 22.0f, 6.4738f, 22.0f, 11.9967f)
                curveTo(22.0f, 17.5195f, 17.5228f, 21.9967f, 12.0f, 21.9967f)
                close()
            }
        }
        .build()
        return `_markup-line`!!
    }

private var `_markup-line`: ImageVector? = null
