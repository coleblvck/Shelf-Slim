package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Nurse-fill`: ImageVector
    get() {
        if (`_nurse-fill` != null) {
            return `_nurse-fill`!!
        }
        `_nurse-fill` = Builder(name = "Nurse-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9571f, 15.564f)
                curveTo(17.6154f, 16.6219f, 19.5726f, 19.0639f, 19.9387f, 22.0f)
                horizontalLineTo(4.0625f)
                curveTo(4.4286f, 19.0639f, 6.3859f, 16.6219f, 9.0442f, 15.564f)
                lineTo(12.0006f, 20.0f)
                lineTo(14.9571f, 15.564f)
                close()
                moveTo(18.0006f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(18.0006f, 11.3137f, 15.3143f, 14.0f, 12.0006f, 14.0f)
                curveTo(8.6869f, 14.0f, 6.0006f, 11.3137f, 6.0006f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0006f)
                close()
                moveTo(16.0006f, 8.0f)
                horizontalLineTo(8.0006f)
                curveTo(8.0006f, 10.2091f, 9.7915f, 12.0f, 12.0006f, 12.0f)
                curveTo(14.2098f, 12.0f, 16.0006f, 10.2091f, 16.0006f, 8.0f)
                close()
            }
        }
        .build()
        return `_nurse-fill`!!
    }

private var `_nurse-fill`: ImageVector? = null
