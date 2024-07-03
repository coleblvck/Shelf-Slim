package com.coleblvck.shelf.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Account-circle-line`: ImageVector
    get() {
        if (`_account-circle-line` != null) {
            return `_account-circle-line`!!
        }
        `_account-circle-line` = Builder(name = "Account-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.1597f, 16.0f)
                curveTo(10.1243f, 16.0f, 8.2918f, 16.8687f, 7.0128f, 18.2556f)
                curveTo(8.3804f, 19.3474f, 10.114f, 20.0f, 12.0f, 20.0f)
                curveTo(13.9695f, 20.0f, 15.7727f, 19.2883f, 17.1666f, 18.1081f)
                curveTo(15.8956f, 16.8074f, 14.1219f, 16.0f, 12.1597f, 16.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 13.8106f, 4.6015f, 15.4807f, 5.6156f, 16.8214f)
                curveTo(7.2564f, 15.0841f, 9.5814f, 14.0f, 12.1597f, 14.0f)
                curveTo(14.6441f, 14.0f, 16.8933f, 15.0066f, 18.5218f, 16.6342f)
                curveTo(19.4526f, 15.3267f, 20.0f, 13.7273f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(14.2091f, 5.0f, 16.0f, 6.7909f, 16.0f, 9.0f)
                curveTo(16.0f, 11.2091f, 14.2091f, 13.0f, 12.0f, 13.0f)
                curveTo(9.7909f, 13.0f, 8.0f, 11.2091f, 8.0f, 9.0f)
                curveTo(8.0f, 6.7909f, 9.7909f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_account-circle-line`!!
    }

private var `_account-circle-line`: ImageVector? = null
