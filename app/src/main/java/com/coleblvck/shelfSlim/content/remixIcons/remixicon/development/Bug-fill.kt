package com.coleblvck.shelfSlim.content.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Bug-fill`: ImageVector
    get() {
        if (`_bug-fill` != null) {
            return `_bug-fill`!!
        }
        `_bug-fill` = Builder(name = "Bug-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0564f, 8.3005f)
                curveTo(6.1199f, 8.1985f, 6.1861f, 8.0983f, 6.2547f, 8.0f)
                horizontalLineTo(17.7453f)
                curveTo(17.8139f, 8.0983f, 17.88f, 8.1985f, 17.9436f, 8.3005f)
                lineTo(19.9641f, 7.134f)
                lineTo(20.9641f, 8.866f)
                lineTo(18.7512f, 10.1436f)
                curveTo(18.9134f, 10.7348f, 19.0f, 11.3573f, 19.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 15.9534f, 18.8094f, 16.8623f, 18.4642f, 17.6907f)
                lineTo(20.9641f, 19.134f)
                lineTo(19.9641f, 20.866f)
                lineTo(17.4383f, 19.4077f)
                curveTo(16.3533f, 20.7447f, 14.7853f, 21.6737f, 13.0f, 21.9291f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.9291f)
                curveTo(9.2147f, 21.6737f, 7.6466f, 20.7447f, 6.5617f, 19.4077f)
                lineTo(4.0359f, 20.866f)
                lineTo(3.0359f, 19.134f)
                lineTo(5.5358f, 17.6907f)
                curveTo(5.1906f, 16.8623f, 5.0f, 15.9534f, 5.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 11.3573f, 5.0866f, 10.7348f, 5.2488f, 10.1436f)
                lineTo(3.0359f, 8.866f)
                lineTo(4.0359f, 7.134f)
                lineTo(6.0564f, 8.3005f)
                close()
                moveTo(8.0f, 6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_bug-fill`!!
    }

private var `_bug-fill`: ImageVector? = null
