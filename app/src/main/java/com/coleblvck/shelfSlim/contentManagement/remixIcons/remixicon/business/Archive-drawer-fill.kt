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

public val BusinessGroup.`Archive-drawer-fill`: ImageVector
    get() {
        if (`_archive-drawer-fill` != null) {
            return `_archive-drawer-fill`!!
        }
        `_archive-drawer-fill` = Builder(name = "Archive-drawer-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0025f)
                curveTo(21.0f, 21.5534f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5537f, 3.0f, 21.0025f)
                verticalLineTo(13.0f)
                close()
                moveTo(3.0f, 2.9975f)
                curveTo(3.0f, 2.4466f, 3.445f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 2.0f, 21.0f, 2.4463f, 21.0f, 2.9975f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.9975f)
                close()
                moveTo(9.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_archive-drawer-fill`!!
    }

private var `_archive-drawer-fill`: ImageVector? = null
