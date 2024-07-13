package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Equalizer-fill`: ImageVector
    get() {
        if (`_equalizer-fill` != null) {
            return `_equalizer-fill`!!
        }
        `_equalizer-fill` = Builder(name = "Equalizer-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1707f, 18.0f)
                curveTo(6.5825f, 16.8348f, 7.6938f, 16.0f, 9.0f, 16.0f)
                curveTo(10.3062f, 16.0f, 11.4175f, 16.8348f, 11.8293f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.8293f)
                curveTo(11.4175f, 21.1652f, 10.3062f, 22.0f, 9.0f, 22.0f)
                curveTo(7.6938f, 22.0f, 6.5825f, 21.1652f, 6.1707f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.1707f)
                close()
                moveTo(12.1707f, 11.0f)
                curveTo(12.5825f, 9.8348f, 13.6938f, 9.0f, 15.0f, 9.0f)
                curveTo(16.3062f, 9.0f, 17.4175f, 9.8348f, 17.8293f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.8293f)
                curveTo(17.4175f, 14.1652f, 16.3062f, 15.0f, 15.0f, 15.0f)
                curveTo(13.6938f, 15.0f, 12.5825f, 14.1652f, 12.1707f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.1707f)
                close()
                moveTo(6.1707f, 4.0f)
                curveTo(6.5825f, 2.8348f, 7.6938f, 2.0f, 9.0f, 2.0f)
                curveTo(10.3062f, 2.0f, 11.4175f, 2.8348f, 11.8293f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.8293f)
                curveTo(11.4175f, 7.1652f, 10.3062f, 8.0f, 9.0f, 8.0f)
                curveTo(7.6938f, 8.0f, 6.5825f, 7.1652f, 6.1707f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.1707f)
                close()
            }
        }
        .build()
        return `_equalizer-fill`!!
    }

private var `_equalizer-fill`: ImageVector? = null