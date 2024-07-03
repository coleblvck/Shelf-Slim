package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Movie-2-fill`: ImageVector
    get() {
        if (`_movie-2-fill` != null) {
            return `_movie-2-fill`!!
        }
        `_movie-2-fill` = Builder(name = "Movie-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.001f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 15.2712f, 20.4293f, 18.1755f, 18.001f, 20.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8954f, 13.1046f, 6.0f, 12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
                curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(9.1046f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 9.1046f, 10.0f, 8.0f, 10.0f)
                curveTo(6.8954f, 10.0f, 6.0f, 10.8954f, 6.0f, 12.0f)
                curveTo(6.0f, 13.1046f, 6.8954f, 14.0f, 8.0f, 14.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(17.1046f, 14.0f, 18.0f, 13.1046f, 18.0f, 12.0f)
                curveTo(18.0f, 10.8954f, 17.1046f, 10.0f, 16.0f, 10.0f)
                curveTo(14.8954f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 14.8954f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.1046f, 18.0f, 14.0f, 17.1046f, 14.0f, 16.0f)
                curveTo(14.0f, 14.8954f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 14.8954f, 10.0f, 16.0f)
                curveTo(10.0f, 17.1046f, 10.8954f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_movie-2-fill`!!
    }

private var `_movie-2-fill`: ImageVector? = null