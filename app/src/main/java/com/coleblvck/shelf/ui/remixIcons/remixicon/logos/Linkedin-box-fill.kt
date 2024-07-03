package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Linkedin-box-fill`: ImageVector
    get() {
        if (`_linkedin-box-fill` != null) {
            return `_linkedin-box-fill`!!
        }
        `_linkedin-box-fill` = Builder(name = "Linkedin-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3362f, 18.339f)
                horizontalLineTo(15.6707f)
                verticalLineTo(14.1622f)
                curveTo(15.6707f, 13.1662f, 15.6505f, 11.8845f, 14.2817f, 11.8845f)
                curveTo(12.892f, 11.8845f, 12.6797f, 12.9683f, 12.6797f, 14.0887f)
                verticalLineTo(18.339f)
                horizontalLineTo(10.0142f)
                verticalLineTo(9.75f)
                horizontalLineTo(12.5747f)
                verticalLineTo(10.9207f)
                horizontalLineTo(12.6092f)
                curveTo(12.967f, 10.2457f, 13.837f, 9.5332f, 15.1367f, 9.5332f)
                curveTo(17.8375f, 9.5332f, 18.337f, 11.3108f, 18.337f, 13.6245f)
                verticalLineTo(18.339f)
                horizontalLineTo(18.3362f)
                close()
                moveTo(7.0037f, 8.5747f)
                curveTo(6.1457f, 8.5747f, 5.4565f, 7.8802f, 5.4565f, 7.026f)
                curveTo(5.4565f, 6.1725f, 6.1465f, 5.4788f, 7.0037f, 5.4788f)
                curveTo(7.8587f, 5.4788f, 8.5517f, 6.1725f, 8.5517f, 7.026f)
                curveTo(8.5517f, 7.8802f, 7.858f, 8.5747f, 7.0037f, 8.5747f)
                close()
                moveTo(8.3402f, 18.339f)
                horizontalLineTo(5.6672f)
                verticalLineTo(9.75f)
                horizontalLineTo(8.3402f)
                verticalLineTo(18.339f)
                close()
                moveTo(19.6697f, 3.0f)
                horizontalLineTo(4.3292f)
                curveTo(3.595f, 3.0f, 3.001f, 3.5805f, 3.001f, 4.2968f)
                verticalLineTo(19.7033f)
                curveTo(3.001f, 20.4202f, 3.595f, 21.0f, 4.3292f, 21.0f)
                horizontalLineTo(19.6675f)
                curveTo(20.401f, 21.0f, 21.001f, 20.4202f, 21.001f, 19.7033f)
                verticalLineTo(4.2968f)
                curveTo(21.001f, 3.5805f, 20.401f, 3.0f, 19.6675f, 3.0f)
                horizontalLineTo(19.6697f)
                close()
            }
        }
        .build()
        return `_linkedin-box-fill`!!
    }

private var `_linkedin-box-fill`: ImageVector? = null
