package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-forbid-fill`: ImageVector
    get() {
        if (`_folder-forbid-fill` != null) {
            return `_folder-forbid-fill`!!
        }
        `_folder-forbid-fill` = Builder(name = "Folder-forbid-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.2547f)
                curveTo(20.8662f, 10.4638f, 19.4872f, 10.0f, 18.0f, 10.0f)
                curveTo(14.134f, 10.0f, 11.0f, 13.134f, 11.0f, 17.0f)
                curveTo(11.0f, 18.4872f, 11.4638f, 19.8662f, 12.2547f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(11.2547f)
                close()
                moveTo(18.0f, 22.0f)
                curveTo(15.2386f, 22.0f, 13.0f, 19.7614f, 13.0f, 17.0f)
                curveTo(13.0f, 14.2386f, 15.2386f, 12.0f, 18.0f, 12.0f)
                curveTo(20.7614f, 12.0f, 23.0f, 14.2386f, 23.0f, 17.0f)
                curveTo(23.0f, 19.7614f, 20.7614f, 22.0f, 18.0f, 22.0f)
                close()
                moveTo(16.7066f, 19.7076f)
                curveTo(17.0982f, 19.895f, 17.5369f, 20.0f, 18.0f, 20.0f)
                curveTo(19.6569f, 20.0f, 21.0f, 18.6569f, 21.0f, 17.0f)
                curveTo(21.0f, 16.5369f, 20.895f, 16.0982f, 20.7076f, 15.7066f)
                lineTo(16.7066f, 19.7076f)
                close()
                moveTo(15.2924f, 18.2934f)
                lineTo(19.2934f, 14.2924f)
                curveTo(18.9018f, 14.105f, 18.4631f, 14.0f, 18.0f, 14.0f)
                curveTo(16.3431f, 14.0f, 15.0f, 15.3431f, 15.0f, 17.0f)
                curveTo(15.0f, 17.4631f, 15.105f, 17.9018f, 15.2924f, 18.2934f)
                close()
            }
        }
        .build()
        return `_folder-forbid-fill`!!
    }

private var `_folder-forbid-fill`: ImageVector? = null
