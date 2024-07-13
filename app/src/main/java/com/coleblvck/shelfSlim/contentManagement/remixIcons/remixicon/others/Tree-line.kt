package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Tree-line`: ImageVector
    get() {
        if (`_tree-line` != null) {
            return `_tree-line`!!
        }
        `_tree-line` = Builder(name = "Tree-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(6.0f, 3.6863f, 8.6863f, 1.0f, 12.0f, 1.0f)
                curveTo(15.3137f, 1.0f, 18.0f, 3.6863f, 18.0f, 7.0f)
                curveTo(18.0f, 7.2621f, 17.9831f, 7.5207f, 17.9504f, 7.7746f)
                curveTo(19.77f, 8.8041f, 21.0f, 10.7575f, 21.0f, 13.0f)
                curveTo(21.0f, 16.3137f, 18.3137f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.5f)
                curveTo(5.4624f, 19.0f, 3.0f, 16.5376f, 3.0f, 13.5f)
                curveTo(3.0f, 11.2863f, 4.3071f, 9.3797f, 6.191f, 8.507f)
                curveTo(6.0663f, 8.0255f, 6.0f, 7.5204f, 6.0f, 7.0f)
                close()
                moveTo(7.0096f, 10.3319f)
                curveTo(5.8218f, 10.8918f, 5.0f, 12.1008f, 5.0f, 13.5f)
                curveTo(5.0f, 15.433f, 6.567f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(17.2091f, 17.0f, 19.0f, 15.2091f, 19.0f, 13.0f)
                curveTo(19.0f, 11.3056f, 17.9461f, 9.8549f, 16.4544f, 9.2723f)
                lineTo(15.6129f, 8.9437f)
                curveTo(15.7907f, 8.3034f, 16.0f, 7.6718f, 16.0f, 7.0f)
                curveTo(16.0f, 4.7909f, 14.2091f, 3.0f, 12.0f, 3.0f)
                curveTo(9.7909f, 3.0f, 8.0f, 4.7909f, 8.0f, 7.0f)
                curveTo(8.0f, 8.3078f, 8.6266f, 9.469f, 9.6002f, 10.2005f)
                lineTo(8.3988f, 11.7995f)
                curveTo(7.8577f, 11.3929f, 7.3872f, 10.8963f, 7.0096f, 10.3319f)
                close()
            }
        }
        .build()
        return `_tree-line`!!
    }

private var `_tree-line`: ImageVector? = null
