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

public val DesignGroup.`Tools-line`: ImageVector
    get() {
        if (`_tools-line` != null) {
            return `_tools-line`!!
        }
        `_tools-line` = Builder(name = "Tools-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3294f, 3.2715f)
                curveTo(6.5625f, 2.8331f, 7.9923f, 3.1074f, 8.9793f, 4.0944f)
                curveTo(10.1002f, 5.2153f, 10.3019f, 6.9074f, 9.5843f, 8.2338f)
                lineTo(20.293f, 18.9436f)
                lineTo(18.8788f, 20.3579f)
                lineTo(8.1698f, 9.6487f)
                curveTo(6.8432f, 10.3668f, 5.1507f, 10.1653f, 4.0295f, 9.0442f)
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
                moveTo(8.9793f, 13.2868f)
                lineTo(10.3935f, 14.701f)
                lineTo(5.0902f, 20.0043f)
                curveTo(4.6997f, 20.3948f, 4.0665f, 20.3948f, 3.676f, 20.0043f)
                curveTo(3.3133f, 19.6417f, 3.2874f, 19.0698f, 3.5983f, 18.6773f)
                lineTo(3.676f, 18.5901f)
                lineTo(8.9793f, 13.2868f)
                close()
            }
        }
        .build()
        return `_tools-line`!!
    }

private var `_tools-line`: ImageVector? = null
