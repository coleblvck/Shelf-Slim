package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Triangular-flag-fill`: ImageVector
    get() {
        if (`_triangular-flag-fill` != null) {
            return `_triangular-flag-fill`!!
        }
        `_triangular-flag-fill` = Builder(name = "Triangular-flag-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6606f, 2.1812f)
                curveTo(5.0146f, 1.6128f, 4.0f, 2.0715f, 4.0f, 2.932f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0002f)
                horizontalLineTo(20.9896f)
                curveTo(21.9116f, 18.0002f, 22.3423f, 16.8584f, 21.6501f, 16.2494f)
                lineTo(5.6606f, 2.1812f)
                close()
            }
        }
        .build()
        return `_triangular-flag-fill`!!
    }

private var `_triangular-flag-fill`: ImageVector? = null
