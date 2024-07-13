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

public val UserGroup.`Genderless-fill`: ImageVector
    get() {
        if (`_genderless-fill` != null) {
            return `_genderless-fill`!!
        }
        `_genderless-fill` = Builder(name = "Genderless-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0661f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0661f)
                curveTo(16.6694f, 7.555f, 19.5f, 10.6969f, 19.5f, 14.5f)
                curveTo(19.5f, 18.6421f, 16.1421f, 22.0f, 12.0f, 22.0f)
                curveTo(7.8579f, 22.0f, 4.5f, 18.6421f, 4.5f, 14.5f)
                curveTo(4.5f, 10.6969f, 7.3306f, 7.555f, 11.0f, 7.0661f)
                close()
            }
        }
        .build()
        return `_genderless-fill`!!
    }

private var `_genderless-fill`: ImageVector? = null
