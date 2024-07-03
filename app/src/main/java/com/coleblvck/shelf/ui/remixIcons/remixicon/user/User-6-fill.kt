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

public val UserGroup.`User-6-fill`: ImageVector
    get() {
        if (`_user-6-fill` != null) {
            return `_user-6-fill`!!
        }
        `_user-6-fill` = Builder(name = "User-6-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 17.0f)
                curveTo(15.6623f, 17.0f, 18.8649f, 18.5751f, 20.607f, 20.9247f)
                lineTo(18.765f, 21.796f)
                curveTo(17.3473f, 20.1157f, 14.8473f, 19.0f, 11.9999f, 19.0f)
                curveTo(9.1525f, 19.0f, 6.6525f, 20.1157f, 5.2348f, 21.796f)
                lineTo(3.3935f, 20.9238f)
                curveTo(5.1358f, 18.5747f, 8.338f, 17.0f, 11.9999f, 17.0f)
                close()
                moveTo(11.9999f, 2.0f)
                curveTo(14.7613f, 2.0f, 16.9999f, 4.2386f, 16.9999f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(16.9999f, 12.7614f, 14.7613f, 15.0f, 11.9999f, 15.0f)
                curveTo(9.2385f, 15.0f, 6.9999f, 12.7614f, 6.9999f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(6.9999f, 4.2386f, 9.2385f, 2.0f, 11.9999f, 2.0f)
                close()
            }
        }
        .build()
        return `_user-6-fill`!!
    }

private var `_user-6-fill`: ImageVector? = null
