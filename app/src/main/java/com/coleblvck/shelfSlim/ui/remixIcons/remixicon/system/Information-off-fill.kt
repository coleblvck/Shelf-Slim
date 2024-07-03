package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Information-off-fill`: ImageVector
    get() {
        if (`_information-off-fill` != null) {
            return `_information-off-fill`!!
        }
        `_information-off-fill` = Builder(name = "Information-off-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7429f, 18.3287f)
                curveTo(21.1536f, 16.6049f, 22.0f, 14.4013f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(9.5987f, 2.0f, 7.3951f, 2.8464f, 5.6713f, 4.2571f)
                lineTo(11.9142f, 10.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.5858f)
                lineTo(19.7429f, 18.3287f)
                close()
                moveTo(10.0f, 11.4142f)
                lineTo(4.2571f, 5.6713f)
                curveTo(2.8464f, 7.3951f, 2.0f, 9.5987f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(14.4013f, 22.0f, 16.6049f, 21.1536f, 18.3287f, 19.7429f)
                lineTo(14.0f, 15.4142f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.4142f)
                close()
                moveTo(13.5858f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.4142f)
                lineTo(13.5858f, 15.0f)
                close()
                moveTo(13.5f, 8.0f)
                curveTo(13.5f, 8.8284f, 12.8284f, 9.5f, 12.0f, 9.5f)
                curveTo(11.1716f, 9.5f, 10.5f, 8.8284f, 10.5f, 8.0f)
                curveTo(10.5f, 7.1716f, 11.1716f, 6.5f, 12.0f, 6.5f)
                curveTo(12.8284f, 6.5f, 13.5f, 7.1716f, 13.5f, 8.0f)
                close()
            }
        }
        .build()
        return `_information-off-fill`!!
    }

private var `_information-off-fill`: ImageVector? = null
