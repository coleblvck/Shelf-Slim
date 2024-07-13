package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`Group-fill`: ImageVector
    get() {
        if (`_group-fill` != null) {
            return `_group-fill`!!
        }
        `_group-fill` = Builder(name = "Group-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 17.5817f, 5.5817f, 14.0f, 10.0f, 14.0f)
                curveTo(14.4183f, 14.0f, 18.0f, 17.5817f, 18.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(17.3628f, 15.2332f)
                curveTo(20.4482f, 16.0217f, 22.7679f, 18.7235f, 22.9836f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 19.3902f, 19.0002f, 17.0139f, 17.3628f, 15.2332f)
                close()
                moveTo(15.3401f, 12.9569f)
                curveTo(16.9728f, 11.4922f, 18.0f, 9.3661f, 18.0f, 7.0f)
                curveTo(18.0f, 5.5827f, 17.6314f, 4.2514f, 16.9849f, 3.0969f)
                curveTo(19.2753f, 3.554f, 21.0f, 5.5746f, 21.0f, 8.0f)
                curveTo(21.0f, 10.7625f, 18.7625f, 13.0f, 16.0f, 13.0f)
                curveTo(15.7763f, 13.0f, 15.556f, 12.9853f, 15.3401f, 12.9569f)
                close()
            }
        }
        .build()
        return `_group-fill`!!
    }

private var `_group-fill`: ImageVector? = null
