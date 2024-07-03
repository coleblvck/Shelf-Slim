package com.coleblvck.shelf.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Nurse-line`: ImageVector
    get() {
        if (`_nurse-line` != null) {
            return `_nurse-line`!!
        }
        `_nurse-line` = Builder(name = "Nurse-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0006f, 15.0f)
                curveTo(16.0802f, 15.0f, 19.4466f, 18.0537f, 19.9387f, 22.0f)
                horizontalLineTo(4.0625f)
                curveTo(4.5546f, 18.0537f, 7.921f, 15.0f, 12.0006f, 15.0f)
                close()
                moveTo(10.1875f, 17.2795f)
                curveTo(8.7539f, 17.734f, 7.5464f, 18.7133f, 6.802f, 20.0f)
                lineTo(12.0006f, 20.0f)
                lineTo(10.1875f, 17.2795f)
                close()
                moveTo(13.8141f, 17.2797f)
                lineTo(12.0006f, 20.0f)
                lineTo(17.1992f, 20.0f)
                curveTo(16.4549f, 18.7135f, 15.2476f, 17.7342f, 13.8141f, 17.2797f)
                close()
                moveTo(18.0006f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(18.0006f, 11.3137f, 15.3143f, 14.0f, 12.0006f, 14.0f)
                curveTo(8.6869f, 14.0f, 6.0006f, 11.3137f, 6.0006f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0006f)
                close()
                moveTo(8.0006f, 8.0f)
                curveTo(8.0006f, 10.2091f, 9.7915f, 12.0f, 12.0006f, 12.0f)
                curveTo(14.2098f, 12.0f, 16.0006f, 10.2091f, 16.0006f, 8.0f)
                horizontalLineTo(8.0006f)
                close()
                moveTo(16.0006f, 4.0f)
                horizontalLineTo(8.0006f)
                lineTo(8.0005f, 6.0f)
                horizontalLineTo(16.0005f)
                lineTo(16.0006f, 4.0f)
                close()
            }
        }
        .build()
        return `_nurse-line`!!
    }

private var `_nurse-line`: ImageVector? = null
