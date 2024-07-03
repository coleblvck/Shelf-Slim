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

public val SystemGroup.`Alert-line`: ImageVector
    get() {
        if (`_alert-line` != null) {
            return `_alert-line`!!
        }
        `_alert-line` = Builder(name = "Alert-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8659f, 3.0002f)
                lineTo(22.3922f, 19.5002f)
                curveTo(22.6684f, 19.9785f, 22.5045f, 20.5901f, 22.0262f, 20.8662f)
                curveTo(21.8742f, 20.954f, 21.7017f, 21.0002f, 21.5262f, 21.0002f)
                horizontalLineTo(2.4736f)
                curveTo(1.9214f, 21.0002f, 1.4736f, 20.5525f, 1.4736f, 20.0002f)
                curveTo(1.4736f, 19.8246f, 1.5198f, 19.6522f, 1.6076f, 19.5002f)
                lineTo(11.1339f, 3.0002f)
                curveTo(11.41f, 2.5219f, 12.0216f, 2.358f, 12.4999f, 2.6341f)
                curveTo(12.6519f, 2.7219f, 12.7782f, 2.8482f, 12.8659f, 3.0002f)
                close()
                moveTo(4.2057f, 19.0002f)
                horizontalLineTo(19.7941f)
                lineTo(11.9999f, 5.5002f)
                lineTo(4.2057f, 19.0002f)
                close()
                moveTo(10.9999f, 16.0002f)
                horizontalLineTo(12.9999f)
                verticalLineTo(18.0002f)
                horizontalLineTo(10.9999f)
                verticalLineTo(16.0002f)
                close()
                moveTo(10.9999f, 9.0002f)
                horizontalLineTo(12.9999f)
                verticalLineTo(14.0002f)
                horizontalLineTo(10.9999f)
                verticalLineTo(9.0002f)
                close()
            }
        }
        .build()
        return `_alert-line`!!
    }

private var `_alert-line`: ImageVector? = null
