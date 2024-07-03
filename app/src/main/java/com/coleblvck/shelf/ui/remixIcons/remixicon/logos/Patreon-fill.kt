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

public val LogosGroup.`Patreon-fill`: ImageVector
    get() {
        if (`_patreon-fill` != null) {
            return `_patreon-fill`!!
        }
        `_patreon-fill` = Builder(name = "Patreon-fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(2.001f, 2.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.001f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return `_patreon-fill`!!
    }

private var `_patreon-fill`: ImageVector? = null
