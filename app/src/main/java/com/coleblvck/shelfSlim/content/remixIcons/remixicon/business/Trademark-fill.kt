package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Trademark-fill`: ImageVector
    get() {
        if (`_trademark-fill` != null) {
            return `_trademark-fill`!!
        }
        `_trademark-fill` = Builder(name = "Trademark-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(12.0f, 6.0f)
                horizontalLineTo(14.5f)
                lineTo(17.4999f, 11.196f)
                lineTo(20.5f, 6.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.133f)
                lineTo(17.4999f, 15.196f)
                lineTo(14.0f, 9.135f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_trademark-fill`!!
    }

private var `_trademark-fill`: ImageVector? = null