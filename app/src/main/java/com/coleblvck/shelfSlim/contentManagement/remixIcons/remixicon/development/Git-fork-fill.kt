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

public val DevelopmentGroup.`Git-fork-fill`: ImageVector
    get() {
        if (`_git-fork-fill` != null) {
            return `_git-fork-fill`!!
        }
        `_git-fork-fill` = Builder(name = "Git-fork-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                curveTo(9.0f, 7.3062f, 8.1652f, 8.4175f, 7.0f, 8.8293f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 10.1046f, 7.8954f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 11.0f, 17.0f, 10.1046f, 17.0f, 9.0f)
                verticalLineTo(8.8293f)
                curveTo(15.8348f, 8.4175f, 15.0f, 7.3062f, 15.0f, 6.0f)
                curveTo(15.0f, 4.3432f, 16.3431f, 3.0f, 18.0f, 3.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                curveTo(21.0f, 7.3062f, 20.1652f, 8.4175f, 19.0f, 8.8293f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 11.2091f, 17.2091f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.1707f)
                curveTo(14.1652f, 15.5825f, 15.0f, 16.6938f, 15.0f, 18.0f)
                curveTo(15.0f, 19.6569f, 13.6569f, 21.0f, 12.0f, 21.0f)
                curveTo(10.3431f, 21.0f, 9.0f, 19.6569f, 9.0f, 18.0f)
                curveTo(9.0f, 16.6938f, 9.8348f, 15.5825f, 11.0f, 15.1707f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                curveTo(6.7909f, 13.0f, 5.0f, 11.2091f, 5.0f, 9.0f)
                verticalLineTo(8.8293f)
                curveTo(3.8348f, 8.4175f, 3.0f, 7.3062f, 3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                curveTo(7.6568f, 3.0f, 9.0f, 4.3432f, 9.0f, 6.0f)
                close()
            }
        }
        .build()
        return `_git-fork-fill`!!
    }

private var `_git-fork-fill`: ImageVector? = null
