package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-horizontal-s-line`: ImageVector
    get() {
        if (`_expand-horizontal-s-line` != null) {
            return `_expand-horizontal-s-line`!!
        }
        `_expand-horizontal-s-line` = Builder(name = "Expand-horizontal-s-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4497f, 7.0503f)
                lineTo(2.5f, 12.0f)
                lineTo(7.4473f, 16.9473f)
                lineTo(8.8615f, 15.5331f)
                lineTo(6.3284f, 13.0f)
                horizontalLineTo(17.6708f)
                lineTo(15.1358f, 15.535f)
                lineTo(16.55f, 16.9493f)
                lineTo(21.5f, 11.9996f)
                lineTo(16.5503f, 7.0498f)
                lineTo(15.136f, 8.464f)
                lineTo(17.6721f, 11.0f)
                horizontalLineTo(6.3284f)
                lineTo(8.864f, 8.4645f)
                lineTo(7.4497f, 7.0503f)
                close()
            }
        }
        .build()
        return `_expand-horizontal-s-line`!!
    }

private var `_expand-horizontal-s-line`: ImageVector? = null
