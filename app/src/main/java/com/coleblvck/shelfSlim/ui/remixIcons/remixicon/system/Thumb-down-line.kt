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

public val SystemGroup.`Thumb-down-line`: ImageVector
    get() {
        if (`_thumb-down-line` != null) {
            return `_thumb-down-line`!!
        }
        `_thumb-down-line` = Builder(name = "Thumb-down-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4002f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.8954f, 16.0f, 1.0f, 15.1046f, 1.0f, 14.0f)
                verticalLineTo(11.8957f)
                curveTo(1.0f, 11.6344f, 1.0512f, 11.3757f, 1.1506f, 11.1342f)
                lineTo(4.245f, 3.6193f)
                curveTo(4.3993f, 3.2445f, 4.7645f, 3.0f, 5.1697f, 3.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 3.0f, 23.0f, 3.4477f, 23.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 14.5523f, 22.5523f, 15.0f, 22.0f, 15.0f)
                horizontalLineTo(18.5182f)
                curveTo(18.1932f, 15.0f, 17.8886f, 15.1579f, 17.7012f, 15.4233f)
                lineTo(12.2478f, 23.149f)
                curveTo(12.1053f, 23.3508f, 11.8367f, 23.4184f, 11.6157f, 23.3078f)
                lineTo(9.8016f, 22.4008f)
                curveTo(8.75f, 21.875f, 8.2069f, 20.6874f, 8.4969f, 19.548f)
                lineTo(9.4002f, 16.0f)
                close()
                moveTo(17.0f, 13.4125f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.8394f)
                lineTo(3.0f, 11.8957f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.4002f)
                curveTo(10.7049f, 14.0f, 11.6602f, 15.229f, 11.3384f, 16.4934f)
                lineTo(10.4351f, 20.0414f)
                curveTo(10.3771f, 20.2693f, 10.4857f, 20.5068f, 10.6961f, 20.612f)
                lineTo(11.3572f, 20.9425f)
                lineTo(16.0673f, 14.27f)
                curveTo(16.3172f, 13.9159f, 16.6366f, 13.6257f, 17.0f, 13.4125f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_thumb-down-line`!!
    }

private var `_thumb-down-line`: ImageVector? = null
