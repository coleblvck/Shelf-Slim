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

public val SystemGroup.`Apps-2-add-fill`: ImageVector
    get() {
        if (`_apps-2-add-fill` != null) {
            return `_apps-2-add-fill`!!
        }
        `_apps-2-add-fill` = Builder(name = "Apps-2-add-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.0f)
                curveTo(2.5f, 9.4853f, 4.5147f, 11.5f, 7.0f, 11.5f)
                curveTo(9.4853f, 11.5f, 11.5f, 9.4853f, 11.5f, 7.0f)
                curveTo(11.5f, 4.5147f, 9.4853f, 2.5f, 7.0f, 2.5f)
                curveTo(4.5147f, 2.5f, 2.5f, 4.5147f, 2.5f, 7.0f)
                close()
                moveTo(2.5f, 17.0f)
                curveTo(2.5f, 19.4853f, 4.5147f, 21.5f, 7.0f, 21.5f)
                curveTo(9.4853f, 21.5f, 11.5f, 19.4853f, 11.5f, 17.0f)
                curveTo(11.5f, 14.5147f, 9.4853f, 12.5f, 7.0f, 12.5f)
                curveTo(4.5147f, 12.5f, 2.5f, 14.5147f, 2.5f, 17.0f)
                close()
                moveTo(12.5f, 17.0f)
                curveTo(12.5f, 19.4853f, 14.5147f, 21.5f, 17.0f, 21.5f)
                curveTo(19.4853f, 21.5f, 21.5f, 19.4853f, 21.5f, 17.0f)
                curveTo(21.5f, 14.5147f, 19.4853f, 12.5f, 17.0f, 12.5f)
                curveTo(14.5147f, 12.5f, 12.5f, 14.5147f, 12.5f, 17.0f)
                close()
                moveTo(16.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_apps-2-add-fill`!!
    }

private var `_apps-2-add-fill`: ImageVector? = null