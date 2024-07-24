package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Contrast-fill`: ImageVector
    get() {
        if (`_contrast-fill` != null) {
            return `_contrast-fill`!!
        }
        `_contrast-fill` = Builder(name = "Contrast-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.9967f)
                curveTo(6.4771f, 21.9967f, 2.0f, 17.5196f, 2.0f, 11.9967f)
                curveTo(2.0f, 6.4739f, 6.4771f, 1.9967f, 12.0f, 1.9967f)
                curveTo(17.5228f, 1.9967f, 22.0f, 6.4739f, 22.0f, 11.9967f)
                curveTo(22.0f, 17.5196f, 17.5228f, 21.9967f, 12.0f, 21.9967f)
                close()
                moveTo(12.0f, 19.9967f)
                verticalLineTo(3.9967f)
                curveTo(7.5817f, 3.9967f, 4.0f, 7.5784f, 4.0f, 11.9967f)
                curveTo(4.0f, 16.415f, 7.5817f, 19.9967f, 12.0f, 19.9967f)
                close()
            }
        }
        .build()
        return `_contrast-fill`!!
    }

private var `_contrast-fill`: ImageVector? = null
