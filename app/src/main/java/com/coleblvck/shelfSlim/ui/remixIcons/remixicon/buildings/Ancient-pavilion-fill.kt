package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Ancient-pavilion-fill`: ImageVector
    get() {
        if (`_ancient-pavilion-fill` != null) {
            return `_ancient-pavilion-fill`!!
        }
        `_ancient-pavilion-fill` = Builder(name = "Ancient-pavilion-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5159f, 7.8768f)
                curveTo(1.68f, 9.8298f, 3.0892f, 11.452f, 5.0001f, 11.8875f)
                verticalLineTo(19.0013f)
                horizontalLineTo(3.0001f)
                verticalLineTo(21.0013f)
                horizontalLineTo(21.0001f)
                verticalLineTo(19.0013f)
                horizontalLineTo(19.0001f)
                verticalLineTo(11.8875f)
                curveTo(20.9109f, 11.452f, 22.3202f, 9.8298f, 22.4842f, 7.8768f)
                curveTo(21.9938f, 7.9588f, 21.4973f, 8.0f, 21.0001f, 8.0f)
                curveTo(17.186f, 8.0f, 13.7861f, 5.5959f, 12.5148f, 2.0f)
                horizontalLineTo(11.4853f)
                curveTo(10.214f, 5.5959f, 6.8141f, 8.0f, 3.0001f, 8.0f)
                curveTo(2.5028f, 8.0f, 2.0064f, 7.9588f, 1.5159f, 7.8768f)
                close()
                moveTo(17.0001f, 19.0013f)
                horizontalLineTo(7.0001f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0001f)
                verticalLineTo(19.0013f)
                close()
            }
        }
        .build()
        return `_ancient-pavilion-fill`!!
    }

private var `_ancient-pavilion-fill`: ImageVector? = null
