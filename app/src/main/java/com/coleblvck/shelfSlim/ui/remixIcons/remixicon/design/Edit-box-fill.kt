package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Edit-box-fill`: ImageVector
    get() {
        if (`_edit-box-fill` != null) {
            return `_edit-box-fill`!!
        }
        `_edit-box-fill` = Builder(name = "Edit-box-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7574f, 2.9968f)
                lineTo(9.2914f, 10.4627f)
                lineTo(9.2989f, 14.7098f)
                lineTo(13.537f, 14.7024f)
                lineTo(21.0f, 7.2394f)
                verticalLineTo(19.9968f)
                curveTo(21.0f, 20.5491f, 20.5523f, 20.9968f, 20.0f, 20.9968f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 20.9968f, 3.0f, 20.5491f, 3.0f, 19.9968f)
                verticalLineTo(3.9968f)
                curveTo(3.0f, 3.4445f, 3.4477f, 2.9968f, 4.0f, 2.9968f)
                horizontalLineTo(16.7574f)
                close()
                moveTo(20.4853f, 2.0973f)
                lineTo(21.8995f, 3.5115f)
                lineTo(12.7071f, 12.7039f)
                lineTo(11.2954f, 12.7063f)
                lineTo(11.2929f, 11.2897f)
                lineTo(20.4853f, 2.0973f)
                close()
            }
        }
        .build()
        return `_edit-box-fill`!!
    }

private var `_edit-box-fill`: ImageVector? = null