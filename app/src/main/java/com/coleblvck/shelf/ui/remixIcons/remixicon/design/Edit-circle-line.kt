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

public val DesignGroup.`Edit-circle-line`: ImageVector
    get() {
        if (`_edit-circle-line` != null) {
            return `_edit-circle-line`!!
        }
        `_edit-circle-line` = Builder(name = "Edit-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6844f, 4.0255f)
                curveTo(12.4588f, 4.0065f, 12.2306f, 3.9967f, 12.0f, 3.9967f)
                curveTo(7.5817f, 3.9967f, 4.0f, 7.5784f, 4.0f, 11.9967f)
                curveTo(4.0f, 16.415f, 7.5817f, 19.9967f, 12.0f, 19.9967f)
                curveTo(16.4183f, 19.9967f, 20.0f, 16.415f, 20.0f, 11.9967f)
                curveTo(20.0f, 11.7662f, 19.9902f, 11.5379f, 19.9711f, 11.3123f)
                curveTo(19.8996f, 10.4646f, 19.6953f, 9.6442f, 19.368f, 8.8734f)
                lineTo(20.8682f, 7.3711f)
                curveTo(21.2031f, 8.0119f, 21.4706f, 8.6935f, 21.6613f, 9.4065f)
                curveTo(21.8213f, 10.0063f, 21.9258f, 10.6222f, 21.9723f, 11.248f)
                curveTo(21.9907f, 11.4952f, 22.0f, 11.7449f, 22.0f, 11.9967f)
                curveTo(22.0f, 17.5196f, 17.5228f, 21.9967f, 12.0f, 21.9967f)
                curveTo(6.4771f, 21.9967f, 2.0f, 17.5196f, 2.0f, 11.9967f)
                curveTo(2.0f, 6.4739f, 6.4771f, 1.9967f, 12.0f, 1.9967f)
                curveTo(12.2518f, 1.9967f, 12.5015f, 2.006f, 12.7487f, 2.0243f)
                curveTo(13.3745f, 2.0708f, 13.9904f, 2.1754f, 14.5898f, 2.3358f)
                curveTo(15.3032f, 2.5261f, 15.9848f, 2.7936f, 16.6256f, 3.1285f)
                lineTo(15.1247f, 4.6293f)
                curveTo(14.3525f, 4.3014f, 13.5321f, 4.0971f, 12.6844f, 4.0255f)
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
        return `_edit-circle-line`!!
    }

private var `_edit-circle-line`: ImageVector? = null
