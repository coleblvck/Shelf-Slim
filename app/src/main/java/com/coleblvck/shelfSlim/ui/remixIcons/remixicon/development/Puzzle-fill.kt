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

public val DevelopmentGroup.`Puzzle-fill`: ImageVector
    get() {
        if (`_puzzle-fill` != null) {
            return `_puzzle-fill`!!
        }
        `_puzzle-fill` = Builder(name = "Puzzle-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 2.3431f, 9.3432f, 1.0f, 11.0f, 1.0f)
                curveTo(12.6569f, 1.0f, 14.0f, 2.3431f, 14.0f, 4.0f)
                curveTo(14.0f, 4.3506f, 13.9398f, 4.6872f, 13.8293f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                verticalLineTo(10.1707f)
                curveTo(19.3128f, 10.0602f, 19.6494f, 10.0f, 20.0f, 10.0f)
                curveTo(21.6569f, 10.0f, 23.0f, 11.3431f, 23.0f, 13.0f)
                curveTo(23.0f, 14.6569f, 21.6569f, 16.0f, 20.0f, 16.0f)
                curveTo(19.6494f, 16.0f, 19.3128f, 15.9398f, 19.0f, 15.8293f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.5523f, 18.5523f, 21.0f, 18.0f, 21.0f)
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
        return `_puzzle-fill`!!
    }

private var `_puzzle-fill`: ImageVector? = null
