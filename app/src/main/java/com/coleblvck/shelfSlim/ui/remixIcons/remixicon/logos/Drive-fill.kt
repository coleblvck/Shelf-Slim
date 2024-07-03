package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Drive-fill`: ImageVector
    get() {
        if (`_drive-fill` != null) {
            return `_drive-fill`!!
        }
        `_drive-fill` = Builder(name = "Drive-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9404f, 4.146f)
                lineTo(11.4217f, 10.1759f)
                lineTo(5.482f, 20.4688f)
                lineTo(2.0f, 14.44f)
                lineTo(7.9404f, 4.146f)
                close()
                moveTo(10.1161f, 14.44f)
                horizontalLineTo(22.0f)
                lineTo(18.518f, 20.4688f)
                horizontalLineTo(6.6354f)
                lineTo(10.1161f, 14.44f)
                close()
                moveTo(14.4589f, 13.4399f)
                lineTo(8.518f, 3.145f)
                horizontalLineTo(15.482f)
                lineTo(21.4229f, 13.4399f)
                horizontalLineTo(14.4589f)
                close()
            }
        }
        .build()
        return `_drive-fill`!!
    }

private var `_drive-fill`: ImageVector? = null
