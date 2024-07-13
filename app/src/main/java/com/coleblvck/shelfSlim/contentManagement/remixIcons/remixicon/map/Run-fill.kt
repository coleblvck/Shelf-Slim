package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Run-fill`: ImageVector
    get() {
        if (`_run-fill` != null) {
            return `_run-fill`!!
        }
        `_run-fill` = Builder(name = "Run-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8299f, 8.7899f)
                lineTo(8.0f, 9.4559f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.05f)
                horizontalLineTo(6.015f)
                lineTo(11.2834f, 6.1325f)
                curveTo(11.5274f, 6.0385f, 11.7922f, 5.9916f, 12.0648f, 6.0008f)
                curveTo(13.1762f, 6.0281f, 14.1522f, 6.7567f, 14.4917f, 7.8204f)
                curveTo(14.678f, 8.4043f, 14.848f, 8.7984f, 15.0015f, 9.0025f)
                curveTo(15.9138f, 10.2155f, 17.3653f, 11.0f, 19.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(16.8253f, 13.0f, 14.8823f, 12.0083f, 13.5984f, 10.4526f)
                lineTo(13.017f, 13.7497f)
                lineTo(15.0f, 15.67f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0142f)
                lineTo(10.9507f, 15.0271f)
                lineTo(10.003f, 19.3253f)
                lineTo(3.1094f, 18.1098f)
                lineTo(3.4567f, 16.1401f)
                lineTo(8.3807f, 17.0084f)
                lineTo(9.8299f, 8.7899f)
                close()
                moveTo(13.5f, 5.5f)
                curveTo(12.3954f, 5.5f, 11.5f, 4.6046f, 11.5f, 3.5f)
                curveTo(11.5f, 2.3954f, 12.3954f, 1.5f, 13.5f, 1.5f)
                curveTo(14.6046f, 1.5f, 15.5f, 2.3954f, 15.5f, 3.5f)
                curveTo(15.5f, 4.6046f, 14.6046f, 5.5f, 13.5f, 5.5f)
                close()
            }
        }
        .build()
        return `_run-fill`!!
    }

private var `_run-fill`: ImageVector? = null
