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

public val BusinessGroup.`Triangular-flag-line`: ImageVector
    get() {
        if (`_triangular-flag-line` != null) {
            return `_triangular-flag-line`!!
        }
        `_triangular-flag-line` = Builder(name = "Triangular-flag-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.1438f)
                verticalLineTo(16.0002f)
                horizontalLineTo(18.3391f)
                lineTo(6.0f, 5.1438f)
                close()
                moveTo(4.0f, 2.932f)
                curveTo(4.0f, 2.0715f, 5.0146f, 1.6128f, 5.6606f, 2.1812f)
                lineTo(21.6501f, 16.2494f)
                curveTo(22.3423f, 16.8584f, 21.9116f, 18.0002f, 20.9896f, 18.0002f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.932f)
                close()
            }
        }
        .build()
        return `_triangular-flag-line`!!
    }

private var `_triangular-flag-line`: ImageVector? = null
