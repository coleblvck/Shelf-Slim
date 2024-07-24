package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Add-large-fill`: ImageVector
    get() {
        if (`_add-large-fill` != null) {
            return `_add-large-fill`!!
        }
        `_add-large-fill` = Builder(name = "Add-large-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0001f)
                lineTo(11.0f, 2.0005f)
                lineTo(13.0f, 2.0005f)
                lineTo(13.0f, 11.0001f)
                lineTo(22.0001f, 10.9999f)
                lineTo(22.0002f, 12.9999f)
                lineTo(13.0f, 13.0001f)
                lineTo(13.0001f, 22.0f)
                lineTo(11.0001f, 22.0f)
                lineTo(11.0001f, 13.0001f)
                lineTo(2.0f, 13.0003f)
                lineTo(2.0f, 11.0003f)
                lineTo(11.0f, 11.0001f)
                close()
            }
        }
        .build()
        return `_add-large-fill`!!
    }

private var `_add-large-fill`: ImageVector? = null
