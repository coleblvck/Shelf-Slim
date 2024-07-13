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

public val BusinessGroup.`Flag-2-fill`: ImageVector
    get() {
        if (`_flag-2-fill` != null) {
            return `_flag-2-fill`!!
        }
        `_flag-2-fill` = Builder(name = "Flag-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(21.1384f)
                curveTo(21.4146f, 3.0f, 21.6385f, 3.2239f, 21.6385f, 3.5f)
                curveTo(21.6385f, 3.587f, 21.6157f, 3.6725f, 21.5725f, 3.7481f)
                lineTo(18.0f, 10.0f)
                lineTo(21.5725f, 16.2519f)
                curveTo(21.7095f, 16.4917f, 21.6262f, 16.7971f, 21.3865f, 16.9341f)
                curveTo(21.3109f, 16.9773f, 21.2254f, 17.0f, 21.1384f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_flag-2-fill`!!
    }

private var `_flag-2-fill`: ImageVector? = null
