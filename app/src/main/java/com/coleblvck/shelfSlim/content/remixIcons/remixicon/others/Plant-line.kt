package com.coleblvck.shelfSlim.content.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Plant-line`: ImageVector
    get() {
        if (`_plant-line` != null) {
            return `_plant-line`!!
        }
        `_plant-line` = Builder(name = "Plant-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9981f, 2.0f)
                curveTo(8.6873f, 2.0f, 11.0224f, 3.5165f, 12.1947f, 5.741f)
                curveTo(13.372f, 4.0825f, 15.3086f, 3.0f, 17.498f, 3.0f)
                horizontalLineTo(20.998f)
                verticalLineTo(5.5f)
                curveTo(20.998f, 9.0899f, 18.0879f, 12.0f, 14.498f, 12.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(20.0f)
                curveTo(17.998f, 21.1046f, 17.1026f, 22.0f, 15.998f, 22.0f)
                horizontalLineTo(7.9981f)
                curveTo(6.8935f, 22.0f, 5.9981f, 21.1046f, 5.9981f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.998f)
                curveTo(5.1321f, 11.0f, 1.998f, 7.866f, 1.998f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.9981f)
                close()
                moveTo(15.998f, 15.0f)
                horizontalLineTo(7.9981f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.998f)
                verticalLineTo(15.0f)
                close()
                moveTo(18.998f, 5.0f)
                horizontalLineTo(17.498f)
                curveTo(15.0128f, 5.0f, 12.998f, 7.0147f, 12.998f, 9.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.498f)
                curveTo(16.9833f, 10.0f, 18.998f, 7.9853f, 18.998f, 5.5f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.9981f, 4.0f)
                horizontalLineTo(3.998f)
                curveTo(3.998f, 6.7614f, 6.2366f, 9.0f, 8.998f, 9.0f)
                horizontalLineTo(10.998f)
                curveTo(10.998f, 6.2386f, 8.7595f, 4.0f, 5.9981f, 4.0f)
                close()
            }
        }
        .build()
        return `_plant-line`!!
    }

private var `_plant-line`: ImageVector? = null
