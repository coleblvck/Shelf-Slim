package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Supabase-fill`: ImageVector
    get() {
        if (`_supabase-fill` != null) {
            return `_supabase-fill`!!
        }
        `_supabase-fill` = Builder(name = "Supabase-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0838f, 15.25f)
                curveTo(1.4204f, 15.25f, 0.484f, 13.3378f, 1.5038f, 12.0237f)
                lineTo(10.2099f, 0.8063f)
                curveTo(10.794f, 0.0537f, 11.9999f, 0.4668f, 11.9999f, 1.4194f)
                verticalLineTo(8.75f)
                horizontalLineTo(20.9159f)
                curveTo(22.5793f, 8.75f, 23.5157f, 10.6622f, 22.4959f, 11.9762f)
                lineTo(13.7898f, 23.1937f)
                curveTo(13.2057f, 23.9463f, 11.9999f, 23.5332f, 11.9999f, 22.5805f)
                verticalLineTo(15.25f)
                horizontalLineTo(3.0838f)
                close()
            }
        }
        .build()
        return `_supabase-fill`!!
    }

private var `_supabase-fill`: ImageVector? = null
