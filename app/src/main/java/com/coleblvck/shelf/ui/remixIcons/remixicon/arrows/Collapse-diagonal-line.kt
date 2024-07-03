package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Collapse-diagonal-line`: ImageVector
    get() {
        if (`_collapse-diagonal-line` != null) {
            return `_collapse-diagonal-line`!!
        }
        `_collapse-diagonal-line` = Builder(name = "Collapse-diagonal-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0001f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0001f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0001f)
                horizontalLineTo(16.4142f)
                lineTo(20.7071f, 4.7072f)
                lineTo(19.2929f, 3.293f)
                lineTo(15.0f, 7.5859f)
                verticalLineTo(4.0001f)
                close()
                moveTo(4.0001f, 15.0f)
                horizontalLineTo(7.5859f)
                lineTo(3.293f, 19.2929f)
                lineTo(4.7072f, 20.7071f)
                lineTo(9.0001f, 16.4142f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0001f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_collapse-diagonal-line`!!
    }

private var `_collapse-diagonal-line`: ImageVector? = null
