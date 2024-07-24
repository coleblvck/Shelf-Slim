package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Edit-fill`: ImageVector
    get() {
        if (`_edit-fill` != null) {
            return `_edit-fill`!!
        }
        `_edit-fill` = Builder(name = "Edit-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2426f, 17.9967f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.754f)
                lineTo(14.435f, 2.319f)
                curveTo(14.8256f, 1.9285f, 15.4587f, 1.9285f, 15.8492f, 2.319f)
                lineTo(18.6777f, 5.1474f)
                curveTo(19.0682f, 5.538f, 19.0682f, 6.1711f, 18.6777f, 6.5616f)
                lineTo(7.2426f, 17.9967f)
                close()
                moveTo(3.0f, 19.9967f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.9967f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.9967f)
                close()
            }
        }
        .build()
        return `_edit-fill`!!
    }

private var `_edit-fill`: ImageVector? = null
