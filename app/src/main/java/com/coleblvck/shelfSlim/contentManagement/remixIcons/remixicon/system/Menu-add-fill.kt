package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Menu-add-fill`: ImageVector
    get() {
        if (`_menu-add-fill` != null) {
            return `_menu-add-fill`!!
        }
        `_menu-add-fill` = Builder(name = "Menu-add-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                lineTo(17.999f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.999f)
                lineTo(18.0f, 23.0f)
                horizontalLineTo(16.0f)
                lineTo(15.999f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.999f)
                lineTo(16.0f, 15.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_menu-add-fill`!!
    }

private var `_menu-add-fill`: ImageVector? = null