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

public val BusinessGroup.`Global-line`: ImageVector
    get() {
        if (`_global-line` != null) {
            return `_global-line`!!
        }
        `_global-line` = Builder(name = "Global-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.71f, 19.6674f)
                curveTo(8.7474f, 17.6259f, 8.1573f, 15.3742f, 8.0273f, 13.0f)
                horizontalLineTo(4.0619f)
                curveTo(4.458f, 16.1765f, 6.7164f, 18.7747f, 9.71f, 19.6674f)
                close()
                moveTo(10.0307f, 13.0f)
                curveTo(10.1811f, 15.4388f, 10.8778f, 17.7297f, 12.0f, 19.752f)
                curveTo(13.1222f, 17.7297f, 13.8189f, 15.4388f, 13.9693f, 13.0f)
                horizontalLineTo(10.0307f)
                close()
                moveTo(19.9381f, 13.0f)
                horizontalLineTo(15.9727f)
                curveTo(15.8427f, 15.3742f, 15.2526f, 17.6259f, 14.29f, 19.6674f)
                curveTo(17.2836f, 18.7747f, 19.542f, 16.1765f, 19.9381f, 13.0f)
                close()
                moveTo(4.0619f, 11.0f)
                horizontalLineTo(8.0273f)
                curveTo(8.1573f, 8.6258f, 8.7474f, 6.3741f, 9.71f, 4.3326f)
                curveTo(6.7164f, 5.2253f, 4.458f, 7.8235f, 4.0619f, 11.0f)
                close()
                moveTo(10.0307f, 11.0f)
                horizontalLineTo(13.9693f)
                curveTo(13.8189f, 8.5612f, 13.1222f, 6.2702f, 12.0f, 4.248f)
                curveTo(10.8778f, 6.2702f, 10.1811f, 8.5612f, 10.0307f, 11.0f)
                close()
                moveTo(14.29f, 4.3326f)
                curveTo(15.2526f, 6.3741f, 15.8427f, 8.6258f, 15.9727f, 11.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.542f, 7.8235f, 17.2836f, 5.2253f, 14.29f, 4.3326f)
                close()
            }
        }
        .build()
        return `_global-line`!!
    }

private var `_global-line`: ImageVector? = null
