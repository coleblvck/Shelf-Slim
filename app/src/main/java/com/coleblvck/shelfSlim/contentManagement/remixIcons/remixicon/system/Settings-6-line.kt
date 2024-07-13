package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Settings-6-line`: ImageVector
    get() {
        if (`_settings-6-line` != null) {
            return `_settings-6-line`!!
        }
        `_settings-6-line` = Builder(name = "Settings-6-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.4736f)
                lineTo(23.0f, 11.9999f)
                lineTo(17.5f, 21.5262f)
                horizontalLineTo(6.5f)
                lineTo(1.0f, 11.9999f)
                lineTo(6.5f, 2.4736f)
                horizontalLineTo(17.5f)
                close()
                moveTo(16.3453f, 4.4736f)
                horizontalLineTo(7.6547f)
                lineTo(3.3094f, 11.9999f)
                lineTo(7.6547f, 19.5262f)
                horizontalLineTo(16.3453f)
                lineTo(20.6906f, 11.9999f)
                lineTo(16.3453f, 4.4736f)
                close()
                moveTo(8.634f, 8.1698f)
                lineTo(10.366f, 7.1698f)
                lineTo(15.366f, 15.83f)
                lineTo(13.634f, 16.83f)
                lineTo(8.634f, 8.1698f)
                close()
            }
        }
        .build()
        return `_settings-6-line`!!
    }

private var `_settings-6-line`: ImageVector? = null
