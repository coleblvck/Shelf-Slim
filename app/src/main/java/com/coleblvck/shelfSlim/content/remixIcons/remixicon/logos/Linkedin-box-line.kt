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

public val LogosGroup.`Linkedin-box-line`: ImageVector
    get() {
        if (`_linkedin-box-line` != null) {
            return `_linkedin-box-line`!!
        }
        `_linkedin-box-line` = Builder(name = "Linkedin-box-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.001f, 3.0f)
                horizontalLineTo(20.001f)
                curveTo(20.5533f, 3.0f, 21.001f, 3.4477f, 21.001f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.001f, 20.5523f, 20.5533f, 21.0f, 20.001f, 21.0f)
                horizontalLineTo(4.001f)
                curveTo(3.4487f, 21.0f, 3.001f, 20.5523f, 3.001f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.001f, 3.4477f, 3.4487f, 3.0f, 4.001f, 3.0f)
                close()
                moveTo(5.001f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.001f)
                close()
                moveTo(7.501f, 9.0f)
                curveTo(6.6726f, 9.0f, 6.001f, 8.3284f, 6.001f, 7.5f)
                curveTo(6.001f, 6.6716f, 6.6726f, 6.0f, 7.501f, 6.0f)
                curveTo(8.3294f, 6.0f, 9.001f, 6.6716f, 9.001f, 7.5f)
                curveTo(9.001f, 8.3284f, 8.3294f, 9.0f, 7.501f, 9.0f)
                close()
                moveTo(6.501f, 10.0f)
                horizontalLineTo(8.501f)
                verticalLineTo(17.5f)
                horizontalLineTo(6.501f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.001f, 10.4295f)
                curveTo(12.5854f, 9.8653f, 13.2665f, 9.5f, 14.001f, 9.5f)
                curveTo(16.072f, 9.5f, 17.501f, 11.1789f, 17.501f, 13.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.501f)
                verticalLineTo(13.25f)
                curveTo(15.501f, 12.2835f, 14.7175f, 11.5f, 13.751f, 11.5f)
                curveTo(12.7845f, 11.5f, 12.001f, 12.2835f, 12.001f, 13.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(10.001f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.001f)
                verticalLineTo(10.4295f)
                close()
            }
        }
        .build()
        return `_linkedin-box-line`!!
    }

private var `_linkedin-box-line`: ImageVector? = null
