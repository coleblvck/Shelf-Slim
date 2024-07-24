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

public val EditorGroup.`Code-view`: ImageVector
    get() {
        if (`_code-view` != null) {
            return `_code-view`!!
        }
        `_code-view` = Builder(name = "Code-view", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 8.4645f)
                lineTo(18.3642f, 7.0503f)
                lineTo(23.3139f, 12.0f)
                lineTo(18.3642f, 16.9498f)
                lineTo(16.95f, 15.5355f)
                lineTo(20.4855f, 12.0f)
                lineTo(16.95f, 8.4645f)
                close()
                moveTo(7.0505f, 8.4645f)
                lineTo(3.515f, 12.0f)
                lineTo(7.0505f, 15.5355f)
                lineTo(5.6363f, 16.9498f)
                lineTo(0.6865f, 12.0f)
                lineTo(5.6363f, 7.0503f)
                lineTo(7.0505f, 8.4645f)
                close()
            }
        }
        .build()
        return `_code-view`!!
    }

private var `_code-view`: ImageVector? = null
