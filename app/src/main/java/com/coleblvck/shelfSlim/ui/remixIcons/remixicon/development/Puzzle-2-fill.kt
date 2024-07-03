package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Puzzle-2-fill`: ImageVector
    get() {
        if (`_puzzle-2-fill` != null) {
            return `_puzzle-2-fill`!!
        }
        `_puzzle-2-fill` = Builder(name = "Puzzle-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 2.3431f, 9.3432f, 1.0f, 11.0f, 1.0f)
                curveTo(12.6569f, 1.0f, 14.0f, 2.3431f, 14.0f, 4.0f)
                curveTo(14.0f, 4.3506f, 13.9398f, 4.6872f, 13.8293f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 5.0f, 21.0f, 5.4477f, 21.0f, 6.0f)
                verticalLineTo(9.126f)
                curveTo(21.0f, 9.4352f, 20.857f, 9.7269f, 20.6127f, 9.9164f)
                curveTo(20.3683f, 10.1058f, 20.0501f, 10.1715f, 19.7507f, 10.0945f)
                curveTo(19.5119f, 10.033f, 19.2605f, 10.0f, 19.0f, 10.0f)
                curveTo(17.3431f, 10.0f, 16.0f, 11.3431f, 16.0f, 13.0f)
                curveTo(16.0f, 14.6569f, 17.3431f, 16.0f, 19.0f, 16.0f)
                curveTo(19.2605f, 16.0f, 19.5119f, 15.967f, 19.7507f, 15.9055f)
                curveTo(20.0501f, 15.8285f, 20.3683f, 15.8942f, 20.6127f, 16.0836f)
                curveTo(20.857f, 16.2731f, 21.0f, 16.5648f, 21.0f, 16.874f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.4477f, 3.4477f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(8.1707f)
                curveTo(8.0602f, 4.6872f, 8.0f, 4.3506f, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_puzzle-2-fill`!!
    }

private var `_puzzle-2-fill`: ImageVector? = null
