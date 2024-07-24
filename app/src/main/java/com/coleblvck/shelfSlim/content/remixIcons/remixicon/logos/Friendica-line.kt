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

public val LogosGroup.`Friendica-line`: ImageVector
    get() {
        if (`_friendica-line` != null) {
            return `_friendica-line`!!
        }
        `_friendica-line` = Builder(name = "Friendica-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 20.0f, 20.0f, 19.1046f, 20.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.8954f, 19.1046f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 4.0f, 4.0f, 4.8954f, 4.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.1046f, 4.8954f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 3.7909f, 3.7909f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 2.0f, 22.0f, 3.7909f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 20.2091f, 20.2091f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 22.0f, 2.0f, 20.2091f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_friendica-line`!!
    }

private var `_friendica-line`: ImageVector? = null
