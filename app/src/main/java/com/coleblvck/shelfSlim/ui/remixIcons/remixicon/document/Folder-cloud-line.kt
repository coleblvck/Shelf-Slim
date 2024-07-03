package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-cloud-line`: ImageVector
    get() {
        if (`_folder-cloud-line` != null) {
            return `_folder-cloud-line`!!
        }
        `_folder-cloud-line` = Builder(name = "Folder-cloud-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.5858f)
                lineTo(11.5858f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.4142f)
                lineTo(10.4142f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(12.0f, 18.25f)
                curveTo(12.0f, 16.9907f, 12.8465f, 15.9291f, 14.0015f, 15.6031f)
                curveTo(13.9452f, 13.6578f, 15.5523f, 12.0f, 17.5f, 12.0f)
                curveTo(19.4477f, 12.0f, 21.0548f, 13.6578f, 20.9985f, 15.6031f)
                curveTo(22.1535f, 15.9291f, 23.0f, 16.9907f, 23.0f, 18.25f)
                curveTo(23.0f, 19.7688f, 21.7688f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(14.75f)
                curveTo(13.2312f, 21.0f, 12.0f, 19.7688f, 12.0f, 18.25f)
                close()
                moveTo(17.5f, 14.0f)
                curveTo(16.6716f, 14.0f, 16.0f, 14.6716f, 16.0f, 15.5f)
                curveTo(16.0f, 15.9637f, 16.0239f, 16.4751f, 16.0569f, 16.9605f)
                curveTo(15.0926f, 17.1654f, 14.0f, 17.5516f, 14.0f, 18.25f)
                curveTo(14.0f, 18.6642f, 14.3358f, 19.0f, 14.75f, 19.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 19.0f, 21.0f, 18.6642f, 21.0f, 18.25f)
                curveTo(21.0f, 17.5516f, 19.9074f, 17.1654f, 18.9431f, 16.9605f)
                curveTo(18.9761f, 16.4751f, 19.0f, 15.9637f, 19.0f, 15.5f)
                curveTo(19.0f, 14.6716f, 18.3284f, 14.0f, 17.5f, 14.0f)
                close()
            }
        }
        .build()
        return `_folder-cloud-line`!!
    }

private var `_folder-cloud-line`: ImageVector? = null
