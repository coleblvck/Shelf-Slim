package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Number-9`: ImageVector
    get() {
        if (`_number-9` != null) {
            return `_number-9`!!
        }
        `_number-9` = Builder(name = "Number-9", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveTo(15.5899f, 1.5f, 18.5f, 4.4102f, 18.5f, 8.0f)
                curveTo(18.5f, 9.1922f, 18.179f, 10.3094f, 17.6188f, 11.27f)
                lineTo(11.423f, 21.999f)
                horizontalLineTo(9.114f)
                lineTo(13.5528f, 14.3134f)
                curveTo(13.0553f, 14.4353f, 12.5352f, 14.5f, 12.0f, 14.5f)
                curveTo(8.4101f, 14.5f, 5.5f, 11.5899f, 5.5f, 8.0f)
                curveTo(5.5f, 4.4102f, 8.4101f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(9.5147f, 3.5f, 7.5f, 5.5147f, 7.5f, 8.0f)
                curveTo(7.5f, 10.4853f, 9.5147f, 12.5f, 12.0f, 12.5f)
                curveTo(14.4853f, 12.5f, 16.5f, 10.4853f, 16.5f, 8.0f)
                curveTo(16.5f, 5.5147f, 14.4853f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return `_number-9`!!
    }

private var `_number-9`: ImageVector? = null
