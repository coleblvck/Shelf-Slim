package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Sort-number-asc`: ImageVector
    get() {
        if (`_sort-number-asc` != null) {
            return `_sort-number-asc`!!
        }
        `_sort-number-asc` = Builder(name = "Sort-number-asc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0005f, 3.0f)
                lineTo(9.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.41f)
                lineTo(5.0f, 5.9485f)
                verticalLineTo(3.6198f)
                lineTo(7.313f, 3.0f)
                horizontalLineTo(9.0005f)
                close()
                moveTo(19.0f, 3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 21.0f)
                lineTo(14.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(11.0f, 15.5f)
                curveTo(11.0f, 16.0645f, 10.8441f, 16.5926f, 10.5729f, 17.0436f)
                lineTo(8.2887f, 21.0f)
                horizontalLineTo(5.9793f)
                lineTo(7.4516f, 18.45f)
                curveTo(6.0566f, 18.1923f, 5.0f, 16.9695f, 5.0f, 15.5f)
                curveTo(5.0f, 13.8431f, 6.3432f, 12.5f, 8.0f, 12.5f)
                curveTo(9.6568f, 12.5f, 11.0f, 13.8431f, 11.0f, 15.5f)
                close()
                moveTo(8.0f, 16.5f)
                curveTo(8.5523f, 16.5f, 9.0f, 16.0523f, 9.0f, 15.5f)
                curveTo(9.0f, 14.9477f, 8.5523f, 14.5f, 8.0f, 14.5f)
                curveTo(7.4477f, 14.5f, 7.0f, 14.9477f, 7.0f, 15.5f)
                curveTo(7.0f, 16.0523f, 7.4477f, 16.5f, 8.0f, 16.5f)
                close()
            }
        }
        .build()
        return `_sort-number-asc`!!
    }

private var `_sort-number-asc`: ImageVector? = null
