package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Supabase-line`: ImageVector
    get() {
        if (`_supabase-line` != null) {
            return `_supabase-line`!!
        }
        `_supabase-line` = Builder(name = "Supabase-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9997f, 2.5983f)
                verticalLineTo(13.9694f)
                horizontalLineTo(3.9001f)
                curveTo(3.2306f, 13.9694f, 2.8306f, 13.1846f, 3.2565f, 12.6326f)
                lineTo(10.9997f, 2.5983f)
                close()
                moveTo(12.9997f, 8.0306f)
                verticalLineTo(2.333f)
                curveTo(12.9997f, 0.5215f, 10.7034f, -0.2914f, 9.5819f, 1.1618f)
                lineTo(1.6732f, 11.4108f)
                curveTo(0.2462f, 13.26f, 1.5477f, 15.9694f, 3.9001f, 15.9694f)
                horizontalLineTo(10.9997f)
                verticalLineTo(21.6671f)
                curveTo(10.9997f, 23.4785f, 13.296f, 24.2915f, 14.4175f, 22.8382f)
                lineTo(22.3262f, 12.5892f)
                curveTo(23.7532f, 10.74f, 22.4517f, 8.0306f, 20.0993f, 8.0306f)
                horizontalLineTo(12.9997f)
                close()
                moveTo(12.9997f, 10.0306f)
                horizontalLineTo(20.0993f)
                curveTo(20.7688f, 10.0306f, 21.1688f, 10.8155f, 20.7429f, 11.3674f)
                lineTo(12.9997f, 21.4017f)
                verticalLineTo(10.0306f)
                close()
            }
        }
        .build()
        return `_supabase-line`!!
    }

private var `_supabase-line`: ImageVector? = null
