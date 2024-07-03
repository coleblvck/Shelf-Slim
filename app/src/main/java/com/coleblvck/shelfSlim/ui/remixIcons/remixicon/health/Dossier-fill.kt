package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Dossier-fill`: ImageVector
    get() {
        if (`_dossier-fill` != null) {
            return `_dossier-fill`!!
        }
        `_dossier-fill` = Builder(name = "Dossier-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 4.0f, 21.0f, 4.4477f, 21.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.4477f, 3.4477f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.999f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(12.999f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_dossier-fill`!!
    }

private var `_dossier-fill`: ImageVector? = null