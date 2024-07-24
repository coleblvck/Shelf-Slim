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

public val SystemGroup.`Share-forward-box-line`: ImageVector
    get() {
        if (`_share-forward-box-line` != null) {
            return `_share-forward-box-line`!!
        }
        `_share-forward-box-line` = Builder(name = "Share-forward-box-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.9997f)
                verticalLineTo(4.9997f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.9997f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.9997f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.9997f)
                curveTo(22.0f, 20.552f, 21.5523f, 20.9997f, 21.0f, 20.9997f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 20.9997f, 2.0f, 20.552f, 2.0f, 19.9997f)
                verticalLineTo(3.9997f)
                curveTo(2.0f, 3.4474f, 2.4477f, 2.9997f, 3.0f, 2.9997f)
                horizontalLineTo(9.0f)
                close()
                moveTo(18.9497f, 4.9997f)
                lineTo(16.0f, 2.05f)
                lineTo(17.4142f, 0.6357f)
                lineTo(22.7539f, 5.9754f)
                curveTo(22.9882f, 6.2098f, 22.9882f, 6.5897f, 22.7539f, 6.824f)
                curveTo(22.6414f, 6.9365f, 22.4888f, 6.9997f, 22.3296f, 6.9997f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 6.9997f, 12.0f, 7.8951f, 12.0f, 8.9997f)
                verticalLineTo(14.9997f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.9997f)
                curveTo(10.0f, 6.7906f, 11.7909f, 4.9997f, 14.0f, 4.9997f)
                horizontalLineTo(18.9497f)
                close()
            }
        }
        .build()
        return `_share-forward-box-line`!!
    }

private var `_share-forward-box-line`: ImageVector? = null
