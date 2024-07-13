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

public val ArrowsGroup.`Collapse-diagonal-2-fill`: ImageVector
    get() {
        if (`_collapse-diagonal-2-fill` != null) {
            return `_collapse-diagonal-2-fill`!!
        }
        `_collapse-diagonal-2-fill` = Builder(name = "Collapse-diagonal-2-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5001f, 11.0001f)
                horizontalLineTo(11.0001f)
                verticalLineTo(3.5001f)
                lineTo(7.9572f, 6.543f)
                lineTo(4.7072f, 3.293f)
                lineTo(3.293f, 4.7072f)
                lineTo(6.543f, 7.9572f)
                lineTo(3.5001f, 11.0001f)
                close()
                moveTo(20.5f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.5f)
                lineTo(16.0429f, 17.4571f)
                lineTo(19.2929f, 20.7071f)
                lineTo(20.7071f, 19.2929f)
                lineTo(17.4571f, 16.0429f)
                lineTo(20.5f, 13.0f)
                close()
            }
        }
        .build()
        return `_collapse-diagonal-2-fill`!!
    }

private var `_collapse-diagonal-2-fill`: ImageVector? = null