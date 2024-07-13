package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Edit-2-line`: ImageVector
    get() {
        if (`_edit-2-line` != null) {
            return `_edit-2-line`!!
        }
        `_edit-2-line` = Builder(name = "Edit-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.89f)
                horizontalLineTo(6.4142f)
                lineTo(15.7279f, 9.5763f)
                lineTo(14.3137f, 8.1621f)
                lineTo(5.0f, 17.4758f)
                verticalLineTo(18.89f)
                close()
                moveTo(21.0f, 20.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.6473f)
                lineTo(16.435f, 3.2123f)
                curveTo(16.8256f, 2.8218f, 17.4587f, 2.8218f, 17.8492f, 3.2123f)
                lineTo(20.6777f, 6.0407f)
                curveTo(21.0682f, 6.4313f, 21.0682f, 7.0644f, 20.6777f, 7.4549f)
                lineTo(9.2426f, 18.89f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.89f)
                close()
                moveTo(15.7279f, 6.7478f)
                lineTo(17.1421f, 8.1621f)
                lineTo(18.5563f, 6.7478f)
                lineTo(17.1421f, 5.3336f)
                lineTo(15.7279f, 6.7478f)
                close()
            }
        }
        .build()
        return `_edit-2-line`!!
    }

private var `_edit-2-line`: ImageVector? = null
