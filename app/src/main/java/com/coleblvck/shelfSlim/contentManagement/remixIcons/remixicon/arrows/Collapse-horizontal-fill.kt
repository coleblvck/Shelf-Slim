package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Collapse-horizontal-fill`: ImageVector
    get() {
        if (`_collapse-horizontal-fill` != null) {
            return `_collapse-horizontal-fill`!!
        }
        `_collapse-horizontal-fill` = Builder(name = "Collapse-horizontal-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                lineTo(18.4497f, 7.0502f)
                lineTo(18.4488f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.4483f)
                lineTo(18.4473f, 16.9472f)
                lineTo(13.5f, 12.0f)
                close()
                moveTo(1.0f, 13.0f)
                horizontalLineTo(5.5501f)
                lineTo(5.55f, 16.9492f)
                lineTo(10.5f, 11.9995f)
                lineTo(5.5503f, 7.0497f)
                lineTo(5.5502f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_collapse-horizontal-fill`!!
    }

private var `_collapse-horizontal-fill`: ImageVector? = null
