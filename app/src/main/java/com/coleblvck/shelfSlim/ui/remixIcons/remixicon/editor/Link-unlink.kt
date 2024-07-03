package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Link-unlink`: ImageVector
    get() {
        if (`_link-unlink` != null) {
            return `_link-unlink`!!
        }
        `_link-unlink` = Builder(name = "Link-unlink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(18.364f, 15.5355f)
                lineTo(16.9497f, 14.1213f)
                lineTo(18.364f, 12.7071f)
                curveTo(20.3166f, 10.7545f, 20.3166f, 7.5887f, 18.364f, 5.636f)
                curveTo(16.4113f, 3.6834f, 13.2455f, 3.6834f, 11.2929f, 5.636f)
                lineTo(9.8787f, 7.0503f)
                lineTo(8.4645f, 5.636f)
                lineTo(9.8787f, 4.2218f)
                curveTo(12.6123f, 1.4882f, 17.0445f, 1.4882f, 19.7782f, 4.2218f)
                curveTo(22.5118f, 6.9555f, 22.5118f, 11.3877f, 19.7782f, 14.1213f)
                lineTo(18.364f, 15.5355f)
                close()
                moveTo(15.5355f, 18.364f)
                lineTo(14.1213f, 19.7782f)
                curveTo(11.3877f, 22.5118f, 6.9555f, 22.5118f, 4.2218f, 19.7782f)
                curveTo(1.4882f, 17.0445f, 1.4882f, 12.6123f, 4.2218f, 9.8787f)
                lineTo(5.636f, 8.4645f)
                lineTo(7.0503f, 9.8787f)
                lineTo(5.636f, 11.2929f)
                curveTo(3.6834f, 13.2455f, 3.6834f, 16.4113f, 5.636f, 18.364f)
                curveTo(7.5887f, 20.3166f, 10.7545f, 20.3166f, 12.7071f, 18.364f)
                lineTo(14.1213f, 16.9497f)
                lineTo(15.5355f, 18.364f)
                close()
                moveTo(14.8284f, 7.7574f)
                lineTo(16.2426f, 9.1716f)
                lineTo(9.1716f, 16.2426f)
                lineTo(7.7574f, 14.8284f)
                lineTo(14.8284f, 7.7574f)
                close()
            }
        }
        .build()
        return `_link-unlink`!!
    }

private var `_link-unlink`: ImageVector? = null
