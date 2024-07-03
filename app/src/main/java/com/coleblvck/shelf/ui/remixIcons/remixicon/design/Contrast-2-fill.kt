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

public val DesignGroup.`Contrast-2-fill`: ImageVector
    get() {
        if (`_contrast-2-fill` != null) {
            return `_contrast-2-fill`!!
        }
        `_contrast-2-fill` = Builder(name = "Contrast-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.9967f)
                curveTo(6.4771f, 21.9967f, 2.0f, 17.5196f, 2.0f, 11.9967f)
                curveTo(2.0f, 6.4739f, 6.4771f, 1.9967f, 12.0f, 1.9967f)
                curveTo(17.5228f, 1.9967f, 22.0f, 6.4739f, 22.0f, 11.9967f)
                curveTo(22.0f, 17.5196f, 17.5228f, 21.9967f, 12.0f, 21.9967f)
                close()
                moveTo(5.3289f, 16.422f)
                curveTo(6.7638f, 18.5675f, 9.2087f, 19.9803f, 11.9836f, 19.9803f)
                curveTo(16.4018f, 19.9803f, 19.9836f, 16.3985f, 19.9836f, 11.9803f)
                curveTo(19.9836f, 9.2053f, 18.5707f, 6.7603f, 16.4251f, 5.3255f)
                curveTo(17.2705f, 8.3532f, 16.5025f, 11.7369f, 14.1213f, 14.1181f)
                curveTo(11.7401f, 16.4993f, 8.3566f, 17.2672f, 5.3289f, 16.422f)
                close()
            }
        }
        .build()
        return `_contrast-2-fill`!!
    }

private var `_contrast-2-fill`: ImageVector? = null
