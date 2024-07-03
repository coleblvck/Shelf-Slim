package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Single-quotes-l`: ImageVector
    get() {
        if (`_single-quotes-l` != null) {
            return `_single-quotes-l`!!
        }
        `_single-quotes-l` = Builder(name = "Single-quotes-l", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5834f, 17.3211f)
                curveTo(8.5532f, 16.2274f, 8.0f, 15.0f, 8.0f, 13.0103f)
                curveTo(8.0f, 9.5109f, 10.4565f, 6.3737f, 14.0306f, 4.8232f)
                lineTo(14.9233f, 6.2008f)
                curveTo(11.588f, 8.0054f, 10.9362f, 10.346f, 10.6756f, 11.822f)
                curveTo(11.2126f, 11.5443f, 11.9156f, 11.4466f, 12.6047f, 11.5105f)
                curveTo(14.4091f, 11.6778f, 15.8312f, 13.159f, 15.8312f, 15.0f)
                curveTo(15.8312f, 16.933f, 14.2642f, 18.5f, 12.3312f, 18.5f)
                curveTo(11.2581f, 18.5f, 10.232f, 18.0095f, 9.5834f, 17.3211f)
                close()
            }
        }
        .build()
        return `_single-quotes-l`!!
    }

private var `_single-quotes-l`: ImageVector? = null
