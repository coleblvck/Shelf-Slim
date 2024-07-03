package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Signpost-fill`: ImageVector
    get() {
        if (`_signpost-fill` != null) {
            return `_signpost-fill`!!
        }
        `_signpost-fill` = Builder(name = "Signpost-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 5.0f, 3.0f, 5.4477f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 14.5523f, 3.4477f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(17.4142f)
                lineTo(21.7071f, 10.7071f)
                curveTo(22.0976f, 10.3166f, 22.0976f, 9.6834f, 21.7071f, 9.2929f)
                lineTo(17.4142f, 5.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_signpost-fill`!!
    }

private var `_signpost-fill`: ImageVector? = null
