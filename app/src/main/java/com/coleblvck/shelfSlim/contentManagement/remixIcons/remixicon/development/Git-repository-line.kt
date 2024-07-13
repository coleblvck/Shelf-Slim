package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Git-repository-line`: ImageVector
    get() {
        if (`_git-repository-line` != null) {
            return `_git-repository-line`!!
        }
        `_git-repository-line` = Builder(name = "Git-repository-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineTo(23.5f)
                lineTo(10.0f, 21.5f)
                lineTo(7.0f, 23.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 21.0f, 3.0f, 19.433f, 3.0f, 17.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.3431f, 4.3432f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 16.0f, 5.0f, 16.6716f, 5.0f, 17.5f)
                curveTo(5.0f, 18.3284f, 5.6716f, 19.0f, 6.5f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0354f)
                curveTo(6.1633f, 14.0121f, 6.3302f, 14.0f, 6.5f, 14.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_git-repository-line`!!
    }

private var `_git-repository-line`: ImageVector? = null
