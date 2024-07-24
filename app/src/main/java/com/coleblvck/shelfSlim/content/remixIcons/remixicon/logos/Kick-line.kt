package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Kick-line`: ImageVector
    get() {
        if (`_kick-line` != null) {
            return `_kick-line`!!
        }
        `_kick-line` = Builder(name = "Kick-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 1.9998f)
                horizontalLineTo(11.0001f)
                verticalLineTo(3.9997f)
                horizontalLineTo(13.0001f)
                verticalLineTo(1.9998f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.9997f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.9996f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.9997f)
                horizontalLineTo(13.0001f)
                verticalLineTo(19.9998f)
                horizontalLineTo(11.0001f)
                verticalLineTo(21.9997f)
                horizontalLineTo(3.0f)
                verticalLineTo(1.9998f)
                close()
                moveTo(13.0001f, 17.9998f)
                horizontalLineTo(15.0001f)
                verticalLineTo(19.9997f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.9996f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.9997f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.9997f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.9997f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.9998f)
                horizontalLineTo(15.0001f)
                verticalLineTo(5.9997f)
                horizontalLineTo(13.0001f)
                verticalLineTo(7.9997f)
                horizontalLineTo(9.0001f)
                verticalLineTo(3.9998f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.9997f)
                horizontalLineTo(9.0001f)
                verticalLineTo(15.9998f)
                horizontalLineTo(13.0001f)
                verticalLineTo(17.9998f)
                close()
            }
        }
        .build()
        return `_kick-line`!!
    }

private var `_kick-line`: ImageVector? = null
