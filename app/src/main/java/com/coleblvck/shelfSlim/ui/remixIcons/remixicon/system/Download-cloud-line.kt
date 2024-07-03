package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Download-cloud-line`: ImageVector
    get() {
        if (`_download-cloud-line` != null) {
            return `_download-cloud-line`!!
        }
        `_download-cloud-line` = Builder(name = "Download-cloud-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 14.5f)
                curveTo(1.0f, 12.1716f, 2.2243f, 10.1291f, 4.0643f, 8.9812f)
                curveTo(4.5647f, 5.044f, 7.9269f, 2.0f, 12.0f, 2.0f)
                curveTo(16.0731f, 2.0f, 19.4353f, 5.044f, 19.9357f, 8.9812f)
                curveTo(21.7757f, 10.1291f, 23.0f, 12.1716f, 23.0f, 14.5f)
                curveTo(23.0f, 17.9216f, 20.3562f, 20.7257f, 17.0f, 20.9811f)
                lineTo(7.0f, 21.0f)
                curveTo(3.6438f, 20.7257f, 1.0f, 17.9216f, 1.0f, 14.5f)
                close()
                moveTo(16.8483f, 18.9868f)
                curveTo(19.1817f, 18.8093f, 21.0f, 16.8561f, 21.0f, 14.5f)
                curveTo(21.0f, 12.927f, 20.1884f, 11.4962f, 18.8771f, 10.6781f)
                lineTo(18.0714f, 10.1754f)
                lineTo(17.9517f, 9.2334f)
                curveTo(17.5735f, 6.258f, 15.0288f, 4.0f, 12.0f, 4.0f)
                curveTo(8.9712f, 4.0f, 6.4265f, 6.258f, 6.0483f, 9.2334f)
                lineTo(5.9286f, 10.1754f)
                lineTo(5.1229f, 10.6781f)
                curveTo(3.8116f, 11.4962f, 3.0f, 12.927f, 3.0f, 14.5f)
                curveTo(3.0f, 16.8561f, 4.8183f, 18.8093f, 7.1517f, 18.9868f)
                lineTo(7.325f, 19.0f)
                horizontalLineTo(16.675f)
                lineTo(16.8483f, 18.9868f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_download-cloud-line`!!
    }

private var `_download-cloud-line`: ImageVector? = null
