package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Microsoft-fill`: ImageVector
    get() {
        if (`_microsoft-fill` != null) {
            return `_microsoft-fill`!!
        }
        `_microsoft-fill` = Builder(name = "Microsoft-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.501f, 3.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(3.001f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.501f)
                close()
                moveTo(11.501f, 21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(12.5f)
                horizontalLineTo(11.501f)
                verticalLineTo(21.0f)
                close()
                moveTo(12.501f, 3.0f)
                horizontalLineTo(21.001f)
                verticalLineTo(11.5f)
                horizontalLineTo(12.501f)
                verticalLineTo(3.0f)
                close()
                moveTo(21.001f, 12.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.501f)
                verticalLineTo(12.5f)
                horizontalLineTo(21.001f)
                close()
            }
        }
        .build()
        return `_microsoft-fill`!!
    }

private var `_microsoft-fill`: ImageVector? = null
