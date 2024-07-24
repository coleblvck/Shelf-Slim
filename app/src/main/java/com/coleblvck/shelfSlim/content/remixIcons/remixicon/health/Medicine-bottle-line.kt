package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Medicine-bottle-line`: ImageVector
    get() {
        if (`_medicine-bottle-line` != null) {
            return `_medicine-bottle-line`!!
        }
        `_medicine-bottle-line` = Builder(name = "Medicine-bottle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                curveTo(18.6569f, 7.0f, 20.0f, 8.3432f, 20.0f, 10.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 8.3432f, 5.3432f, 7.0f, 7.0f, 7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 9.0f, 6.0f, 9.4477f, 6.0f, 10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 9.4477f, 17.5523f, 9.0f, 17.0f, 9.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.999f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                lineTo(10.999f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_medicine-bottle-line`!!
    }

private var `_medicine-bottle-line`: ImageVector? = null
