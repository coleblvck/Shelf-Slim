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

public val SystemGroup.`Spam-line`: ImageVector
    get() {
        if (`_spam-line` != null) {
            return `_spam-line`!!
        }
        `_spam-line` = Builder(name = "Spam-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.5f)
                lineTo(23.0f, 12.0f)
                lineTo(17.5f, 21.5f)
                horizontalLineTo(6.5f)
                lineTo(1.0f, 12.0f)
                lineTo(6.5f, 2.5f)
                horizontalLineTo(17.5f)
                close()
                moveTo(16.3469f, 4.5f)
                horizontalLineTo(7.6531f)
                lineTo(3.311f, 12.0f)
                lineTo(7.6531f, 19.5f)
                horizontalLineTo(16.3469f)
                lineTo(20.689f, 12.0f)
                lineTo(16.3469f, 4.5f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_spam-line`!!
    }

private var `_spam-line`: ImageVector? = null
