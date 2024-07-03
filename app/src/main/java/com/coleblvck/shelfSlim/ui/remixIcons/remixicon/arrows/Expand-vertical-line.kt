package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-vertical-line`: ImageVector
    get() {
        if (`_expand-vertical-line` != null) {
            return `_expand-vertical-line`!!
        }
        `_expand-vertical-line` = Builder(name = "Expand-vertical-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 0.4995f)
                lineTo(16.9493f, 5.4493f)
                lineTo(15.535f, 6.8635f)
                lineTo(12.9995f, 4.3279f)
                verticalLineTo(9.9995f)
                horizontalLineTo(10.9995f)
                lineTo(10.9995f, 4.3279f)
                lineTo(8.4665f, 6.861f)
                lineTo(7.0522f, 5.4468f)
                lineTo(11.9995f, 0.4995f)
                close()
                moveTo(10.9995f, 13.9995f)
                lineTo(10.9995f, 19.6704f)
                lineTo(8.4645f, 17.1353f)
                lineTo(7.0503f, 18.5496f)
                lineTo(12.0f, 23.4995f)
                lineTo(16.9497f, 18.5498f)
                lineTo(15.5355f, 17.1356f)
                lineTo(12.9995f, 19.6716f)
                verticalLineTo(13.9995f)
                horizontalLineTo(10.9995f)
                close()
            }
        }
        .build()
        return `_expand-vertical-line`!!
    }

private var `_expand-vertical-line`: ImageVector? = null