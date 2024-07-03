package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Home-line`: ImageVector
    get() {
        if (`_home-line` != null) {
            return `_home-line`!!
        }
        `_home-line` = Builder(name = "Home-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(9.4891f)
                curveTo(3.0f, 9.1805f, 3.1425f, 8.8892f, 3.3861f, 8.6997f)
                lineTo(11.3861f, 2.4775f)
                curveTo(11.7472f, 2.1966f, 12.2528f, 2.1966f, 12.6139f, 2.4775f)
                lineTo(20.6139f, 8.6997f)
                curveTo(20.8575f, 8.8892f, 21.0f, 9.1805f, 21.0f, 9.4891f)
                verticalLineTo(20.0f)
                close()
                moveTo(19.0f, 19.0f)
                verticalLineTo(9.9782f)
                lineTo(12.0f, 4.5337f)
                lineTo(5.0f, 9.9782f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_home-line`!!
    }

private var `_home-line`: ImageVector? = null
