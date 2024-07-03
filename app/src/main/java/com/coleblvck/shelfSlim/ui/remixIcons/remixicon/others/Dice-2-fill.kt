package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Dice-2-fill`: ImageVector
    get() {
        if (`_dice-2-fill` != null) {
            return `_dice-2-fill`!!
        }
        `_dice-2-fill` = Builder(name = "Dice-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.8954f, 3.0f, 3.0f, 3.8954f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1046f, 3.8954f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 21.0f, 21.0f, 20.1046f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.8954f, 20.1046f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.5f, 9.0f)
                curveTo(10.5f, 9.8284f, 9.8284f, 10.5f, 9.0f, 10.5f)
                curveTo(8.1716f, 10.5f, 7.5f, 9.8284f, 7.5f, 9.0f)
                curveTo(7.5f, 8.1716f, 8.1716f, 7.5f, 9.0f, 7.5f)
                curveTo(9.8284f, 7.5f, 10.5f, 8.1716f, 10.5f, 9.0f)
                close()
                moveTo(16.5f, 15.0f)
                curveTo(16.5f, 15.8284f, 15.8284f, 16.5f, 15.0f, 16.5f)
                curveTo(14.1716f, 16.5f, 13.5f, 15.8284f, 13.5f, 15.0f)
                curveTo(13.5f, 14.1716f, 14.1716f, 13.5f, 15.0f, 13.5f)
                curveTo(15.8284f, 13.5f, 16.5f, 14.1716f, 16.5f, 15.0f)
                close()
            }
        }
        .build()
        return `_dice-2-fill`!!
    }

private var `_dice-2-fill`: ImageVector? = null