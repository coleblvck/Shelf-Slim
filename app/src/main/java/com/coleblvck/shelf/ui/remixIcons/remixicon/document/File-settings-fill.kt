package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-settings-fill`: ImageVector
    get() {
        if (`_file-settings-fill` != null) {
            return `_file-settings-fill`!!
        }
        `_file-settings-fill` = Builder(name = "File-settings-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.0082f)
                curveTo(21.0f, 21.556f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.445f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.5946f, 12.8115f)
                lineTo(7.6029f, 13.384f)
                lineTo(8.603f, 15.1161f)
                lineTo(9.5953f, 14.5431f)
                curveTo(9.9884f, 14.915f, 10.4677f, 15.1967f, 11.0001f, 15.3551f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.0001f)
                verticalLineTo(15.355f)
                curveTo(13.5325f, 15.1966f, 14.0117f, 14.9149f, 14.4048f, 14.543f)
                lineTo(15.3972f, 15.116f)
                lineTo(16.3972f, 13.3839f)
                lineTo(15.4055f, 12.8114f)
                curveTo(15.4673f, 12.551f, 15.5f, 12.2793f, 15.5f, 12.0f)
                curveTo(15.5f, 11.7207f, 15.4673f, 11.449f, 15.4054f, 11.1885f)
                lineTo(16.3972f, 10.616f)
                lineTo(15.3971f, 8.8839f)
                lineTo(14.4047f, 9.4569f)
                curveTo(14.0116f, 9.0851f, 13.5324f, 8.8034f, 13.0f, 8.6449f)
                verticalLineTo(7.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.6449f)
                curveTo(10.4676f, 8.8034f, 9.9883f, 9.0851f, 9.5952f, 9.4569f)
                lineTo(8.6029f, 8.884f)
                lineTo(7.6029f, 10.6161f)
                lineTo(8.5945f, 11.1886f)
                curveTo(8.5327f, 11.449f, 8.5f, 11.7207f, 8.5f, 12.0f)
                curveTo(8.5f, 12.2794f, 8.5327f, 12.5511f, 8.5946f, 12.8115f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12.0f)
                curveTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12.0f, 10.5f)
                curveTo(12.8284f, 10.5f, 13.5f, 11.1716f, 13.5f, 12.0f)
                curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return `_file-settings-fill`!!
    }

private var `_file-settings-fill`: ImageVector? = null
