package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Copyleft-line`: ImageVector
    get() {
        if (`_copyleft-line` != null) {
            return `_copyleft-line`!!
        }
        `_copyleft-line` = Builder(name = "Copyleft-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(10.1805f, 17.0f, 8.587f, 16.0265f, 7.7123f, 14.5723f)
                lineTo(9.4265f, 13.5432f)
                curveTo(9.9509f, 14.4162f, 10.9069f, 15.0f, 12.0f, 15.0f)
                curveTo(13.6575f, 15.0f, 15.0f, 13.6575f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3425f, 13.6575f, 9.0f, 12.0f, 9.0f)
                curveTo(10.9074f, 9.0f, 9.9516f, 9.5834f, 9.4271f, 10.4558f)
                lineTo(7.7123f, 9.4277f)
                curveTo(8.587f, 7.9735f, 10.1805f, 7.0f, 12.0f, 7.0f)
                curveTo(14.76f, 7.0f, 17.0f, 9.24f, 17.0f, 12.0f)
                curveTo(17.0f, 14.76f, 14.76f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_copyleft-line`!!
    }

private var `_copyleft-line`: ImageVector? = null
