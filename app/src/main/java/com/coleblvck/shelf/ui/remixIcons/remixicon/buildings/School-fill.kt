package com.coleblvck.shelf.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`School-fill`: ImageVector
    get() {
        if (`_school-fill` != null) {
            return `_school-fill`!!
        }
        `_school-fill` = Builder(name = "School-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.9999f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.9999f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.5857f)
                lineTo(12.0f, 0.5857f)
                lineTo(6.0f, 6.5857f)
                verticalLineTo(8.9999f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.9999f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.9999f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.9999f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(11.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_school-fill`!!
    }

private var `_school-fill`: ImageVector? = null
