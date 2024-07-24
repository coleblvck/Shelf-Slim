package com.coleblvck.shelfSlim.content.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.UserGroup

public val UserGroup.`Account-box-fill`: ImageVector
    get() {
        if (`_account-box-fill` != null) {
            return `_account-box-fill`!!
        }
        `_account-box-fill` = Builder(name = "Account-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.9951f)
                curveTo(3.0f, 3.8932f, 3.8926f, 3.0f, 4.9951f, 3.0f)
                horizontalLineTo(19.0049f)
                curveTo(20.1068f, 3.0f, 21.0f, 3.8926f, 21.0f, 4.9951f)
                verticalLineTo(19.0049f)
                curveTo(21.0f, 20.1068f, 20.1074f, 21.0f, 19.0049f, 21.0f)
                horizontalLineTo(4.9951f)
                curveTo(3.8932f, 21.0f, 3.0f, 20.1074f, 3.0f, 19.0049f)
                verticalLineTo(4.9951f)
                close()
                moveTo(6.3569f, 18.0f)
                horizontalLineTo(17.8475f)
                curveTo(16.5825f, 16.1865f, 14.4809f, 15.0f, 12.1022f, 15.0f)
                curveTo(9.7234f, 15.0f, 7.6218f, 16.1865f, 6.3569f, 18.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.933f, 13.0f, 15.5f, 11.433f, 15.5f, 9.5f)
                curveTo(15.5f, 7.567f, 13.933f, 6.0f, 12.0f, 6.0f)
                curveTo(10.067f, 6.0f, 8.5f, 7.567f, 8.5f, 9.5f)
                curveTo(8.5f, 11.433f, 10.067f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_account-box-fill`!!
    }

private var `_account-box-fill`: ImageVector? = null
