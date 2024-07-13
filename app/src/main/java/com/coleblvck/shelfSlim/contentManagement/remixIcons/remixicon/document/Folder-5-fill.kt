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

public val DocumentGroup.`Folder-5-fill`: ImageVector
    get() {
        if (`_folder-5-fill` != null) {
            return `_folder-5-fill`!!
        }
        `_folder-5-fill` = Builder(name = "Folder-5-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4144f, 5.0f)
                horizontalLineTo(20.0002f)
                curveTo(20.5525f, 5.0f, 21.0002f, 5.4477f, 21.0002f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0002f)
                verticalLineTo(4.0f)
                curveTo(3.0002f, 3.4477f, 3.4479f, 3.0f, 4.0002f, 3.0f)
                horizontalLineTo(11.4144f)
                lineTo(13.4144f, 5.0f)
                close()
                moveTo(3.087f, 9.0f)
                horizontalLineTo(20.9134f)
                curveTo(21.4657f, 9.0f, 21.9134f, 9.4477f, 21.9134f, 10.0f)
                curveTo(21.9134f, 10.0277f, 21.9122f, 10.0554f, 21.9099f, 10.083f)
                lineTo(21.0766f, 20.083f)
                curveTo(21.0334f, 20.6013f, 20.6001f, 21.0f, 20.08f, 21.0f)
                horizontalLineTo(3.9203f)
                curveTo(3.4002f, 21.0f, 2.9669f, 20.6013f, 2.9238f, 20.083f)
                lineTo(2.0904f, 10.083f)
                curveTo(2.0446f, 9.5327f, 2.4536f, 9.0493f, 3.0039f, 9.0035f)
                curveTo(3.0315f, 9.0012f, 3.0593f, 9.0f, 3.087f, 9.0f)
                close()
            }
        }
        .build()
        return `_folder-5-fill`!!
    }

private var `_folder-5-fill`: ImageVector? = null
