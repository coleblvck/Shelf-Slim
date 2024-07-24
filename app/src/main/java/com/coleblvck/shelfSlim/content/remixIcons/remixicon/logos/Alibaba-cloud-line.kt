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

public val LogosGroup.`Alibaba-cloud-line`: ImageVector
    get() {
        if (`_alibaba-cloud-line` != null) {
            return `_alibaba-cloud-line`!!
        }
        `_alibaba-cloud-line` = Builder(name = "Alibaba-cloud-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveTo(2.7909f, 5.0f, 1.0f, 6.7909f, 1.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 17.2091f, 2.7909f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(9.0f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 17.0f, 3.0f, 16.1046f, 3.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 7.8954f, 3.8954f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(8.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 7.0f, 21.0f, 7.8954f, 21.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 16.1046f, 20.1046f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(16.0f)
                lineTo(15.0f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 19.0f, 23.0f, 17.2091f, 23.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(23.0f, 6.7909f, 21.2091f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(15.0f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_alibaba-cloud-line`!!
    }

private var `_alibaba-cloud-line`: ImageVector? = null
