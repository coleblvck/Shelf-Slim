package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Patreon-line`: ImageVector
    get() {
        if (`_patreon-line` != null) {
            return `_patreon-line`!!
        }
        `_patreon-line` = Builder(name = "Patreon-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.001f, 17.0f)
                curveTo(10.8588f, 17.0f, 7.501f, 13.6421f, 7.501f, 9.5f)
                curveTo(7.501f, 5.3579f, 10.8588f, 2.0f, 15.001f, 2.0f)
                curveTo(19.1431f, 2.0f, 22.501f, 5.3579f, 22.501f, 9.5f)
                curveTo(22.501f, 13.6421f, 19.1431f, 17.0f, 15.001f, 17.0f)
                close()
                moveTo(15.001f, 15.0f)
                curveTo(18.0385f, 15.0f, 20.501f, 12.5376f, 20.501f, 9.5f)
                curveTo(20.501f, 6.4624f, 18.0385f, 4.0f, 15.001f, 4.0f)
                curveTo(11.9634f, 4.0f, 9.501f, 6.4624f, 9.501f, 9.5f)
                curveTo(9.501f, 12.5376f, 11.9634f, 15.0f, 15.001f, 15.0f)
                close()
                moveTo(2.001f, 2.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.001f)
                verticalLineTo(2.0f)
                close()
                moveTo(4.001f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.001f)
                close()
            }
        }
        .build()
        return `_patreon-line`!!
    }

private var `_patreon-line`: ImageVector? = null
