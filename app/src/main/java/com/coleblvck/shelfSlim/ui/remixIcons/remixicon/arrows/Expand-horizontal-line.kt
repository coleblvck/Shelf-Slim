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

public val ArrowsGroup.`Expand-horizontal-line`: ImageVector
    get() {
        if (`_expand-horizontal-line` != null) {
            return `_expand-horizontal-line`!!
        }
        `_expand-horizontal-line` = Builder(name = "Expand-horizontal-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 12.0f)
                lineTo(5.4497f, 7.0502f)
                lineTo(6.864f, 8.4644f)
                lineTo(4.3284f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.3284f)
                lineTo(6.8615f, 15.533f)
                lineTo(5.4473f, 16.9472f)
                lineTo(0.5f, 12.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(19.6708f)
                lineTo(17.1358f, 15.535f)
                lineTo(18.55f, 16.9492f)
                lineTo(23.5f, 11.9995f)
                lineTo(18.5503f, 7.0497f)
                lineTo(17.136f, 8.464f)
                lineTo(19.6721f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_expand-horizontal-line`!!
    }

private var `_expand-horizontal-line`: ImageVector? = null
