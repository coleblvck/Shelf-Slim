package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-height-line`: ImageVector
    get() {
        if (`_expand-height-line` != null) {
            return `_expand-height-line`!!
        }
        `_expand-height-line` = Builder(name = "Expand-height-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.9497f, 9.4497f)
                lineTo(12.0f, 4.5f)
                lineTo(7.0527f, 9.4473f)
                lineTo(8.467f, 10.8615f)
                lineTo(11.0f, 8.3284f)
                verticalLineTo(15.6706f)
                lineTo(8.465f, 13.1356f)
                lineTo(7.0508f, 14.5498f)
                lineTo(12.0f, 19.5f)
                lineTo(16.9497f, 14.5503f)
                lineTo(15.5355f, 13.136f)
                lineTo(13.0f, 15.6716f)
                verticalLineTo(8.3284f)
                lineTo(15.5355f, 10.864f)
                lineTo(16.9497f, 9.4497f)
                close()
                moveTo(18.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_expand-height-line`!!
    }

private var `_expand-height-line`: ImageVector? = null
