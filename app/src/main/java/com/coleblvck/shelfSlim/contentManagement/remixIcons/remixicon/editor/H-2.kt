package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`H-2`: ImageVector
    get() {
        if (`_h-2` != null) {
            return `_h-2`!!
        }
        `_h-2` = Builder(name = "H-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.5f, 8.0f)
                curveTo(20.5711f, 8.0f, 22.25f, 9.6789f, 22.25f, 11.75f)
                curveTo(22.25f, 12.6074f, 21.9623f, 13.3976f, 21.4781f, 14.0292f)
                lineTo(21.3302f, 14.2102f)
                lineTo(18.0343f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                lineTo(14.9993f, 18.444f)
                lineTo(19.8207f, 12.8981f)
                curveTo(20.0881f, 12.5908f, 20.25f, 12.1893f, 20.25f, 11.75f)
                curveTo(20.25f, 10.7835f, 19.4665f, 10.0f, 18.5f, 10.0f)
                curveTo(17.5818f, 10.0f, 16.8288f, 10.7071f, 16.7558f, 11.6065f)
                lineTo(16.75f, 11.75f)
                horizontalLineTo(14.75f)
                curveTo(14.75f, 9.6789f, 16.4289f, 8.0f, 18.5f, 8.0f)
                close()
            }
        }
        .build()
        return `_h-2`!!
    }

private var `_h-2`: ImageVector? = null
