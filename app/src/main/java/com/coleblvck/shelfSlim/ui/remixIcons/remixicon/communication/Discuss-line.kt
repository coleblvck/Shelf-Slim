package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Discuss-line`: ImageVector
    get() {
        if (`_discuss-line` != null) {
            return `_discuss-line`!!
        }
        `_discuss-line` = Builder(name = "Discuss-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.5f)
                lineTo(11.2f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(7.1026f)
                curveTo(5.0f, 6.5503f, 5.4477f, 6.1026f, 6.0f, 6.1026f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 6.1026f, 23.0f, 6.5503f, 23.0f, 7.1026f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.5523f, 22.5523f, 19.0f, 22.0f, 19.0f)
                horizontalLineTo(16.8f)
                lineTo(14.0f, 22.5f)
                close()
                moveTo(15.8387f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.1026f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.2f)
                horizontalLineTo(12.1613f)
                lineTo(14.0f, 19.2984f)
                lineTo(15.8387f, 17.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.0f)
                curveTo(1.0f, 2.4477f, 1.4477f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_discuss-line`!!
    }

private var `_discuss-line`: ImageVector? = null
