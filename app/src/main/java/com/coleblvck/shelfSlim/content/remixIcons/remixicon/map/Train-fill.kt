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

public val MapGroup.`Train-fill`: ImageVector
    get() {
        if (`_train-fill` != null) {
            return `_train-fill`!!
        }
        `_train-fill` = Builder(name = "Train-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 20.0f)
                lineTo(19.0f, 21.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.5f)
                lineTo(6.8f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 20.0f, 3.0f, 19.1046f, 3.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.7909f, 4.7909f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 3.0f, 21.0f, 4.7909f, 21.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.1046f, 20.1046f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(17.2f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.1046f, 18.0f, 14.0f, 17.1046f, 14.0f, 16.0f)
                curveTo(14.0f, 14.8954f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 14.8954f, 10.0f, 16.0f)
                curveTo(10.0f, 17.1046f, 10.8954f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_train-fill`!!
    }

private var `_train-fill`: ImageVector? = null
