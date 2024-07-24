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

public val BusinessGroup.`Creative-commons-zero-fill`: ImageVector
    get() {
        if (`_creative-commons-zero-fill` != null) {
            return `_creative-commons-zero-fill`!!
        }
        `_creative-commons-zero-fill` = Builder(name = "Creative-commons-zero-fill", defaultWidth =
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
                curveTo(9.2386f, 6.0f, 7.0f, 8.6863f, 7.0f, 12.0f)
                curveTo(7.0f, 15.3137f, 9.2386f, 18.0f, 12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.3137f, 17.0f, 12.0f)
                curveTo(17.0f, 8.6863f, 14.7614f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(14.3253f, 9.4724f)
                curveTo(14.747f, 10.1614f, 15.0f, 11.0413f, 15.0f, 12.0f)
                curveTo(15.0f, 14.2091f, 13.6569f, 16.0f, 12.0f, 16.0f)
                curveTo(11.5589f, 16.0f, 11.1401f, 15.8731f, 10.7629f, 15.6452f)
                lineTo(14.3253f, 9.4724f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.4411f, 8.0f, 12.8599f, 8.1269f, 13.2371f, 8.3548f)
                lineTo(9.6747f, 14.5276f)
                curveTo(9.253f, 13.8386f, 9.0f, 12.9587f, 9.0f, 12.0f)
                curveTo(9.0f, 9.7909f, 10.3431f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_creative-commons-zero-fill`!!
    }

private var `_creative-commons-zero-fill`: ImageVector? = null
