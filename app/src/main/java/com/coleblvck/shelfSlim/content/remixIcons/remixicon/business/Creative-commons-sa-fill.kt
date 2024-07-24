package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Creative-commons-sa-fill`: ImageVector
    get() {
        if (`_creative-commons-sa-fill` != null) {
            return `_creative-commons-sa-fill`!!
        }
        `_creative-commons-sa-fill` = Builder(name = "Creative-commons-sa-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(9.8228f, 6.0f, 7.9706f, 7.6699f, 7.2843f, 10.0006f)
                lineTo(6.0f, 10.0f)
                lineTo(8.5f, 13.0f)
                lineTo(11.0f, 10.0f)
                lineTo(9.4012f, 10.0003f)
                curveTo(9.9199f, 8.8045f, 10.8895f, 8.0f, 12.0f, 8.0f)
                curveTo(13.6569f, 8.0f, 15.0f, 9.7909f, 15.0f, 12.0f)
                curveTo(15.0f, 14.2091f, 13.6569f, 16.0f, 12.0f, 16.0f)
                curveTo(10.8899f, 16.0f, 9.9206f, 15.1961f, 9.4018f, 14.0011f)
                lineTo(7.2847f, 14.0007f)
                curveTo(7.9713f, 16.3307f, 9.8232f, 18.0f, 12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.3137f, 17.0f, 12.0f)
                curveTo(17.0f, 8.6863f, 14.7614f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return `_creative-commons-sa-fill`!!
    }

private var `_creative-commons-sa-fill`: ImageVector? = null
