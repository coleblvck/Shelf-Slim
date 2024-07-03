package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Account-circle-fill`: ImageVector
    get() {
        if (`_account-circle-fill` != null) {
            return `_account-circle-fill`!!
        }
        `_account-circle-fill` = Builder(name = "Account-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.0233f, 15.4163f)
                curveTo(7.4908f, 17.6069f, 9.6951f, 19.0f, 12.1597f, 19.0f)
                curveTo(14.6243f, 19.0f, 16.8286f, 17.6069f, 18.2961f, 15.4163f)
                curveTo(16.6885f, 13.9172f, 14.5312f, 13.0f, 12.1597f, 13.0f)
                curveTo(9.7882f, 13.0f, 7.6309f, 13.9172f, 6.0233f, 15.4163f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.6569f, 11.0f, 15.0f, 9.6568f, 15.0f, 8.0f)
                curveTo(15.0f, 6.3432f, 13.6569f, 5.0f, 12.0f, 5.0f)
                curveTo(10.3431f, 5.0f, 9.0f, 6.3432f, 9.0f, 8.0f)
                curveTo(9.0f, 9.6568f, 10.3431f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_account-circle-fill`!!
    }

private var `_account-circle-fill`: ImageVector? = null