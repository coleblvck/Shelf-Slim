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

public val DesignGroup.`Edit-circle-fill`: ImageVector
    get() {
        if (`_edit-circle-fill` != null) {
            return `_edit-circle-fill`!!
        }
        `_edit-circle-fill` = Builder(name = "Edit-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6256f, 3.1285f)
                lineTo(9.2914f, 10.4626f)
                lineTo(9.2989f, 14.7098f)
                lineTo(13.537f, 14.7024f)
                lineTo(20.8682f, 7.3711f)
                curveTo(21.5912f, 8.7544f, 22.0f, 10.3278f, 22.0f, 11.9967f)
                curveTo(22.0f, 17.5196f, 17.5228f, 21.9967f, 12.0f, 21.9967f)
                curveTo(6.4771f, 21.9967f, 2.0f, 17.5196f, 2.0f, 11.9967f)
                curveTo(2.0f, 6.4739f, 6.4771f, 1.9967f, 12.0f, 1.9967f)
                curveTo(13.6689f, 1.9967f, 15.2423f, 2.4055f, 16.6256f, 3.1285f)
                close()
                moveTo(20.4853f, 2.0972f)
                lineTo(21.8995f, 3.5114f)
                lineTo(12.7071f, 12.7038f)
                lineTo(11.2954f, 12.7063f)
                lineTo(11.2929f, 11.2896f)
                lineTo(20.4853f, 2.0972f)
                close()
            }
        }
        .build()
        return `_edit-circle-fill`!!
    }

private var `_edit-circle-fill`: ImageVector? = null
