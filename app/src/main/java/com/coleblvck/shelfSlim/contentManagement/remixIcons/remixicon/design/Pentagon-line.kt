package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Pentagon-line`: ImageVector
    get() {
        if (`_pentagon-line` != null) {
            return `_pentagon-line`!!
        }
        `_pentagon-line` = Builder(name = "Pentagon-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 3.0304f)
                lineTo(20.5309f, 9.2282f)
                lineTo(17.2725f, 19.2564f)
                horizontalLineTo(6.7282f)
                lineTo(3.4698f, 9.2282f)
                lineTo(12.0004f, 3.0304f)
                close()
                moveTo(22.7473f, 8.5081f)
                lineTo(12.0004f, 0.7f)
                lineTo(1.2534f, 8.5081f)
                lineTo(5.3584f, 21.1418f)
                horizontalLineTo(18.6423f)
                lineTo(22.7473f, 8.5081f)
                close()
            }
        }
        .build()
        return `_pentagon-line`!!
    }

private var `_pentagon-line`: ImageVector? = null
