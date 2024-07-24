package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Markup-fill`: ImageVector
    get() {
        if (`_markup-fill` != null) {
            return `_markup-fill`!!
        }
        `_markup-fill` = Builder(name = "Markup-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.9967f)
                curveTo(6.4771f, 21.9967f, 2.0f, 17.5195f, 2.0f, 11.9967f)
                curveTo(2.0f, 6.4738f, 6.4771f, 1.9967f, 12.0f, 1.9967f)
                curveTo(17.5228f, 1.9967f, 22.0f, 6.4738f, 22.0f, 11.9967f)
                curveTo(22.0f, 17.5195f, 17.5228f, 21.9967f, 12.0f, 21.9967f)
                close()
                moveTo(17.051f, 18.2008f)
                lineTo(16.1894f, 14.7542f)
                curveTo(16.0781f, 14.309f, 15.6781f, 13.9967f, 15.2192f, 13.9967f)
                horizontalLineTo(8.7808f)
                curveTo(8.3219f, 13.9967f, 7.9219f, 14.309f, 7.8106f, 14.7542f)
                lineTo(6.949f, 18.2008f)
                curveTo(8.3263f, 19.3235f, 10.0845f, 19.9967f, 12.0f, 19.9967f)
                curveTo(13.9155f, 19.9967f, 15.6737f, 19.3235f, 17.051f, 18.2008f)
                close()
                moveTo(10.0f, 11.9967f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.4967f)
                lineTo(12.9615f, 6.862f)
                curveTo(12.8666f, 6.5298f, 12.6069f, 6.2701f, 12.2747f, 6.1752f)
                curveTo(11.7437f, 6.0235f, 11.1902f, 6.331f, 11.0385f, 6.862f)
                lineTo(10.0f, 10.4967f)
                verticalLineTo(11.9967f)
                close()
            }
        }
        .build()
        return `_markup-fill`!!
    }

private var `_markup-fill`: ImageVector? = null
