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

public val BusinessGroup.`Inbox-2-fill`: ImageVector
    get() {
        if (`_inbox-2-fill` != null) {
            return `_inbox-2-fill`!!
        }
        `_inbox-2-fill` = Builder(name = "Inbox-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(4.5313f, 3.0f, 4.1255f, 3.3255f, 4.0238f, 3.7831f)
                lineTo(2.0238f, 12.7831f)
                curveTo(2.008f, 12.8543f, 2.0f, 12.927f, 2.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 12.927f, 21.992f, 12.8543f, 21.9762f, 12.7831f)
                lineTo(19.9762f, 3.7831f)
                curveTo(19.8745f, 3.3255f, 19.4687f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.7534f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                horizontalLineTo(4.2466f)
                lineTo(5.8022f, 5.0f)
                horizontalLineTo(18.1978f)
                lineTo(19.7534f, 12.0f)
                close()
            }
        }
        .build()
        return `_inbox-2-fill`!!
    }

private var `_inbox-2-fill`: ImageVector? = null
