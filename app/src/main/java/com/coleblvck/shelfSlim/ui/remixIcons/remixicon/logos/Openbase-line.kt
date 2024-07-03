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

public val LogosGroup.`Openbase-line`: ImageVector
    get() {
        if (`_openbase-line` != null) {
            return `_openbase-line`!!
        }
        `_openbase-line` = Builder(name = "Openbase-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 5.996f)
                lineTo(3.0f, 15.46f)
                lineTo(12.0f, 22.5f)
                lineTo(21.0f, 15.46f)
                lineTo(22.0f, 5.996f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(19.8367f, 7.4357f)
                lineTo(12.0f, 19.9608f)
                lineTo(4.1633f, 7.4357f)
                lineTo(12.0f, 5.0878f)
                lineTo(19.8367f, 7.4357f)
                close()
            }
        }
        .build()
        return `_openbase-line`!!
    }

private var `_openbase-line`: ImageVector? = null
