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

public val LogosGroup.`Blogger-fill`: ImageVector
    get() {
        if (`_blogger-fill` != null) {
            return `_blogger-fill`!!
        }
        `_blogger-fill` = Builder(name = "Blogger-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8224f, 9.7287f)
                horizontalLineTo(18.729f)
                curveTo(18.1402f, 9.7287f, 17.6355f, 9.224f, 17.6355f, 8.6352f)
                curveTo(17.6355f, 5.5231f, 15.1121f, 2.9997f, 12.0f, 2.9997f)
                horizontalLineTo(8.6355f)
                curveTo(5.5234f, 2.9997f, 3.0f, 5.5231f, 3.0f, 8.6352f)
                verticalLineTo(15.3642f)
                curveTo(3.0f, 18.4763f, 5.5234f, 20.9997f, 8.6355f, 20.9997f)
                horizontalLineTo(15.3645f)
                curveTo(18.4766f, 20.9997f, 21.0f, 18.4763f, 21.0f, 15.3642f)
                verticalLineTo(10.9062f)
                curveTo(21.0f, 10.2333f, 20.4953f, 9.7287f, 19.8224f, 9.7287f)
                close()
                moveTo(8.5514f, 7.5417f)
                horizontalLineTo(12.5888f)
                curveTo(13.1776f, 7.5417f, 13.6822f, 8.0464f, 13.6822f, 8.6352f)
                curveTo(13.6822f, 9.224f, 13.1776f, 9.7287f, 12.5888f, 9.7287f)
                horizontalLineTo(8.5514f)
                curveTo(7.9626f, 9.7287f, 7.4579f, 9.224f, 7.4579f, 8.6352f)
                curveTo(7.4579f, 8.0464f, 7.9626f, 7.5417f, 8.5514f, 7.5417f)
                close()
                moveTo(15.4486f, 16.4576f)
                horizontalLineTo(8.6355f)
                curveTo(8.0467f, 16.4576f, 7.5421f, 15.953f, 7.5421f, 15.3642f)
                curveTo(7.5421f, 14.7754f, 8.0467f, 14.2707f, 8.6355f, 14.2707f)
                horizontalLineTo(15.4486f)
                curveTo(16.0374f, 14.2707f, 16.5421f, 14.7754f, 16.5421f, 15.3642f)
                curveTo(16.5421f, 15.953f, 16.0374f, 16.4576f, 15.4486f, 16.4576f)
                close()
            }
        }
        .build()
        return `_blogger-fill`!!
    }

private var `_blogger-fill`: ImageVector? = null
