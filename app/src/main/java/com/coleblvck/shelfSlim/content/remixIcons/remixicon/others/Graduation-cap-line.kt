package com.coleblvck.shelfSlim.content.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Graduation-cap-line`: ImageVector
    get() {
        if (`_graduation-cap-line` != null) {
            return `_graduation-cap-line`!!
        }
        `_graduation-cap-line` = Builder(name = "Graduation-cap-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.3333f)
                lineTo(0.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(24.0f, 9.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.1667f)
                lineTo(20.0f, 11.3333f)
                verticalLineTo(18.0113f)
                lineTo(19.7774f, 18.2864f)
                curveTo(17.9457f, 20.5499f, 15.1418f, 22.0f, 12.0f, 22.0f)
                curveTo(8.8582f, 22.0f, 6.0543f, 20.5499f, 4.2226f, 18.2864f)
                lineTo(4.0f, 18.0113f)
                verticalLineTo(11.3333f)
                close()
                moveTo(6.0f, 12.5f)
                verticalLineTo(17.2917f)
                curveTo(7.4672f, 18.954f, 9.6111f, 20.0f, 12.0f, 20.0f)
                curveTo(14.3889f, 20.0f, 16.5328f, 18.954f, 18.0f, 17.2917f)
                verticalLineTo(12.5f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 12.5f)
                close()
                moveTo(3.9693f, 9.0f)
                lineTo(12.0f, 13.6846f)
                lineTo(20.0307f, 9.0f)
                lineTo(12.0f, 4.3154f)
                lineTo(3.9693f, 9.0f)
                close()
            }
        }
        .build()
        return `_graduation-cap-line`!!
    }

private var `_graduation-cap-line`: ImageVector? = null
