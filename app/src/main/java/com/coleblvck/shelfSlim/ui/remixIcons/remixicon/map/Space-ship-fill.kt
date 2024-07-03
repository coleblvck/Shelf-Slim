package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Space-ship-fill`: ImageVector
    get() {
        if (`_space-ship-fill` != null) {
            return `_space-ship-fill`!!
        }
        `_space-ship-fill` = Builder(name = "Space-ship-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8799f, 18.049f)
                curveTo(4.2302f, 12.0557f, 7.0753f, 6.6285f, 11.003f, 2.1796f)
                curveTo(11.1105f, 2.0578f, 11.2465f, 1.9074f, 11.411f, 1.7285f)
                lineTo(11.411f, 1.7285f)
                curveTo(11.7101f, 1.4032f, 12.2162f, 1.382f, 12.5414f, 1.6811f)
                curveTo(12.5579f, 1.6962f, 12.5737f, 1.712f, 12.5888f, 1.7285f)
                curveTo(12.7553f, 1.9096f, 12.8929f, 2.0616f, 13.0015f, 2.1847f)
                curveTo(16.9268f, 6.6327f, 19.7703f, 12.058f, 21.12f, 18.049f)
                curveTo(18.9786f, 18.5004f, 16.7797f, 18.796f, 14.5359f, 18.9235f)
                lineTo(12.4472f, 23.101f)
                curveTo(12.3237f, 23.348f, 12.0233f, 23.4481f, 11.7763f, 23.3246f)
                curveTo(11.6796f, 23.2762f, 11.6011f, 23.1977f, 11.5527f, 23.101f)
                lineTo(9.464f, 18.9235f)
                curveTo(7.2202f, 18.796f, 5.0213f, 18.5004f, 2.8799f, 18.049f)
                close()
                moveTo(11.9999f, 14.9954f)
                curveTo(13.6568f, 14.9954f, 14.9999f, 13.6523f, 14.9999f, 11.9954f)
                curveTo(14.9999f, 10.3386f, 13.6568f, 8.9954f, 11.9999f, 8.9954f)
                curveTo(10.3431f, 8.9954f, 8.9999f, 10.3386f, 8.9999f, 11.9954f)
                curveTo(8.9999f, 13.6523f, 10.3431f, 14.9954f, 11.9999f, 14.9954f)
                close()
            }
        }
        .build()
        return `_space-ship-fill`!!
    }

private var `_space-ship-fill`: ImageVector? = null
