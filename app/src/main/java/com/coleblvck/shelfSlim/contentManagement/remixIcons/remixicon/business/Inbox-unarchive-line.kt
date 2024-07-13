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

public val BusinessGroup.`Inbox-unarchive-line`: ImageVector
    get() {
        if (`_inbox-unarchive-line` != null) {
            return `_inbox-unarchive-line`!!
        }
        `_inbox-unarchive-line` = Builder(name = "Inbox-unarchive-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(22.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(7.0035f)
                lineTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 10.0f)
                close()
                moveTo(18.764f, 5.0f)
                horizontalLineTo(5.236f)
                lineTo(4.237f, 7.0f)
                horizontalLineTo(19.764f)
                lineTo(18.764f, 5.0f)
                close()
            }
        }
        .build()
        return `_inbox-unarchive-line`!!
    }

private var `_inbox-unarchive-line`: ImageVector? = null
