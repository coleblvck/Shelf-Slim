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

public val UserGroup.`Genderless-line`: ImageVector
    get() {
        if (`_genderless-line` != null) {
            return `_genderless-line`!!
        }
        `_genderless-line` = Builder(name = "Genderless-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0661f)
                curveTo(16.6694f, 7.555f, 19.5f, 10.6969f, 19.5f, 14.5f)
                curveTo(19.5f, 18.6421f, 16.1421f, 22.0f, 12.0f, 22.0f)
                curveTo(7.8579f, 22.0f, 4.5f, 18.6421f, 4.5f, 14.5f)
                curveTo(4.5f, 10.6969f, 7.3306f, 7.555f, 11.0f, 7.0661f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0661f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(15.0376f, 20.0f, 17.5f, 17.5376f, 17.5f, 14.5f)
                curveTo(17.5f, 11.4624f, 15.0376f, 9.0f, 12.0f, 9.0f)
                curveTo(8.9624f, 9.0f, 6.5f, 11.4624f, 6.5f, 14.5f)
                curveTo(6.5f, 17.5376f, 8.9624f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_genderless-line`!!
    }

private var `_genderless-line`: ImageVector? = null
