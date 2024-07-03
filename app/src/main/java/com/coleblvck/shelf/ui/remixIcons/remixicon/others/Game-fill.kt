package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Game-fill`: ImageVector
    get() {
        if (`_game-fill` != null) {
            return `_game-fill`!!
        }
        `_game-fill` = Builder(name = "Game-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.1215f, 2.0f, 17.9089f, 3.4302f, 19.7428f, 5.6711f)
                lineTo(13.4142f, 12.0f)
                lineTo(19.7428f, 18.3289f)
                curveTo(17.9089f, 20.5698f, 15.1215f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(11.1716f, 5.0f, 10.5f, 5.6716f, 10.5f, 6.5f)
                curveTo(10.5f, 7.3284f, 11.1716f, 8.0f, 12.0f, 8.0f)
                curveTo(12.8284f, 8.0f, 13.5f, 7.3284f, 13.5f, 6.5f)
                curveTo(13.5f, 5.6716f, 12.8284f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return `_game-fill`!!
    }

private var `_game-fill`: ImageVector? = null
