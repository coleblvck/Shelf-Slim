package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Disc-line`: ImageVector
    get() {
        if (`_disc-line` != null) {
            return `_disc-line`!!
        }
        `_disc-line` = Builder(name = "Disc-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.5815f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(12.3506f, 9.0f, 12.6872f, 9.0602f, 13.0f, 9.1707f)
                verticalLineTo(2.0494f)
                curveTo(18.0533f, 2.5511f, 22.0f, 6.8147f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5229f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5229f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9467f, 2.5511f, 11.0f, 2.0494f)
                verticalLineTo(4.0619f)
                curveTo(7.0537f, 4.554f, 4.0f, 7.9204f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 8.6426f, 17.9318f, 5.7683f, 15.0f, 4.5815f)
                close()
            }
        }
        .build()
        return `_disc-line`!!
    }

private var `_disc-line`: ImageVector? = null
