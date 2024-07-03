package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Presentation-line`: ImageVector
    get() {
        if (`_presentation-line` != null) {
            return `_presentation-line`!!
        }
        `_presentation-line` = Builder(name = "Presentation-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 5.1046f, 7.1046f, 6.0f, 6.0f, 6.0f)
                curveTo(4.8954f, 6.0f, 4.0f, 5.1046f, 4.0f, 4.0f)
                curveTo(4.0f, 2.8954f, 4.8954f, 2.0f, 6.0f, 2.0f)
                curveTo(7.1046f, 2.0f, 8.0f, 2.8954f, 8.0f, 4.0f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 8.3432f, 4.3432f, 7.0f, 6.0f, 7.0f)
                curveTo(6.8206f, 7.0f, 7.5642f, 7.3295f, 8.1059f, 7.8633f)
                lineTo(10.4803f, 10.1057f)
                lineTo(12.7931f, 7.7929f)
                lineTo(14.2073f, 9.2071f)
                lineTo(10.5201f, 12.8943f)
                lineTo(9.0f, 11.4587f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(6.0f, 9.0f)
                curveTo(5.4477f, 9.0f, 5.0f, 9.4477f, 5.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 9.4477f, 6.5523f, 9.0f, 6.0f, 9.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 15.5523f, 20.5523f, 16.0f, 20.0f, 16.0f)
                horizontalLineTo(16.5758f)
                lineTo(19.3993f, 22.0f)
                horizontalLineTo(17.1889f)
                lineTo(14.3654f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_presentation-line`!!
    }

private var `_presentation-line`: ImageVector? = null
