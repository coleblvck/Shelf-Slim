package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Hand-sanitizer-line`: ImageVector
    get() {
        if (`_hand-sanitizer-line` != null) {
            return `_hand-sanitizer-line`!!
        }
        `_hand-sanitizer-line` = Builder(name = "Hand-sanitizer-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0002f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(13.0002f, 3.999f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0002f)
                verticalLineTo(8.0f)
                curveTo(18.2093f, 8.0f, 20.0002f, 9.7909f, 20.0002f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(20.0002f, 21.1046f, 19.1048f, 22.0f, 18.0002f, 22.0f)
                horizontalLineTo(6.0002f)
                curveTo(4.8956f, 22.0f, 4.0002f, 21.1046f, 4.0002f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(4.0002f, 9.7909f, 5.7911f, 8.0f, 8.0002f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0002f)
                verticalLineTo(3.999f)
                lineTo(7.5002f, 4.0f)
                curveTo(6.8702f, 4.0f, 6.1302f, 4.49f, 5.3002f, 5.6f)
                lineTo(3.7002f, 4.4f)
                curveTo(4.8702f, 2.84f, 6.1302f, 2.0f, 7.5002f, 2.0f)
                horizontalLineTo(17.0002f)
                close()
                moveTo(16.0002f, 10.0f)
                horizontalLineTo(8.0002f)
                curveTo(6.8956f, 10.0f, 6.0002f, 10.8954f, 6.0002f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0002f)
                verticalLineTo(12.0f)
                curveTo(18.0002f, 10.8954f, 17.1048f, 10.0f, 16.0002f, 10.0f)
                close()
                moveTo(13.0002f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0002f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.9992f)
                lineTo(13.0002f, 18.0f)
                horizontalLineTo(11.0002f)
                lineTo(10.9992f, 16.0f)
                horizontalLineTo(9.0002f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0002f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0002f)
                close()
            }
        }
        .build()
        return `_hand-sanitizer-line`!!
    }

private var `_hand-sanitizer-line`: ImageVector? = null
