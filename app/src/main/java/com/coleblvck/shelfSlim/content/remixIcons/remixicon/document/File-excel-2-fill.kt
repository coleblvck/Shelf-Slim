package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-excel-2-fill`: ImageVector
    get() {
        if (`_file-excel-2-fill` != null) {
            return `_file-excel-2-fill`!!
        }
        `_file-excel-2-fill` = Builder(name = "File-excel-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8586f, 2.8773f)
                lineTo(15.4293f, 1.0815f)
                curveTo(15.7027f, 1.0424f, 15.9559f, 1.2324f, 15.995f, 1.5058f)
                curveTo(15.9983f, 1.5292f, 16.0f, 1.5528f, 16.0f, 1.5765f)
                verticalLineTo(22.4235f)
                curveTo(16.0f, 22.6996f, 15.7761f, 22.9235f, 15.5f, 22.9235f)
                curveTo(15.4763f, 22.9235f, 15.4527f, 22.9218f, 15.4293f, 22.9184f)
                lineTo(2.8586f, 21.1226f)
                curveTo(2.3659f, 21.0522f, 2.0f, 20.6303f, 2.0f, 20.1327f)
                verticalLineTo(3.8673f)
                curveTo(2.0f, 3.3696f, 2.3659f, 2.9477f, 2.8586f, 2.8773f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.2f, 12.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineTo(10.6f)
                lineTo(9.0f, 10.2857f)
                lineTo(7.4f, 8.0f)
                horizontalLineTo(5.0f)
                lineTo(7.8f, 12.0f)
                lineTo(5.0f, 16.0f)
                horizontalLineTo(7.4f)
                lineTo(9.0f, 13.7143f)
                lineTo(10.6f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(10.2f, 12.0f)
                close()
            }
        }
        .build()
        return `_file-excel-2-fill`!!
    }

private var `_file-excel-2-fill`: ImageVector? = null
