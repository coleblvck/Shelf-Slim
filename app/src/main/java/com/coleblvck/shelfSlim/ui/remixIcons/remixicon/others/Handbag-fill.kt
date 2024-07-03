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

public val OthersGroup.`Handbag-fill`: ImageVector
    get() {
        if (`_handbag-fill` != null) {
            return `_handbag-fill`!!
        }
        `_handbag-fill` = Builder(name = "Handbag-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 2.0f)
                curveTo(15.8662f, 2.0f, 19.0002f, 5.134f, 19.0002f, 9.0f)
                horizontalLineTo(20.0742f)
                curveTo(20.5967f, 9.0f, 21.0311f, 9.4023f, 21.0712f, 9.9233f)
                lineTo(21.9174f, 20.9233f)
                curveTo(21.9597f, 21.474f, 21.5477f, 21.9547f, 20.997f, 21.9971f)
                lineTo(20.9203f, 22.0f)
                horizontalLineTo(3.0801f)
                curveTo(2.5278f, 22.0f, 2.0801f, 21.5523f, 2.0801f, 21.0f)
                lineTo(2.083f, 20.9233f)
                lineTo(2.9292f, 9.9233f)
                curveTo(2.9692f, 9.4023f, 3.4037f, 9.0f, 3.9262f, 9.0f)
                horizontalLineTo(5.0002f)
                curveTo(5.0002f, 5.134f, 8.1342f, 2.0f, 12.0002f, 2.0f)
                close()
                moveTo(14.0002f, 13.0f)
                horizontalLineTo(10.0002f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0002f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0002f, 4.0f)
                curveTo(9.3115f, 4.0f, 7.1184f, 6.1223f, 7.0048f, 8.7831f)
                lineTo(7.0002f, 9.0f)
                horizontalLineTo(17.0002f)
                curveTo(17.0002f, 6.3112f, 14.8779f, 4.1182f, 12.2171f, 4.0046f)
                lineTo(12.0002f, 4.0f)
                close()
            }
        }
        .build()
        return `_handbag-fill`!!
    }

private var `_handbag-fill`: ImageVector? = null
