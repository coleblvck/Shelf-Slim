package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Tools-fill`: ImageVector
    get() {
        if (`_tools-fill` != null) {
            return `_tools-fill`!!
        }
        `_tools-fill` = Builder(name = "Tools-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3294f, 3.2715f)
                curveTo(6.5625f, 2.8331f, 7.9923f, 3.1074f, 8.9793f, 4.0944f)
                curveTo(9.9665f, 5.0816f, 10.2407f, 6.512f, 9.8018f, 7.7453f)
                lineTo(20.6465f, 18.5901f)
                lineTo(18.5252f, 20.7114f)
                lineTo(7.6794f, 9.867f)
                curveTo(6.4463f, 10.3054f, 5.0165f, 10.0311f, 4.0295f, 9.0442f)
                curveTo(3.0423f, 8.0569f, 2.7681f, 6.6266f, 3.207f, 5.3933f)
                lineTo(5.4437f, 7.6299f)
                curveTo(6.0295f, 8.2157f, 6.9793f, 8.2157f, 7.5651f, 7.6299f)
                curveTo(8.1508f, 7.0441f, 8.1508f, 6.0944f, 7.5651f, 5.5086f)
                lineTo(5.3294f, 3.2715f)
                close()
                moveTo(15.6968f, 5.1551f)
                lineTo(18.8788f, 3.3873f)
                lineTo(20.293f, 4.8015f)
                lineTo(18.5252f, 7.9835f)
                lineTo(16.7574f, 8.337f)
                lineTo(14.6361f, 10.4584f)
                lineTo(13.2219f, 9.0442f)
                lineTo(15.3432f, 6.9228f)
                lineTo(15.6968f, 5.1551f)
                close()
                moveTo(8.6257f, 12.9332f)
                lineTo(10.747f, 15.0546f)
                lineTo(5.7973f, 20.0043f)
                curveTo(5.2115f, 20.5901f, 4.2618f, 20.5901f, 3.676f, 20.0043f)
                curveTo(3.1246f, 19.453f, 3.0922f, 18.5792f, 3.5787f, 17.99f)
                lineTo(3.676f, 17.883f)
                lineTo(8.6257f, 12.9332f)
                close()
            }
        }
        .build()
        return `_tools-fill`!!
    }

private var `_tools-fill`: ImageVector? = null
