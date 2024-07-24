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

public val SystemGroup.`Shield-check-line`: ImageVector
    get() {
        if (`_shield-check-line` != null) {
            return `_shield-check-line`!!
        }
        `_shield-check-line` = Builder(name = "Shield-check-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(20.2169f, 2.826f)
                curveTo(20.6745f, 2.9277f, 21.0f, 3.3335f, 21.0f, 3.8022f)
                verticalLineTo(13.7889f)
                curveTo(21.0f, 15.795f, 19.9974f, 17.6684f, 18.3282f, 18.7812f)
                lineTo(12.0f, 23.0f)
                lineTo(5.6718f, 18.7812f)
                curveTo(4.0026f, 17.6684f, 3.0f, 15.795f, 3.0f, 13.7889f)
                verticalLineTo(3.8022f)
                curveTo(3.0f, 3.3335f, 3.3255f, 2.9277f, 3.7831f, 2.826f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.0488f)
                lineTo(5.0f, 4.6043f)
                verticalLineTo(13.7889f)
                curveTo(5.0f, 15.1263f, 5.6684f, 16.3752f, 6.7812f, 17.1171f)
                lineTo(12.0f, 20.5963f)
                lineTo(17.2188f, 17.1171f)
                curveTo(18.3316f, 16.3752f, 19.0f, 15.1263f, 19.0f, 13.7889f)
                verticalLineTo(4.6043f)
                lineTo(12.0f, 3.0488f)
                close()
                moveTo(16.4524f, 8.2218f)
                lineTo(17.8666f, 9.636f)
                lineTo(11.5026f, 16.0f)
                lineTo(7.26f, 11.7574f)
                lineTo(8.6742f, 10.3431f)
                lineTo(11.5019f, 13.1709f)
                lineTo(16.4524f, 8.2218f)
                close()
            }
        }
        .build()
        return `_shield-check-line`!!
    }

private var `_shield-check-line`: ImageVector? = null
