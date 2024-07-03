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

public val SystemGroup.`Hourglass-fill`: ImageVector
    get() {
        if (`_hourglass-fill` != null) {
            return `_hourglass-fill`!!
        }
        `_hourglass-fill` = Builder(name = "Hourglass-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 7.6154f, 17.1838f, 8.9147f, 16.1561f, 9.9767f)
                curveTo(15.4532f, 10.703f, 14.598f, 11.372f, 13.7309f, 12.0f)
                curveTo(14.598f, 12.628f, 15.4532f, 13.297f, 16.1561f, 14.0233f)
                curveTo(17.1838f, 15.0853f, 18.0f, 16.3846f, 18.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 16.3846f, 6.8162f, 15.0853f, 7.8439f, 14.0233f)
                curveTo(8.5468f, 13.297f, 9.402f, 12.628f, 10.2691f, 12.0f)
                curveTo(9.402f, 11.372f, 8.5468f, 10.703f, 7.8439f, 9.9767f)
                curveTo(6.8162f, 8.9147f, 6.0f, 7.6154f, 6.0f, 6.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 6.6851f, 8.2603f, 7.335f, 8.7713f, 8.0f)
                horizontalLineTo(15.2287f)
                curveTo(15.7397f, 7.335f, 16.0f, 6.6851f, 16.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.0f, 13.2219f)
                curveTo(10.9548f, 13.9602f, 10.008f, 14.663f, 9.2811f, 15.4142f)
                curveTo(9.0901f, 15.6116f, 8.9201f, 15.8064f, 8.7713f, 16.0f)
                horizontalLineTo(15.2287f)
                curveTo(15.0799f, 15.8064f, 14.9099f, 15.6116f, 14.7189f, 15.4142f)
                curveTo(13.992f, 14.663f, 13.0452f, 13.9602f, 12.0f, 13.2219f)
                close()
            }
        }
        .build()
        return `_hourglass-fill`!!
    }

private var `_hourglass-fill`: ImageVector? = null
