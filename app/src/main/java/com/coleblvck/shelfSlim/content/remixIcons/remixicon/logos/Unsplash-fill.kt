package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Unsplash-fill`: ImageVector
    get() {
        if (`_unsplash-fill` != null) {
            return `_unsplash-fill`!!
        }
        `_unsplash-fill` = Builder(name = "Unsplash-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.501f, 11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.501f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.001f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.501f)
                close()
                moveTo(15.501f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.501f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.501f)
                close()
            }
        }
        .build()
        return `_unsplash-fill`!!
    }

private var `_unsplash-fill`: ImageVector? = null