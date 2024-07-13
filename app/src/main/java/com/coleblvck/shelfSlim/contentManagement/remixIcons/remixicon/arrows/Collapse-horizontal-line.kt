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

public val ArrowsGroup.`Collapse-horizontal-line`: ImageVector
    get() {
        if (`_collapse-horizontal-line` != null) {
            return `_collapse-horizontal-line`!!
        }
        `_collapse-horizontal-line` = Builder(name = "Collapse-horizontal-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                lineTo(18.4497f, 7.0502f)
                lineTo(19.864f, 8.4644f)
                lineTo(17.3284f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.3284f)
                lineTo(19.8615f, 15.533f)
                lineTo(18.4473f, 16.9472f)
                lineTo(13.5f, 12.0f)
                close()
                moveTo(1.0f, 13.0f)
                horizontalLineTo(6.6708f)
                lineTo(4.1358f, 15.535f)
                lineTo(5.55f, 16.9492f)
                lineTo(10.5f, 11.9995f)
                lineTo(5.5503f, 7.0497f)
                lineTo(4.136f, 8.464f)
                lineTo(6.6721f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_collapse-horizontal-line`!!
    }

private var `_collapse-horizontal-line`: ImageVector? = null
