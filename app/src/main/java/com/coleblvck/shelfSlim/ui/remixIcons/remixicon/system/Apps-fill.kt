package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Apps-fill`: ImageVector
    get() {
        if (`_apps-fill` != null) {
            return `_apps-fill`!!
        }
        `_apps-fill` = Builder(name = "Apps-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 2.5f)
                curveTo(9.0972f, 2.5f, 11.0f, 4.4028f, 11.0f, 6.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.75f)
                curveTo(4.4028f, 11.0f, 2.5f, 9.0972f, 2.5f, 6.75f)
                curveTo(2.5f, 4.4028f, 4.4028f, 2.5f, 6.75f, 2.5f)
                close()
                moveTo(6.75f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.25f)
                curveTo(11.0f, 19.5972f, 9.0972f, 21.5f, 6.75f, 21.5f)
                curveTo(4.4028f, 21.5f, 2.5f, 19.5972f, 2.5f, 17.25f)
                curveTo(2.5f, 14.9028f, 4.4028f, 13.0f, 6.75f, 13.0f)
                close()
                moveTo(17.25f, 2.5f)
                curveTo(19.5972f, 2.5f, 21.5f, 4.4028f, 21.5f, 6.75f)
                curveTo(21.5f, 9.0972f, 19.5972f, 11.0f, 17.25f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.75f)
                curveTo(13.0f, 4.4028f, 14.9028f, 2.5f, 17.25f, 2.5f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(17.25f)
                curveTo(19.5972f, 13.0f, 21.5f, 14.9028f, 21.5f, 17.25f)
                curveTo(21.5f, 19.5972f, 19.5972f, 21.5f, 17.25f, 21.5f)
                curveTo(14.9028f, 21.5f, 13.0f, 19.5972f, 13.0f, 17.25f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_apps-fill`!!
    }

private var `_apps-fill`: ImageVector? = null
