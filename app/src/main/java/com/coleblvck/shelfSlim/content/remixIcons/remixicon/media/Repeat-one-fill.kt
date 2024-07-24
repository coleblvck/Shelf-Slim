package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Repeat-one-fill`: ImageVector
    get() {
        if (`_repeat-one-fill` != null) {
            return `_repeat-one-fill`!!
        }
        `_repeat-one-fill` = Builder(name = "Repeat-one-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                verticalLineTo(21.9325f)
                curveTo(8.0f, 22.2086f, 7.7761f, 22.4325f, 7.5f, 22.4325f)
                curveTo(7.383f, 22.4325f, 7.2698f, 22.3915f, 7.1799f, 22.3166f)
                lineTo(3.0609f, 18.8841f)
                curveTo(2.8488f, 18.7073f, 2.8201f, 18.392f, 2.9969f, 18.1799f)
                curveTo(3.0919f, 18.0659f, 3.2326f, 18.0f, 3.381f, 18.0f)
                horizontalLineTo(8.0f)
                lineTo(18.0f, 18.0f)
                curveTo(19.1046f, 18.0f, 20.0f, 17.1046f, 20.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 18.2091f, 20.2091f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(16.0f, 4.0f)
                verticalLineTo(2.0675f)
                curveTo(16.0f, 1.7914f, 16.2239f, 1.5675f, 16.5f, 1.5675f)
                curveTo(16.617f, 1.5675f, 16.7302f, 1.6085f, 16.8201f, 1.6834f)
                lineTo(20.9391f, 5.1159f)
                curveTo(21.1512f, 5.2927f, 21.1799f, 5.6079f, 21.0031f, 5.8201f)
                curveTo(20.9081f, 5.9341f, 20.7674f, 6.0f, 20.619f, 6.0f)
                horizontalLineTo(16.0f)
                lineTo(6.0f, 6.0f)
                curveTo(4.8954f, 6.0f, 4.0f, 6.8954f, 4.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.7909f, 3.7909f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                lineTo(11.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_repeat-one-fill`!!
    }

private var `_repeat-one-fill`: ImageVector? = null
