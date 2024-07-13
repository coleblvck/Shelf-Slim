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

public val EditorGroup.`Info-i`: ImageVector
    get() {
        if (`_info-i` != null) {
            return `_info-i`!!
        }
        `_info-i` = Builder(name = "Info-i", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(12.8284f, 6.0f, 13.5f, 5.3284f, 13.5f, 4.5f)
                curveTo(13.5f, 3.6716f, 12.8284f, 3.0f, 12.0f, 3.0f)
                curveTo(11.1716f, 3.0f, 10.5f, 3.6716f, 10.5f, 4.5f)
                curveTo(10.5f, 5.3284f, 11.1716f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_info-i`!!
    }

private var `_info-i`: ImageVector? = null
