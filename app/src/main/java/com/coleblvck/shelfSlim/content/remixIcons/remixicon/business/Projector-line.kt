package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Projector-line`: ImageVector
    get() {
        if (`_projector-line` != null) {
            return `_projector-line`!!
        }
        `_projector-line` = Builder(name = "Projector-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(11.126f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.874f)
                curveTo(18.4299f, 13.7252f, 16.8638f, 15.0f, 15.0f, 15.0f)
                curveTo(13.1362f, 15.0f, 11.5701f, 13.7252f, 11.126f, 12.0f)
                close()
                moveTo(11.126f, 10.0f)
                curveTo(11.5701f, 8.2748f, 13.1362f, 7.0f, 15.0f, 7.0f)
                curveTo(16.8638f, 7.0f, 18.4299f, 8.2748f, 18.874f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.126f)
                close()
                moveTo(15.0f, 13.0f)
                curveTo(16.1046f, 13.0f, 17.0f, 12.1046f, 17.0f, 11.0f)
                curveTo(17.0f, 9.8954f, 16.1046f, 9.0f, 15.0f, 9.0f)
                curveTo(13.8954f, 9.0f, 13.0f, 9.8954f, 13.0f, 11.0f)
                curveTo(13.0f, 12.1046f, 13.8954f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_projector-line`!!
    }

private var `_projector-line`: ImageVector? = null
