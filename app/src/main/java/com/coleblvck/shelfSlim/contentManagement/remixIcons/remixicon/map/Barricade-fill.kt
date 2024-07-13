package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Barricade-fill`: ImageVector
    get() {
        if (`_barricade-fill` != null) {
            return `_barricade-fill`!!
        }
        `_barricade-fill` = Builder(name = "Barricade-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5556f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.4444f)
                lineTo(5.3333f, 15.0f)
                horizontalLineTo(18.6667f)
                lineTo(19.5556f, 19.0f)
                close()
                moveTo(17.3333f, 9.0f)
                lineTo(18.2222f, 13.0f)
                horizontalLineTo(5.7778f)
                lineTo(6.6667f, 9.0f)
                horizontalLineTo(17.3333f)
                close()
                moveTo(16.8889f, 7.0f)
                horizontalLineTo(7.1111f)
                lineTo(7.826f, 3.7831f)
                curveTo(7.9277f, 3.3255f, 8.3335f, 3.0f, 8.8022f, 3.0f)
                horizontalLineTo(15.1978f)
                curveTo(15.6665f, 3.0f, 16.0723f, 3.3255f, 16.174f, 3.7831f)
                lineTo(16.8889f, 7.0f)
                close()
            }
        }
        .build()
        return `_barricade-fill`!!
    }

private var `_barricade-fill`: ImageVector? = null
