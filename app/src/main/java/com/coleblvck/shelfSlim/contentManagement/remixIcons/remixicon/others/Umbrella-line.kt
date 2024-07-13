package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Umbrella-line`: ImageVector
    get() {
        if (`_umbrella-line` != null) {
            return `_umbrella-line`!!
        }
        `_umbrella-line` = Builder(name = "Umbrella-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 2.0494f)
                curveTo(18.0514f, 2.5511f, 21.998f, 6.8147f, 21.998f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(19.0f)
                curveTo(12.998f, 20.1046f, 13.8935f, 21.0f, 14.998f, 21.0f)
                curveTo(16.1026f, 21.0f, 16.998f, 20.1046f, 16.998f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(19.0f)
                curveTo(18.998f, 21.2091f, 17.2072f, 23.0f, 14.998f, 23.0f)
                curveTo(12.7889f, 23.0f, 10.998f, 21.2091f, 10.998f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.998f)
                verticalLineTo(12.0f)
                curveTo(1.998f, 6.8147f, 5.9447f, 2.5511f, 10.998f, 2.0494f)
                verticalLineTo(2.0f)
                curveTo(10.998f, 1.4477f, 11.4458f, 1.0f, 11.998f, 1.0f)
                curveTo(12.5503f, 1.0f, 12.998f, 1.4477f, 12.998f, 2.0f)
                verticalLineTo(2.0494f)
                close()
                moveTo(19.9362f, 11.0f)
                curveTo(19.4441f, 7.0537f, 16.0777f, 4.0f, 11.998f, 4.0f)
                curveTo(7.9184f, 4.0f, 4.552f, 7.0537f, 4.0599f, 11.0f)
                horizontalLineTo(19.9362f)
                close()
            }
        }
        .build()
        return `_umbrella-line`!!
    }

private var `_umbrella-line`: ImageVector? = null
