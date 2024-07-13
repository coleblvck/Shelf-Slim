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

public val MapGroup.`Barricade-line`: ImageVector
    get() {
        if (`_barricade-line` != null) {
            return `_barricade-line`!!
        }
        `_barricade-line` = Builder(name = "Barricade-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4932f, 19.0f)
                horizontalLineTo(17.5068f)
                lineTo(16.8401f, 16.0f)
                horizontalLineTo(7.1599f)
                lineTo(6.4932f, 19.0f)
                close()
                moveTo(19.5556f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.4444f)
                lineTo(7.826f, 3.7831f)
                curveTo(7.9277f, 3.3255f, 8.3335f, 3.0f, 8.8022f, 3.0f)
                horizontalLineTo(15.1978f)
                curveTo(15.6665f, 3.0f, 16.0723f, 3.3255f, 16.174f, 3.7831f)
                lineTo(19.5556f, 19.0f)
                close()
                moveTo(7.6043f, 14.0f)
                horizontalLineTo(16.3957f)
                lineTo(15.5068f, 10.0f)
                horizontalLineTo(8.4932f)
                lineTo(7.6043f, 14.0f)
                close()
                moveTo(8.9377f, 8.0f)
                horizontalLineTo(15.0623f)
                lineTo(14.3957f, 5.0f)
                horizontalLineTo(9.6043f)
                lineTo(8.9377f, 8.0f)
                close()
            }
        }
        .build()
        return `_barricade-line`!!
    }

private var `_barricade-line`: ImageVector? = null
