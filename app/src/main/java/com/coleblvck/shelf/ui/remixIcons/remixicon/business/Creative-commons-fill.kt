package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Creative-commons-fill`: ImageVector
    get() {
        if (`_creative-commons-fill` != null) {
            return `_creative-commons-fill`!!
        }
        `_creative-commons-fill` = Builder(name = "Creative-commons-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(6.792f, 8.0f, 5.0f, 9.792f, 5.0f, 12.0f)
                curveTo(5.0f, 14.208f, 6.792f, 16.0f, 9.0f, 16.0f)
                curveTo(10.104f, 16.0f, 11.104f, 15.552f, 11.828f, 14.828f)
                lineTo(10.4144f, 13.4144f)
                curveTo(10.0525f, 13.7762f, 9.5525f, 14.0f, 9.0f, 14.0f)
                curveTo(7.895f, 14.0f, 7.0f, 13.105f, 7.0f, 12.0f)
                curveTo(7.0f, 10.895f, 7.895f, 10.0f, 9.0f, 10.0f)
                curveTo(9.553f, 10.0f, 10.0534f, 10.2241f, 10.4153f, 10.5866f)
                lineTo(11.829f, 9.173f)
                curveTo(11.1049f, 8.4484f, 10.1045f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(13.792f, 8.0f, 12.0f, 9.792f, 12.0f, 12.0f)
                curveTo(12.0f, 14.208f, 13.792f, 16.0f, 16.0f, 16.0f)
                curveTo(17.104f, 16.0f, 18.104f, 15.552f, 18.828f, 14.828f)
                lineTo(17.4144f, 13.4144f)
                curveTo(17.0525f, 13.7762f, 16.5525f, 14.0f, 16.0f, 14.0f)
                curveTo(14.895f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 14.895f, 10.0f, 16.0f, 10.0f)
                curveTo(16.553f, 10.0f, 17.0534f, 10.2241f, 17.4153f, 10.5866f)
                lineTo(18.829f, 9.173f)
                curveTo(18.1049f, 8.4484f, 17.1045f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_creative-commons-fill`!!
    }

private var `_creative-commons-fill`: ImageVector? = null
