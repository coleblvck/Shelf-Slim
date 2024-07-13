package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Google-line`: ImageVector
    get() {
        if (`_google-line` != null) {
            return `_google-line`!!
        }
        `_google-line` = Builder(name = "Google-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                horizontalLineTo(20.5329f)
                curveTo(20.5769f, 11.3847f, 20.6f, 11.7792f, 20.6f, 12.1837f)
                curveTo(20.6f, 14.9184f, 19.6204f, 17.2204f, 17.9224f, 18.7837f)
                curveTo(16.4367f, 20.1551f, 14.404f, 20.9592f, 11.9796f, 20.9592f)
                curveTo(8.4693f, 20.9592f, 5.4327f, 18.947f, 3.9551f, 16.0123f)
                curveTo(3.347f, 14.8f, 3.0f, 13.4286f, 3.0f, 11.9796f)
                curveTo(3.0f, 10.5306f, 3.347f, 9.1592f, 3.9551f, 7.947f)
                curveTo(5.4327f, 5.0123f, 8.4693f, 3.0f, 11.9796f, 3.0f)
                curveTo(14.4f, 3.0f, 16.4326f, 3.8898f, 17.9877f, 5.3388f)
                lineTo(16.5255f, 6.801f)
                curveTo(15.3682f, 5.6815f, 13.8028f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(15.5265f, 19.0f, 18.1443f, 16.3923f, 18.577f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_google-line`!!
    }

private var `_google-line`: ImageVector? = null
