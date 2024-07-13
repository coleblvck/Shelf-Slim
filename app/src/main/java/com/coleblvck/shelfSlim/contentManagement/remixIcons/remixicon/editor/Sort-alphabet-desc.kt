package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Sort-alphabet-desc`: ImageVector
    get() {
        if (`_sort-alphabet-desc` != null) {
            return `_sort-alphabet-desc`!!
        }
        `_sort-alphabet-desc` = Builder(name = "Sort-alphabet-desc", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8689f, 11.0f)
                horizontalLineTo(2.6665f)
                lineTo(6.0f, 3.0f)
                horizontalLineTo(8.0f)
                lineTo(11.3334f, 11.0f)
                horizontalLineTo(9.1311f)
                lineTo(8.7213f, 10.0f)
                horizontalLineTo(5.2787f)
                lineTo(4.8689f, 11.0f)
                close()
                moveTo(6.0984f, 8.0f)
                horizontalLineTo(7.9016f)
                lineTo(7.0f, 5.8f)
                lineTo(6.0984f, 8.0f)
                close()
                moveTo(21.9999f, 8.0f)
                lineTo(17.9999f, 3.0f)
                lineTo(13.9999f, 8.0f)
                horizontalLineTo(16.9999f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.9999f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.9999f)
                close()
                moveTo(10.9999f, 13.0f)
                horizontalLineTo(2.9999f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.8541f)
                lineTo(2.9999f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.9999f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.146f)
                lineTo(10.9999f, 15.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_sort-alphabet-desc`!!
    }

private var `_sort-alphabet-desc`: ImageVector? = null
