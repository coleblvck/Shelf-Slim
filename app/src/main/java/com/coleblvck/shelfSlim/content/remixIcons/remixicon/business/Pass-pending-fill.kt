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

public val BusinessGroup.`Pass-pending-fill`: ImageVector
    get() {
        if (`_pass-pending-fill` != null) {
            return `_pass-pending-fill`!!
        }
        `_pass-pending-fill` = Builder(name = "Pass-pending-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(1.4477f, 4.0f, 1.0f, 4.4477f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.5523f, 1.4477f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 20.0f, 23.0f, 19.5523f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 4.4477f, 22.5523f, 4.0f, 22.0f, 4.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(9.0001f, 10.0f)
                curveTo(9.0001f, 9.4477f, 8.5524f, 9.0f, 8.0001f, 9.0f)
                curveTo(7.4478f, 9.0f, 7.0001f, 9.4477f, 7.0001f, 10.0f)
                curveTo(7.0001f, 10.5523f, 7.4478f, 11.0f, 8.0001f, 11.0f)
                curveTo(8.5524f, 11.0f, 9.0001f, 10.5523f, 9.0001f, 10.0f)
                close()
                moveTo(11.0001f, 10.0f)
                curveTo(11.0001f, 11.6569f, 9.6569f, 13.0f, 8.0001f, 13.0f)
                curveTo(6.3432f, 13.0f, 5.0001f, 11.6569f, 5.0001f, 10.0f)
                curveTo(5.0001f, 8.3432f, 6.3432f, 7.0f, 8.0001f, 7.0f)
                curveTo(9.6569f, 7.0f, 11.0001f, 8.3432f, 11.0001f, 10.0f)
                close()
                moveTo(5.5272f, 17.0251f)
                lineTo(4.113f, 15.6109f)
                curveTo(5.1073f, 14.6167f, 6.4836f, 14.0f, 8.0021f, 14.0f)
                curveTo(9.5206f, 14.0f, 10.897f, 14.6167f, 11.8912f, 15.6109f)
                lineTo(10.477f, 17.0251f)
                curveTo(9.8425f, 16.3907f, 8.9689f, 16.0f, 8.0021f, 16.0f)
                curveTo(7.0353f, 16.0f, 6.1617f, 16.3907f, 5.5272f, 17.0251f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_pass-pending-fill`!!
    }

private var `_pass-pending-fill`: ImageVector? = null
