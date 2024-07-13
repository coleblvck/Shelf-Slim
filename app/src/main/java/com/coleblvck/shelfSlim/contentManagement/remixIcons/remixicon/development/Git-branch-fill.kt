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

public val DevelopmentGroup.`Git-branch-fill`: ImageVector
    get() {
        if (`_git-branch-fill` != null) {
            return `_git-branch-fill`!!
        }
        `_git-branch-fill` = Builder(name = "Git-branch-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1051f, 15.2101f)
                curveTo(8.2151f, 15.6501f, 9.0f, 16.7334f, 9.0f, 18.0f)
                curveTo(9.0f, 19.6569f, 7.6568f, 21.0f, 6.0f, 21.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                curveTo(3.0f, 16.6938f, 3.8348f, 15.5825f, 5.0f, 15.1707f)
                verticalLineTo(8.8293f)
                curveTo(3.8348f, 8.4175f, 3.0f, 7.3062f, 3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                curveTo(7.6568f, 3.0f, 9.0f, 4.3432f, 9.0f, 6.0f)
                curveTo(9.0f, 7.3062f, 8.1652f, 8.4175f, 7.0f, 8.8293f)
                verticalLineTo(11.9996f)
                curveTo(7.8357f, 11.3719f, 8.8744f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(15.3835f, 11.0f, 16.5482f, 10.0635f, 16.8949f, 8.7899f)
                curveTo(15.7849f, 8.3499f, 15.0f, 7.2666f, 15.0f, 6.0f)
                curveTo(15.0f, 4.3432f, 16.3431f, 3.0f, 18.0f, 3.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                curveTo(21.0f, 7.3332f, 20.1303f, 8.4633f, 18.9274f, 8.8539f)
                curveTo(18.5222f, 11.2085f, 16.4703f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(10.0f)
                curveTo(8.6165f, 13.0f, 7.4518f, 13.9365f, 7.1051f, 15.2101f)
                close()
            }
        }
        .build()
        return `_git-branch-fill`!!
    }

private var `_git-branch-fill`: ImageVector? = null
