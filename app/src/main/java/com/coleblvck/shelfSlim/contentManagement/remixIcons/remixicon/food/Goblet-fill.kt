package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Goblet-fill`: ImageVector
    get() {
        if (`_goblet-fill` != null) {
            return `_goblet-fill`!!
        }
        `_goblet-fill` = Builder(name = "Goblet-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                verticalLineTo(13.8889f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                lineTo(13.0f, 13.8889f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(7.4907f, 7.0f)
                horizontalLineTo(16.5093f)
                lineTo(18.3093f, 5.0f)
                horizontalLineTo(5.6907f)
                lineTo(7.4907f, 7.0f)
                close()
            }
        }
        .build()
        return `_goblet-fill`!!
    }

private var `_goblet-fill`: ImageVector? = null
