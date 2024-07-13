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

public val UserGroup.`Spy-fill`: ImageVector
    get() {
        if (`_spy-fill` != null) {
            return `_spy-fill`!!
        }
        `_spy-fill` = Builder(name = "Spy-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                curveTo(19.2091f, 13.0f, 21.0f, 14.7909f, 21.0f, 17.0f)
                curveTo(21.0f, 19.2091f, 19.2091f, 21.0f, 17.0f, 21.0f)
                curveTo(14.8578f, 21.0f, 13.0f, 19.21f, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 19.2091f, 9.2091f, 21.0f, 7.0f, 21.0f)
                curveTo(4.7909f, 21.0f, 3.0f, 19.2091f, 3.0f, 17.0f)
                curveTo(3.0f, 14.7909f, 4.7909f, 13.0f, 7.0f, 13.0f)
                curveTo(8.4805f, 13.0f, 9.7732f, 13.8043f, 10.4648f, 14.9999f)
                horizontalLineTo(13.5352f)
                curveTo(14.2268f, 13.8043f, 15.5195f, 13.0f, 17.0f, 13.0f)
                close()
                moveTo(2.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.7909f, 5.7909f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(18.2091f, 3.0f, 20.0f, 4.7909f, 20.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return `_spy-fill`!!
    }

private var `_spy-fill`: ImageVector? = null
