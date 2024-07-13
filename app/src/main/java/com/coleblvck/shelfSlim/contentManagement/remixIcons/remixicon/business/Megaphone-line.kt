package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Megaphone-line`: ImageVector
    get() {
        if (`_megaphone-line` != null) {
            return `_megaphone-line`!!
        }
        `_megaphone-line` = Builder(name = "Megaphone-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                curveTo(9.0f, 17.0f, 16.0f, 18.0f, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(13.937f)
                curveTo(21.8626f, 13.715f, 22.5f, 12.9319f, 22.5f, 12.0f)
                curveTo(22.5f, 11.0681f, 21.8626f, 10.285f, 21.0f, 10.063f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(16.0f, 6.0f, 9.0f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 7.0f, 3.0f, 7.8954f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.1046f, 3.8954f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(11.0f, 8.6612f)
                curveTo(11.6833f, 8.5146f, 12.5275f, 8.3119f, 13.4393f, 8.0437f)
                curveTo(15.1175f, 7.5501f, 17.25f, 6.7726f, 19.0f, 5.5746f)
                verticalLineTo(18.4254f)
                curveTo(17.25f, 17.2274f, 15.1175f, 16.4499f, 13.4393f, 15.9563f)
                curveTo(12.5275f, 15.6881f, 11.6833f, 15.4854f, 11.0f, 15.3388f)
                verticalLineTo(8.6612f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_megaphone-line`!!
    }

private var `_megaphone-line`: ImageVector? = null
