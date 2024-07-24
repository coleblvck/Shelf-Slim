package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Anchor-line`: ImageVector
    get() {
        if (`_anchor-line` != null) {
            return `_anchor-line`!!
        }
        `_anchor-line` = Builder(name = "Anchor-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0494f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0619f)
                curveTo(4.5131f, 16.6187f, 7.3813f, 19.4869f, 11.0f, 19.9381f)
                verticalLineTo(9.874f)
                curveTo(9.2748f, 9.4299f, 8.0f, 7.8638f, 8.0f, 6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                curveTo(16.0f, 7.8638f, 14.7252f, 9.4299f, 13.0f, 9.874f)
                verticalLineTo(19.9381f)
                curveTo(16.6187f, 19.4869f, 19.4869f, 16.6187f, 19.9381f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.9506f)
                curveTo(21.9833f, 11.3289f, 22.0f, 11.6625f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 11.6625f, 2.0167f, 11.3289f, 2.0494f, 11.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(13.1046f, 8.0f, 14.0f, 7.1046f, 14.0f, 6.0f)
                curveTo(14.0f, 4.8954f, 13.1046f, 4.0f, 12.0f, 4.0f)
                curveTo(10.8954f, 4.0f, 10.0f, 4.8954f, 10.0f, 6.0f)
                curveTo(10.0f, 7.1046f, 10.8954f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_anchor-line`!!
    }

private var `_anchor-line`: ImageVector? = null
