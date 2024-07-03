package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Drop-line`: ImageVector
    get() {
        if (`_drop-line` != null) {
            return `_drop-line`!!
        }
        `_drop-line` = Builder(name = "Drop-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0972f)
                lineTo(7.0503f, 8.047f)
                curveTo(4.3166f, 10.7806f, 4.3166f, 15.2128f, 7.0503f, 17.9465f)
                curveTo(9.7839f, 20.6801f, 14.2161f, 20.6801f, 16.9497f, 17.9465f)
                curveTo(19.6834f, 15.2128f, 19.6834f, 10.7806f, 16.9497f, 8.047f)
                lineTo(12.0f, 3.0972f)
                close()
                moveTo(12.0f, 0.2688f)
                lineTo(18.364f, 6.6328f)
                curveTo(21.8787f, 10.1475f, 21.8787f, 15.846f, 18.364f, 19.3607f)
                curveTo(14.8492f, 22.8754f, 9.1508f, 22.8754f, 5.636f, 19.3607f)
                curveTo(2.1213f, 15.846f, 2.1213f, 10.1475f, 5.636f, 6.6328f)
                lineTo(12.0f, 0.2688f)
                close()
            }
        }
        .build()
        return `_drop-line`!!
    }

private var `_drop-line`: ImageVector? = null
