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

public val LogosGroup.`Tumblr-fill`: ImageVector
    get() {
        if (`_tumblr-fill` != null) {
            return `_tumblr-fill`!!
        }
        `_tumblr-fill` = Builder(name = "Tumblr-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2705f, 7.6298f)
                curveTo(8.8683f, 7.0731f, 10.816f, 4.764f, 10.816f, 2.0f)
                horizontalLineTo(13.8463f)
                verticalLineTo(7.1515f)
                horizontalLineTo(17.4826f)
                verticalLineTo(10.7879f)
                horizontalLineTo(13.8463f)
                verticalLineTo(16.2424f)
                curveTo(13.8463f, 16.7566f, 14.044f, 17.4493f, 14.7554f, 17.9091f)
                curveTo(15.2296f, 18.2156f, 16.2397f, 18.3671f, 17.7857f, 18.3636f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.5432f)
                curveTo(11.0329f, 22.0f, 8.9978f, 19.9649f, 8.9978f, 17.4545f)
                verticalLineTo(10.7879f)
                horizontalLineTo(6.2705f)
                verticalLineTo(7.6298f)
                close()
            }
        }
        .build()
        return `_tumblr-fill`!!
    }

private var `_tumblr-fill`: ImageVector? = null
