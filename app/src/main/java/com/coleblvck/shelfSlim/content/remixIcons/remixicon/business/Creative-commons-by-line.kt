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

public val BusinessGroup.`Creative-commons-by-line`: ImageVector
    get() {
        if (`_creative-commons-by-line` != null) {
            return `_creative-commons-by-line`!!
        }
        `_creative-commons-by-line` = Builder(name = "Creative-commons-by-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 8.1046f, 13.1046f, 9.0f, 12.0f, 9.0f)
                curveTo(10.8954f, 9.0f, 10.0f, 8.1046f, 10.0f, 7.0f)
                curveTo(10.0f, 5.8954f, 10.8954f, 5.0f, 12.0f, 5.0f)
                curveTo(13.1046f, 5.0f, 14.0f, 5.8954f, 14.0f, 7.0f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(15.0f, 10.4478f, 14.5522f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4478f, 10.0f, 9.0f, 10.4478f, 9.0f, 11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.4772f, 2.0f, 2.0f, 6.4772f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4772f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4772f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_creative-commons-by-line`!!
    }

private var `_creative-commons-by-line`: ImageVector? = null