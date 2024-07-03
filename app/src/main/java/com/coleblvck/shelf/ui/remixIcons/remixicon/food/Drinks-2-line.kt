package com.coleblvck.shelf.ui.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Drinks-2-line`: ImageVector
    get() {
        if (`_drinks-2-line` != null) {
            return `_drinks-2-line`!!
        }
        `_drinks-2-line` = Builder(name = "Drinks-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(7.323f)
                lineTo(8.523f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.1177f)
                lineTo(5.9446f, 21.0587f)
                curveTo(5.9757f, 21.5873f, 6.4134f, 22.0f, 6.9429f, 22.0f)
                horizontalLineTo(17.0571f)
                curveTo(17.5866f, 22.0f, 18.0243f, 21.5873f, 18.0554f, 21.0587f)
                lineTo(18.8824f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.677f)
                lineTo(8.677f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(7.2991f, 10.0252f)
                lineTo(7.1211f, 7.0f)
                horizontalLineTo(16.8789f)
                lineTo(16.5867f, 11.9675f)
                curveTo(14.28f, 11.853f, 13.4226f, 11.4919f, 12.3713f, 11.0714f)
                curveTo(11.2792f, 10.6347f, 9.9706f, 10.1354f, 7.2991f, 10.0252f)
                close()
                moveTo(7.4171f, 12.0326f)
                curveTo(9.721f, 12.1473f, 10.5894f, 12.5128f, 11.6401f, 12.933f)
                curveTo(12.7001f, 13.357f, 13.9556f, 13.8375f, 16.4692f, 13.9641f)
                lineTo(16.1142f, 20.0f)
                horizontalLineTo(7.8858f)
                lineTo(7.4171f, 12.0326f)
                close()
            }
        }
        .build()
        return `_drinks-2-line`!!
    }

private var `_drinks-2-line`: ImageVector? = null
