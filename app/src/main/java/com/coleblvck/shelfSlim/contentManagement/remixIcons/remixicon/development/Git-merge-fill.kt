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

public val DevelopmentGroup.`Git-merge-fill`: ImageVector
    get() {
        if (`_git-merge-fill` != null) {
            return `_git-merge-fill`!!
        }
        `_git-merge-fill` = Builder(name = "Git-merge-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1051f, 8.7899f)
                curveTo(7.4518f, 10.0635f, 8.6165f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(16.4703f, 11.0f, 18.5222f, 12.7915f, 18.9274f, 15.1461f)
                curveTo(20.1303f, 15.5367f, 21.0f, 16.6668f, 21.0f, 18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                curveTo(16.3431f, 21.0f, 15.0f, 19.6569f, 15.0f, 18.0f)
                curveTo(15.0f, 16.7334f, 15.7849f, 15.6501f, 16.8949f, 15.2101f)
                curveTo(16.5482f, 13.9365f, 15.3835f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8744f, 13.0f, 7.8357f, 12.6281f, 7.0f, 12.0004f)
                verticalLineTo(15.1707f)
                curveTo(8.1652f, 15.5825f, 9.0f, 16.6938f, 9.0f, 18.0f)
                curveTo(9.0f, 19.6569f, 7.6568f, 21.0f, 6.0f, 21.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                curveTo(3.0f, 16.6938f, 3.8348f, 15.5825f, 5.0f, 15.1707f)
                verticalLineTo(8.8293f)
                curveTo(3.8348f, 8.4175f, 3.0f, 7.3062f, 3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                curveTo(7.6568f, 3.0f, 9.0f, 4.3432f, 9.0f, 6.0f)
                curveTo(9.0f, 7.2666f, 8.2151f, 8.3499f, 7.1051f, 8.7899f)
                close()
            }
        }
        .build()
        return `_git-merge-fill`!!
    }

private var `_git-merge-fill`: ImageVector? = null
