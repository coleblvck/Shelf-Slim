package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Find-replace-line`: ImageVector
    get() {
        if (`_find-replace-line` != null) {
            return `_find-replace-line`!!
        }
        `_find-replace-line` = Builder(name = "Find-replace-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0326f, 16.6184f)
                lineTo(22.3137f, 20.8995f)
                lineTo(20.8995f, 22.3137f)
                lineTo(16.6184f, 18.0326f)
                curveTo(15.0789f, 19.2639f, 13.1258f, 20.0f, 11.0f, 20.0f)
                curveTo(7.4646f, 20.0f, 4.4068f, 17.964f, 2.9348f, 15.0f)
                horizontalLineTo(6.0f)
                horizontalLineTo(9.0f)
                lineTo(7.696f, 17.1734f)
                curveTo(8.68f, 17.7009f, 9.8049f, 18.0f, 11.0f, 18.0f)
                curveTo(12.8956f, 18.0f, 14.6146f, 17.2475f, 15.8748f, 16.0247f)
                lineTo(16.0247f, 15.8748f)
                curveTo(17.2475f, 14.6146f, 18.0f, 12.8956f, 18.0f, 11.0f)
                curveTo(18.0f, 10.305f, 17.8988f, 9.6336f, 17.7104f, 9.0f)
                horizontalLineTo(19.7772f)
                curveTo(19.923f, 9.6432f, 20.0f, 10.3126f, 20.0f, 11.0f)
                curveTo(20.0f, 13.1258f, 19.2639f, 15.0789f, 18.0326f, 16.6184f)
                close()
                moveTo(19.0652f, 7.0f)
                horizontalLineTo(13.0f)
                lineTo(14.304f, 4.8266f)
                curveTo(13.32f, 4.2991f, 12.1951f, 4.0f, 11.0f, 4.0f)
                curveTo(7.1325f, 4.0f, 4.0f, 7.1325f, 4.0f, 11.0f)
                curveTo(4.0f, 11.695f, 4.1012f, 12.3663f, 4.2896f, 13.0f)
                horizontalLineTo(2.2228f)
                curveTo(2.077f, 12.3568f, 2.0f, 11.6874f, 2.0f, 11.0f)
                curveTo(2.0f, 6.0275f, 6.0275f, 2.0f, 11.0f, 2.0f)
                curveTo(14.5354f, 2.0f, 17.5932f, 4.036f, 19.0652f, 7.0f)
                close()
            }
        }
        .build()
        return `_find-replace-line`!!
    }

private var `_find-replace-line`: ImageVector? = null
