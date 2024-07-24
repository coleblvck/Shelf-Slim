package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Stack-overflow-fill`: ImageVector
    get() {
        if (`_stack-overflow-fill` != null) {
            return `_stack-overflow-fill`!!
        }
        `_stack-overflow-fill` = Builder(name = "Stack-overflow-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.001f, 20.0026f)
                verticalLineTo(14.6693f)
                horizontalLineTo(20.001f)
                verticalLineTo(22.0026f)
                horizontalLineTo(4.001f)
                verticalLineTo(14.6693f)
                horizontalLineTo(6.001f)
                verticalLineTo(20.0026f)
                horizontalLineTo(18.001f)
                close()
                moveTo(7.5998f, 14.7359f)
                lineTo(7.913f, 12.7566f)
                lineTo(16.75f, 14.456f)
                lineTo(16.6367f, 16.0421f)
                lineTo(7.5998f, 14.7359f)
                close()
                moveTo(8.7994f, 10.2041f)
                lineTo(9.5324f, 8.6046f)
                lineTo(17.5298f, 12.3367f)
                lineTo(16.7967f, 13.9362f)
                lineTo(8.7994f, 10.2041f)
                close()
                moveTo(11.0653f, 6.2721f)
                lineTo(12.1982f, 4.9392f)
                lineTo(18.9959f, 10.604f)
                lineTo(17.863f, 11.9368f)
                lineTo(11.0653f, 6.2721f)
                close()
                moveTo(15.3972f, 2.1401f)
                lineTo(20.6621f, 9.2044f)
                lineTo(19.2625f, 10.2707f)
                lineTo(13.9976f, 3.2064f)
                lineTo(15.3972f, 2.1401f)
                close()
                moveTo(7.3332f, 18.6679f)
                verticalLineTo(16.6686f)
                horizontalLineTo(16.6634f)
                verticalLineTo(18.6679f)
                horizontalLineTo(7.3332f)
                close()
            }
        }
        .build()
        return `_stack-overflow-fill`!!
    }

private var `_stack-overflow-fill`: ImageVector? = null
