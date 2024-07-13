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

public val DevelopmentGroup.`Git-commit-fill`: ImageVector
    get() {
        if (`_git-commit-fill` != null) {
            return `_git-commit-fill`!!
        }
        `_git-commit-fill` = Builder(name = "Git-commit-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.874f, 13.0f)
                curveTo(15.4299f, 14.7252f, 13.8638f, 16.0f, 12.0f, 16.0f)
                curveTo(10.1362f, 16.0f, 8.5701f, 14.7252f, 8.126f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.126f)
                curveTo(8.5701f, 9.2748f, 10.1362f, 8.0f, 12.0f, 8.0f)
                curveTo(13.8638f, 8.0f, 15.4299f, 9.2748f, 15.874f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.874f)
                close()
            }
        }
        .build()
        return `_git-commit-fill`!!
    }

private var `_git-commit-fill`: ImageVector? = null