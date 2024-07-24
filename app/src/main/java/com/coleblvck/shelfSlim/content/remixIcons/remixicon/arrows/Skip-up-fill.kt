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

public val ArrowsGroup.`Skip-up-fill`: ImageVector
    get() {
        if (`_skip-up-fill` != null) {
            return `_skip-up-fill`!!
        }
        `_skip-up-fill` = Builder(name = "Skip-up-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(6.0f, 17.0f)
                horizontalLineTo(18.0f)
                lineTo(12.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_skip-up-fill`!!
    }

private var `_skip-up-fill`: ImageVector? = null
