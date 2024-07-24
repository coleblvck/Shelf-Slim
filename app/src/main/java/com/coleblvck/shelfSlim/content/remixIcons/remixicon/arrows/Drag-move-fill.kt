package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Drag-move-fill`: ImageVector
    get() {
        if (`_drag-move-fill` != null) {
            return `_drag-move-fill`!!
        }
        `_drag-move-fill` = Builder(name = "Drag-move-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 22.0f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(2.0f, 12.0f)
                lineTo(6.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(18.0f, 16.0f)
                verticalLineTo(8.0f)
                lineTo(22.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_drag-move-fill`!!
    }

private var `_drag-move-fill`: ImageVector? = null
