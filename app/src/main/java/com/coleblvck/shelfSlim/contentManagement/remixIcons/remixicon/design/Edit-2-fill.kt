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

public val DesignGroup.`Edit-2-fill`: ImageVector
    get() {
        if (`_edit-2-fill` != null) {
            return `_edit-2-fill`!!
        }
        `_edit-2-fill` = Builder(name = "Edit-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2426f, 18.9967f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.9967f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.754f)
                lineTo(12.8995f, 6.8545f)
                lineTo(17.1421f, 11.0972f)
                lineTo(9.2426f, 18.9967f)
                close()
                moveTo(14.3137f, 5.4403f)
                lineTo(16.435f, 3.319f)
                curveTo(16.8256f, 2.9285f, 17.4587f, 2.9285f, 17.8492f, 3.319f)
                lineTo(20.6777f, 6.1474f)
                curveTo(21.0682f, 6.538f, 21.0682f, 7.1711f, 20.6777f, 7.5616f)
                lineTo(18.5563f, 9.683f)
                lineTo(14.3137f, 5.4403f)
                close()
            }
        }
        .build()
        return `_edit-2-fill`!!
    }

private var `_edit-2-fill`: ImageVector? = null
