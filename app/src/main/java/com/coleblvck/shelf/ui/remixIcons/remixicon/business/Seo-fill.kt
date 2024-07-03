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

public val BusinessGroup.`Seo-fill`: ImageVector
    get() {
        if (`_seo-fill` != null) {
            return `_seo-fill`!!
        }
        `_seo-fill` = Builder(name = "Seo-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(4.134f, 3.0f, 1.0f, 6.134f, 1.0f, 10.0f)
                curveTo(1.0f, 13.866f, 4.134f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(9.0709f)
                curveTo(9.0242f, 16.6734f, 9.0f, 16.3395f, 9.0f, 16.0f)
                curveTo(9.0f, 15.6605f, 9.0242f, 15.3266f, 9.0709f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(5.2386f, 15.0f, 3.0f, 12.7614f, 3.0f, 10.0f)
                curveTo(3.0f, 7.2386f, 5.2386f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(18.7614f, 5.0f, 21.0f, 7.2386f, 21.0f, 10.0f)
                curveTo(21.0f, 10.3428f, 20.9655f, 10.6775f, 20.8998f, 11.0008f)
                curveTo(21.4853f, 11.5748f, 21.9704f, 12.2508f, 22.3264f, 13.0f)
                curveTo(22.7583f, 12.0907f, 23.0f, 11.0736f, 23.0f, 10.0f)
                curveTo(23.0f, 6.134f, 19.866f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 13.2386f, 13.2386f, 11.0f, 16.0f, 11.0f)
                curveTo(18.7614f, 11.0f, 21.0f, 13.2386f, 21.0f, 16.0f)
                curveTo(21.0f, 17.0191f, 20.6951f, 17.967f, 20.1716f, 18.7574f)
                lineTo(22.7071f, 21.2929f)
                lineTo(21.2929f, 22.7071f)
                lineTo(18.7574f, 20.1716f)
                curveTo(17.967f, 20.6951f, 17.0191f, 21.0f, 16.0f, 21.0f)
                curveTo(13.2386f, 21.0f, 11.0f, 18.7614f, 11.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_seo-fill`!!
    }

private var `_seo-fill`: ImageVector? = null
