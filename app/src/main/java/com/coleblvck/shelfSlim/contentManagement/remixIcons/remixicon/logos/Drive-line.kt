package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Drive-line`: ImageVector
    get() {
        if (`_drive-line` != null) {
            return `_drive-line`!!
        }
        `_drive-line` = Builder(name = "Drive-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0974f, 6.1501f)
                lineTo(4.3101f, 14.4431f)
                lineTo(6.0647f, 17.4746f)
                lineTo(10.8502f, 9.186f)
                lineTo(9.0974f, 6.1501f)
                close()
                moveTo(7.797f, 18.4742f)
                horizontalLineTo(17.3651f)
                lineTo(19.1162f, 15.44f)
                horizontalLineTo(9.5488f)
                lineTo(7.797f, 18.4742f)
                close()
                moveTo(19.1109f, 13.44f)
                lineTo(14.3252f, 5.15f)
                horizontalLineTo(10.8294f)
                lineTo(15.6156f, 13.44f)
                horizontalLineTo(19.1109f)
                close()
                moveTo(8.52f, 3.15f)
                horizontalLineTo(15.48f)
                lineTo(22.0f, 14.4444f)
                lineTo(18.52f, 20.4742f)
                horizontalLineTo(5.49f)
                lineTo(2.0f, 14.4444f)
                lineTo(8.52f, 3.15f)
                close()
                moveTo(12.0049f, 11.186f)
                lineTo(10.7035f, 13.44f)
                horizontalLineTo(13.3062f)
                lineTo(12.0049f, 11.186f)
                close()
            }
        }
        .build()
        return `_drive-line`!!
    }

private var `_drive-line`: ImageVector? = null
