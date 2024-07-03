package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Contrast-2-line`: ImageVector
    get() {
        if (`_contrast-2-line` != null) {
            return `_contrast-2-line`!!
        }
        `_contrast-2-line` = Builder(name = "Contrast-2-line", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(12.0f, 19.9967f)
                curveTo(16.4183f, 19.9967f, 20.0f, 16.415f, 20.0f, 11.9967f)
                curveTo(20.0f, 7.5784f, 16.4183f, 3.9967f, 12.0f, 3.9967f)
                curveTo(7.5817f, 3.9967f, 4.0f, 7.5784f, 4.0f, 11.9967f)
                curveTo(4.0f, 16.415f, 7.5817f, 19.9967f, 12.0f, 19.9967f)
                close()
                moveTo(7.0003f, 15.316f)
                curveTo(9.08f, 15.1646f, 11.117f, 14.2939f, 12.7071f, 12.7038f)
                curveTo(14.2972f, 11.1137f, 15.1679f, 9.0767f, 15.3193f, 6.9971f)
                curveTo(15.6454f, 7.2141f, 15.955f, 7.4664f, 16.2426f, 7.7541f)
                curveTo(18.5858f, 10.0972f, 18.5858f, 13.8962f, 16.2426f, 16.2393f)
                curveTo(13.8995f, 18.5825f, 10.1005f, 18.5825f, 7.7574f, 16.2393f)
                curveTo(7.4697f, 15.9517f, 7.2174f, 15.6421f, 7.0003f, 15.316f)
                close()
            }
        }
        .build()
        return `_contrast-2-line`!!
    }

private var `_contrast-2-line`: ImageVector? = null
