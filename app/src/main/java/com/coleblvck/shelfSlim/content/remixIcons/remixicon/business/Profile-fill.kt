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

public val BusinessGroup.`Profile-fill`: ImageVector
    get() {
        if (`_profile-fill` != null) {
            return `_profile-fill`!!
        }
        `_profile-fill` = Builder(name = "Profile-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.9934f)
                curveTo(2.0f, 3.4448f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(22.0f, 20.5552f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(3.9934f)
                close()
                moveTo(6.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(14.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_profile-fill`!!
    }

private var `_profile-fill`: ImageVector? = null
