package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Bank-fill`: ImageVector
    get() {
        if (`_bank-fill` != null) {
            return `_bank-fill`!!
        }
        `_bank-fill` = Builder(name = "Bank-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(12.0f, 2.0f)
                lineTo(22.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 7.5523f, 13.0f, 7.0f)
                curveTo(13.0f, 6.4477f, 12.5523f, 6.0f, 12.0f, 6.0f)
                curveTo(11.4477f, 6.0f, 11.0f, 6.4477f, 11.0f, 7.0f)
                curveTo(11.0f, 7.5523f, 11.4477f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_bank-fill`!!
    }

private var `_bank-fill`: ImageVector? = null
