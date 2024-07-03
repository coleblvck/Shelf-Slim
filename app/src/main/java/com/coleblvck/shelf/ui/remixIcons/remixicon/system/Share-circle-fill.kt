package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Share-circle-fill`: ImageVector
    get() {
        if (`_share-circle-fill` != null) {
            return `_share-circle-fill`!!
        }
        `_share-circle-fill` = Builder(name = "Share-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0494f)
                verticalLineTo(4.0619f)
                curveTo(7.0537f, 4.554f, 4.0f, 7.9204f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.0796f, 20.0f, 19.446f, 16.9463f, 19.9381f, 13.0f)
                horizontalLineTo(21.9506f)
                curveTo(21.4489f, 18.0533f, 17.1853f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9467f, 2.5511f, 11.0f, 2.0494f)
                close()
                moveTo(18.7071f, 6.7071f)
                lineTo(12.0f, 13.4142f)
                lineTo(10.5858f, 12.0f)
                lineTo(17.2929f, 5.2929f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                lineTo(18.7071f, 6.7071f)
                close()
            }
        }
        .build()
        return `_share-circle-fill`!!
    }

private var `_share-circle-fill`: ImageVector? = null
