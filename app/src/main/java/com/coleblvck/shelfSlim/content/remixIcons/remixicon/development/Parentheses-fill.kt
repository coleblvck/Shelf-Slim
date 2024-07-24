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

public val DevelopmentGroup.`Parentheses-fill`: ImageVector
    get() {
        if (`_parentheses-fill` != null) {
            return `_parentheses-fill`!!
        }
        `_parentheses-fill` = Builder(name = "Parentheses-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9232f, 21.0f)
                curveTo(5.1127f, 18.6642f, 4.0f, 15.493f, 4.0f, 12.0f)
                curveTo(4.0f, 8.507f, 5.1127f, 5.3358f, 6.9232f, 3.0f)
                horizontalLineTo(8.9373f)
                curveTo(7.2351f, 5.3884f, 6.2f, 8.5424f, 6.2f, 12.0f)
                curveTo(6.2f, 15.4576f, 7.2351f, 18.6116f, 8.9373f, 21.0f)
                horizontalLineTo(6.9232f)
                close()
                moveTo(17.0741f, 21.0f)
                horizontalLineTo(15.06f)
                curveTo(16.7622f, 18.6116f, 17.7973f, 15.4576f, 17.7973f, 12.0f)
                curveTo(17.7973f, 8.5424f, 16.7622f, 5.3884f, 15.06f, 3.0f)
                horizontalLineTo(17.0741f)
                curveTo(18.8846f, 5.3358f, 19.9973f, 8.507f, 19.9973f, 12.0f)
                curveTo(19.9973f, 15.493f, 18.8846f, 18.6642f, 17.0741f, 21.0f)
                close()
            }
        }
        .build()
        return `_parentheses-fill`!!
    }

private var `_parentheses-fill`: ImageVector? = null
