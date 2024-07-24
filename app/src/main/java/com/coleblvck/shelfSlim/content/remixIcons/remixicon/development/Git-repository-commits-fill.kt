package com.coleblvck.shelfSlim.content.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Git-repository-commits-fill`: ImageVector
    get() {
        if (`_git-repository-commits-fill` != null) {
            return `_git-repository-commits-fill`!!
        }
        `_git-repository-commits-fill` = Builder(name = "Git-repository-commits-fill", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                lineTo(13.0f, 12.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.2f)
                lineTo(13.0f, 9.5f)
                lineTo(7.6471f, 16.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 16.0f, 5.0f, 16.6716f, 5.0f, 17.5f)
                curveTo(5.0f, 18.3284f, 5.6716f, 19.0f, 6.5f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 21.0f, 3.0f, 19.433f, 3.0f, 17.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.3431f, 4.3432f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(7.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(7.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_git-repository-commits-fill`!!
    }

private var `_git-repository-commits-fill`: ImageVector? = null
