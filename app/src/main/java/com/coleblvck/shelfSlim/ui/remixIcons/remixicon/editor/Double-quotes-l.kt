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

public val EditorGroup.`Double-quotes-l`: ImageVector
    get() {
        if (`_double-quotes-l` != null) {
            return `_double-quotes-l`!!
        }
        `_double-quotes-l` = Builder(name = "Double-quotes-l", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5834f, 17.3211f)
                curveTo(3.5532f, 16.2274f, 3.0f, 15.0f, 3.0f, 13.0103f)
                curveTo(3.0f, 9.5109f, 5.4565f, 6.3737f, 9.0306f, 4.8232f)
                lineTo(9.9233f, 6.2008f)
                curveTo(6.588f, 8.0054f, 5.9362f, 10.346f, 5.6756f, 11.822f)
                curveTo(6.2126f, 11.5443f, 6.9156f, 11.4466f, 7.6047f, 11.5105f)
                curveTo(9.4091f, 11.6778f, 10.8312f, 13.159f, 10.8312f, 15.0f)
                curveTo(10.8312f, 16.933f, 9.2642f, 18.5f, 7.3312f, 18.5f)
                curveTo(6.2581f, 18.5f, 5.232f, 18.0095f, 4.5834f, 17.3211f)
                close()
                moveTo(14.5834f, 17.3211f)
                curveTo(13.5532f, 16.2274f, 13.0f, 15.0f, 13.0f, 13.0103f)
                curveTo(13.0f, 9.5109f, 15.4565f, 6.3737f, 19.0306f, 4.8232f)
                lineTo(19.9233f, 6.2008f)
                curveTo(16.588f, 8.0054f, 15.9362f, 10.346f, 15.6756f, 11.822f)
                curveTo(16.2126f, 11.5443f, 16.9156f, 11.4466f, 17.6047f, 11.5105f)
                curveTo(19.4091f, 11.6778f, 20.8312f, 13.159f, 20.8312f, 15.0f)
                curveTo(20.8312f, 16.933f, 19.2642f, 18.5f, 17.3312f, 18.5f)
                curveTo(16.2581f, 18.5f, 15.232f, 18.0095f, 14.5834f, 17.3211f)
                close()
            }
        }
        .build()
        return `_double-quotes-l`!!
    }

private var `_double-quotes-l`: ImageVector? = null
