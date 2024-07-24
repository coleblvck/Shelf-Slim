package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Megaphone-fill`: ImageVector
    get() {
        if (`_megaphone-fill` != null) {
            return `_megaphone-fill`!!
        }
        `_megaphone-fill` = Builder(name = "Megaphone-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.063f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(17.0214f, 4.9786f, 13.3027f, 6.0873f, 11.0f, 6.6128f)
                verticalLineTo(17.3872f)
                curveTo(13.3027f, 17.9127f, 17.0214f, 19.0214f, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(13.937f)
                curveTo(21.8626f, 13.715f, 22.5f, 12.9319f, 22.5f, 12.0f)
                curveTo(22.5f, 11.0681f, 21.8626f, 10.285f, 21.0f, 10.063f)
                close()
                moveTo(5.0f, 7.0f)
                curveTo(3.8954f, 7.0f, 3.0f, 7.8954f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.1046f, 3.8954f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_megaphone-fill`!!
    }

private var `_megaphone-fill`: ImageVector? = null
