package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Shield-keyhole-fill`: ImageVector
    get() {
        if (`_shield-keyhole-fill` != null) {
            return `_shield-keyhole-fill`!!
        }
        `_shield-keyhole-fill` = Builder(name = "Shield-keyhole-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(20.2169f, 2.826f)
                curveTo(20.6745f, 2.9277f, 21.0f, 3.3335f, 21.0f, 3.8022f)
                verticalLineTo(13.7889f)
                curveTo(21.0f, 15.795f, 19.9974f, 17.6684f, 18.3282f, 18.7812f)
                lineTo(12.0f, 23.0f)
                lineTo(5.6718f, 18.7812f)
                curveTo(4.0026f, 17.6684f, 3.0f, 15.795f, 3.0f, 13.7889f)
                verticalLineTo(3.8022f)
                curveTo(3.0f, 3.3335f, 3.3255f, 2.9277f, 3.7831f, 2.826f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 9.7402f, 10.4022f, 10.3866f, 10.9999f, 10.7324f)
                lineTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                lineTo(13.0011f, 10.7318f)
                curveTo(13.5983f, 10.3858f, 14.0f, 9.7398f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_shield-keyhole-fill`!!
    }

private var `_shield-keyhole-fill`: ImageVector? = null