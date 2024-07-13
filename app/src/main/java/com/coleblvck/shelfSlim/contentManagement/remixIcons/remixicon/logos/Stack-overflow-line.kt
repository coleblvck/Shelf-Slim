package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Stack-overflow-line`: ImageVector
    get() {
        if (`_stack-overflow-line` != null) {
            return `_stack-overflow-line`!!
        }
        `_stack-overflow-line` = Builder(name = "Stack-overflow-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.001f, 20.0025f)
                verticalLineTo(15.0001f)
                horizontalLineTo(20.001f)
                verticalLineTo(22.0025f)
                horizontalLineTo(4.001f)
                verticalLineTo(15.0001f)
                horizontalLineTo(6.001f)
                verticalLineTo(20.0025f)
                horizontalLineTo(18.001f)
                close()
                moveTo(7.501f, 18.0001f)
                verticalLineTo(16.0001f)
                horizontalLineTo(16.501f)
                verticalLineTo(18.0001f)
                horizontalLineTo(7.501f)
                close()
                moveTo(7.578f, 13.6197f)
                lineTo(7.9253f, 11.65f)
                lineTo(16.7886f, 13.2129f)
                lineTo(16.4413f, 15.1825f)
                lineTo(7.578f, 13.6197f)
                close()
                moveTo(9.2116f, 8.1161f)
                lineTo(10.2116f, 6.384f)
                lineTo(18.0058f, 10.884f)
                lineTo(17.0058f, 12.6161f)
                lineTo(9.2116f, 8.1161f)
                close()
                moveTo(12.6289f, 3.5031f)
                lineTo(14.161f, 2.2175f)
                lineTo(19.9461f, 9.1119f)
                lineTo(18.414f, 10.3975f)
                lineTo(12.6289f, 3.5031f)
                close()
            }
        }
        .build()
        return `_stack-overflow-line`!!
    }

private var `_stack-overflow-line`: ImageVector? = null
