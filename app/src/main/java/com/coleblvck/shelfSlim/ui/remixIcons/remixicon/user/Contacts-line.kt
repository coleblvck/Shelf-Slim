package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Contacts-line`: ImageVector
    get() {
        if (`_contacts-line` != null) {
            return `_contacts-line`!!
        }
        `_contacts-line` = Builder(name = "Contacts-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 17.5817f, 5.5817f, 14.0f, 10.0f, 14.0f)
                curveTo(14.4183f, 14.0f, 18.0f, 17.5817f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 18.6863f, 13.3137f, 16.0f, 10.0f, 16.0f)
                curveTo(6.6863f, 16.0f, 4.0f, 18.6863f, 4.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(12.21f, 11.0f, 14.0f, 9.21f, 14.0f, 7.0f)
                curveTo(14.0f, 4.79f, 12.21f, 3.0f, 10.0f, 3.0f)
                curveTo(7.79f, 3.0f, 6.0f, 4.79f, 6.0f, 7.0f)
                curveTo(6.0f, 9.21f, 7.79f, 11.0f, 10.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_contacts-line`!!
    }

private var `_contacts-line`: ImageVector? = null
