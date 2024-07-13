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

public val SystemGroup.`Menu-unfold-fill`: ImageVector
    get() {
        if (`_menu-unfold-fill` != null) {
            return `_menu-unfold-fill`!!
        }
        `_menu-unfold-fill` = Builder(name = "Menu-unfold-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.9996f)
                verticalLineTo(19.9996f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.9996f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.0f, 3.5f)
                lineTo(22.0f, 8.4995f)
                lineTo(17.0f, 13.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(12.0f, 10.9996f)
                verticalLineTo(12.9996f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.9996f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 3.9996f)
                verticalLineTo(5.9995f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.9996f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_menu-unfold-fill`!!
    }

private var `_menu-unfold-fill`: ImageVector? = null
