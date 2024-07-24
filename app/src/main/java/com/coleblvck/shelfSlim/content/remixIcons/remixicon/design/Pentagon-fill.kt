package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Pentagon-fill`: ImageVector
    get() {
        if (`_pentagon-fill` != null) {
            return `_pentagon-fill`!!
        }
        `_pentagon-fill` = Builder(name = "Pentagon-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 0.7002f)
                lineTo(22.7473f, 8.5083f)
                lineTo(18.6423f, 21.1421f)
                horizontalLineTo(5.3584f)
                lineTo(1.2534f, 8.5083f)
                lineTo(12.0004f, 0.7002f)
                close()
            }
        }
        .build()
        return `_pentagon-fill`!!
    }

private var `_pentagon-fill`: ImageVector? = null
