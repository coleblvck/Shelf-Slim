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

public val LogosGroup.`Openbase-fill`: ImageVector
    get() {
        if (`_openbase-fill` != null) {
            return `_openbase-fill`!!
        }
        `_openbase-fill` = Builder(name = "Openbase-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 2.76f)
                lineTo(21.9992f, 5.996f)
                lineTo(21.1001f, 15.464f)
                lineTo(12.0001f, 22.3235f)
                lineTo(2.9001f, 15.46f)
                lineTo(2.0107f, 6.0f)
                lineTo(12.0001f, 2.76f)
                close()
                moveTo(12.0001f, 3.5854f)
                lineTo(3.189f, 6.435f)
                lineTo(12.0001f, 20.7932f)
                lineTo(20.8058f, 6.435f)
                lineTo(12.0001f, 3.5854f)
                close()
            }
        }
        .build()
        return `_openbase-fill`!!
    }

private var `_openbase-fill`: ImageVector? = null
