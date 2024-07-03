package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Kick-fill`: ImageVector
    get() {
        if (`_kick-fill` != null) {
            return `_kick-fill`!!
        }
        `_kick-fill` = Builder(name = "Kick-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.5637f, 5.5361f)
                horizontalLineTo(6.2545f)
                verticalLineTo(18.4635f)
                horizontalLineTo(10.5637f)
                verticalLineTo(15.5907f)
                horizontalLineTo(12.0001f)
                verticalLineTo(17.0271f)
                horizontalLineTo(13.4364f)
                verticalLineTo(18.4635f)
                horizontalLineTo(17.7455f)
                verticalLineTo(14.1543f)
                horizontalLineTo(16.3091f)
                verticalLineTo(12.7179f)
                horizontalLineTo(14.8728f)
                verticalLineTo(11.2816f)
                horizontalLineTo(16.3091f)
                verticalLineTo(9.8452f)
                horizontalLineTo(17.7455f)
                verticalLineTo(5.5361f)
                horizontalLineTo(13.4364f)
                verticalLineTo(6.9725f)
                horizontalLineTo(12.0001f)
                verticalLineTo(8.4088f)
                horizontalLineTo(10.5637f)
                verticalLineTo(5.5361f)
                close()
            }
        }
        .build()
        return `_kick-fill`!!
    }

private var `_kick-fill`: ImageVector? = null
