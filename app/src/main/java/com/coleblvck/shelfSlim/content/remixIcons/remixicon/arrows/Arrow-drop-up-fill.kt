package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-drop-up-fill`: ImageVector
    get() {
        if (`_arrow-drop-up-fill` != null) {
            return `_arrow-drop-up-fill`!!
        }
        `_arrow-drop-up-fill` = Builder(name = "Arrow-drop-up-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_arrow-drop-up-fill`!!
    }

private var `_arrow-drop-up-fill`: ImageVector? = null
