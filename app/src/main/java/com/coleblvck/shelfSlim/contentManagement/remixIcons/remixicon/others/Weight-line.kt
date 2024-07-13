package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Weight-line`: ImageVector
    get() {
        if (`_weight-line` != null) {
            return `_weight-line`!!
        }
        `_weight-line` = Builder(name = "Weight-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0004f, 6.0f)
                curveTo(14.0004f, 7.1046f, 13.1049f, 8.0f, 12.0004f, 8.0f)
                curveTo(10.8958f, 8.0f, 10.0004f, 7.1046f, 10.0004f, 6.0f)
                curveTo(10.0004f, 4.8954f, 10.8958f, 4.0f, 12.0004f, 4.0f)
                curveTo(13.1049f, 4.0f, 14.0004f, 4.8954f, 14.0004f, 6.0f)
                close()
                moveTo(15.4652f, 8.0f)
                curveTo(15.8056f, 7.4117f, 16.0004f, 6.7286f, 16.0004f, 6.0f)
                curveTo(16.0004f, 3.7909f, 14.2095f, 2.0f, 12.0004f, 2.0f)
                curveTo(9.7912f, 2.0f, 8.0004f, 3.7909f, 8.0004f, 6.0f)
                curveTo(8.0004f, 6.7286f, 8.1952f, 7.4117f, 8.5355f, 8.0f)
                horizontalLineTo(5.0662f)
                curveTo(4.5789f, 8.0f, 4.1625f, 8.3512f, 4.0805f, 8.8315f)
                lineTo(2.2001f, 19.8315f)
                curveTo(2.0957f, 20.4423f, 2.5662f, 21.0f, 3.1858f, 21.0f)
                horizontalLineTo(20.8149f)
                curveTo(21.4345f, 21.0f, 21.905f, 20.4423f, 21.8006f, 19.8315f)
                lineTo(19.9203f, 8.8315f)
                curveTo(19.8382f, 8.3512f, 19.4218f, 8.0f, 18.9346f, 8.0f)
                horizontalLineTo(15.4652f)
                close()
                moveTo(12.0004f, 10.0f)
                horizontalLineTo(18.091f)
                lineTo(19.6295f, 19.0f)
                horizontalLineTo(4.3713f)
                lineTo(5.9097f, 10.0f)
                horizontalLineTo(12.0004f)
                close()
            }
        }
        .build()
        return `_weight-line`!!
    }

private var `_weight-line`: ImageVector? = null
