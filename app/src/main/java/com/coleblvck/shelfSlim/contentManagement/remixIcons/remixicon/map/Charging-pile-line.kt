package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Charging-pile-line`: ImageVector
    get() {
        if (`_charging-pile-line` != null) {
            return `_charging-pile-line`!!
        }
        `_charging-pile-line` = Builder(name = "Charging-pile-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 3.0f, 14.0f, 3.4477f, 14.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 12.0f, 18.0f, 12.8954f, 18.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 18.5523f, 18.4477f, 19.0f, 19.0f, 19.0f)
                curveTo(19.5523f, 19.0f, 20.0f, 18.5523f, 20.0f, 18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                curveTo(17.4477f, 11.0f, 17.0f, 10.5523f, 17.0f, 10.0f)
                verticalLineTo(6.4142f)
                lineTo(15.3431f, 4.7574f)
                lineTo(16.7574f, 3.3431f)
                lineTo(21.7071f, 8.2929f)
                curveTo(21.9024f, 8.4882f, 22.0f, 8.7441f, 22.0f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.6569f, 20.6569f, 21.0f, 19.0f, 21.0f)
                curveTo(17.3431f, 21.0f, 16.0f, 19.6569f, 16.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineTo(12.0f)
                lineTo(8.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                lineTo(9.0f, 7.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_charging-pile-line`!!
    }

private var `_charging-pile-line`: ImageVector? = null
