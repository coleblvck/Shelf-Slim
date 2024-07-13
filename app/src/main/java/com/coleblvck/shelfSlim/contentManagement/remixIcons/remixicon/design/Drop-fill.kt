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

public val DesignGroup.`Drop-fill`: ImageVector
    get() {
        if (`_drop-fill` != null) {
            return `_drop-fill`!!
        }
        `_drop-fill` = Builder(name = "Drop-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 6.6329f)
                lineTo(12.0f, 0.2689f)
                lineTo(18.364f, 6.6329f)
                curveTo(21.8787f, 10.1476f, 21.8787f, 15.8461f, 18.364f, 19.3608f)
                curveTo(14.8492f, 22.8755f, 9.1508f, 22.8755f, 5.636f, 19.3608f)
                curveTo(2.1213f, 15.8461f, 2.1213f, 10.1476f, 5.636f, 6.6329f)
                horizontalLineTo(5.636f)
                close()
            }
        }
        .build()
        return `_drop-fill`!!
    }

private var `_drop-fill`: ImageVector? = null
