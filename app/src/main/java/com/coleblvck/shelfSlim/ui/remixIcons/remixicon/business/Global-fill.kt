package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Global-fill`: ImageVector
    get() {
        if (`_global-fill` != null) {
            return `_global-fill`!!
        }
        `_global-fill` = Builder(name = "Global-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0493f, 12.9999f)
                horizontalLineTo(7.5272f)
                curveTo(7.7062f, 16.2688f, 8.7574f, 19.3053f, 10.452f, 21.8809f)
                curveTo(5.9876f, 21.1871f, 2.5001f, 17.5402f, 2.0493f, 12.9999f)
                close()
                moveTo(2.0493f, 10.9999f)
                curveTo(2.5001f, 6.4597f, 5.9876f, 2.8128f, 10.452f, 2.119f)
                curveTo(8.7574f, 4.6946f, 7.7062f, 7.7311f, 7.5272f, 10.9999f)
                horizontalLineTo(2.0493f)
                close()
                moveTo(21.9506f, 10.9999f)
                horizontalLineTo(16.4726f)
                curveTo(16.2936f, 7.7311f, 15.2425f, 4.6946f, 13.5479f, 2.119f)
                curveTo(18.0123f, 2.8128f, 21.4998f, 6.4597f, 21.9506f, 10.9999f)
                close()
                moveTo(21.9506f, 12.9999f)
                curveTo(21.4998f, 17.5402f, 18.0123f, 21.1871f, 13.5479f, 21.8809f)
                curveTo(15.2425f, 19.3053f, 16.2936f, 16.2688f, 16.4726f, 12.9999f)
                horizontalLineTo(21.9506f)
                close()
                moveTo(9.5307f, 12.9999f)
                horizontalLineTo(14.4692f)
                curveTo(14.2976f, 15.7828f, 13.4146f, 18.3732f, 11.9999f, 20.5915f)
                curveTo(10.5852f, 18.3732f, 9.7023f, 15.7828f, 9.5307f, 12.9999f)
                close()
                moveTo(9.5307f, 10.9999f)
                curveTo(9.7023f, 8.2171f, 10.5852f, 5.6267f, 11.9999f, 3.4084f)
                curveTo(13.4146f, 5.6267f, 14.2976f, 8.2171f, 14.4692f, 10.9999f)
                horizontalLineTo(9.5307f)
                close()
            }
        }
        .build()
        return `_global-fill`!!
    }

private var `_global-fill`: ImageVector? = null
