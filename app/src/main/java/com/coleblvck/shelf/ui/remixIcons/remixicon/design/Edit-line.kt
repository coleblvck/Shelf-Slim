package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Edit-line`: ImageVector
    get() {
        if (`_edit-line` != null) {
            return `_edit-line`!!
        }
        `_edit-line` = Builder(name = "Edit-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4142f, 15.89f)
                lineTo(16.5563f, 5.7478f)
                lineTo(15.1421f, 4.3336f)
                lineTo(5.0f, 14.4758f)
                verticalLineTo(15.89f)
                horizontalLineTo(6.4142f)
                close()
                moveTo(7.2426f, 17.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.6473f)
                lineTo(14.435f, 2.2123f)
                curveTo(14.8256f, 1.8218f, 15.4587f, 1.8218f, 15.8492f, 2.2123f)
                lineTo(18.6777f, 5.0407f)
                curveTo(19.0682f, 5.4313f, 19.0682f, 6.0644f, 18.6777f, 6.4549f)
                lineTo(7.2426f, 17.89f)
                close()
                moveTo(3.0f, 19.89f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.89f)
                close()
            }
        }
        .build()
        return `_edit-line`!!
    }

private var `_edit-line`: ImageVector? = null
