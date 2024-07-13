package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Gradienter-fill`: ImageVector
    get() {
        if (`_gradienter-fill` != null) {
            return `_gradienter-fill`!!
        }
        `_gradienter-fill` = Builder(name = "Gradienter-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.126f, 11.0f)
                horizontalLineTo(4.0619f)
                curveTo(4.021f, 11.3276f, 4.0f, 11.6613f, 4.0f, 12.0f)
                curveTo(4.0f, 12.3387f, 4.021f, 12.6724f, 4.0619f, 13.0f)
                horizontalLineTo(8.126f)
                curveTo(8.0437f, 12.6804f, 8.0f, 12.3453f, 8.0f, 12.0f)
                curveTo(8.0f, 11.6547f, 8.0437f, 11.3196f, 8.126f, 11.0f)
                close()
                moveTo(15.874f, 11.0f)
                curveTo(15.9562f, 11.3196f, 16.0f, 11.6547f, 16.0f, 12.0f)
                curveTo(16.0f, 12.3453f, 15.9562f, 12.6804f, 15.874f, 13.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.979f, 12.6724f, 20.0f, 12.3387f, 20.0f, 12.0f)
                curveTo(20.0f, 11.6613f, 19.979f, 11.3276f, 19.9381f, 11.0f)
                horizontalLineTo(15.874f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_gradienter-fill`!!
    }

private var `_gradienter-fill`: ImageVector? = null
