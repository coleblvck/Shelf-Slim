package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Inbox-archive-fill`: ImageVector
    get() {
        if (`_inbox-archive-fill` != null) {
            return `_inbox-archive-fill`!!
        }
        `_inbox-archive-fill` = Builder(name = "Inbox-archive-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                lineTo(22.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(7.0035f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 18.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(19.7639f, 7.0f)
                lineTo(18.7639f, 5.0f)
                horizontalLineTo(5.2366f)
                lineTo(4.2374f, 7.0f)
                horizontalLineTo(19.7639f)
                close()
            }
        }
        .build()
        return `_inbox-archive-fill`!!
    }

private var `_inbox-archive-fill`: ImageVector? = null
