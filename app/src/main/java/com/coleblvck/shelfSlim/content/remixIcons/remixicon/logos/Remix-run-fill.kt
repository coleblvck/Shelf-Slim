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

public val LogosGroup.`Remix-run-fill`: ImageVector
    get() {
        if (`_remix-run-fill` != null) {
            return `_remix-run-fill`!!
        }
        `_remix-run-fill` = Builder(name = "Remix-run-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF121212)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1155f, 20.0f)
                curveTo(19.1155f, 18.9358f, 19.1155f, 17.9609f, 18.9536f, 15.8812f)
                curveTo(18.7532f, 13.7919f, 17.6654f, 12.7329f, 15.8047f, 12.3608f)
                curveTo(18.0089f, 12.0746f, 19.6406f, 10.3574f, 19.6406f, 7.7242f)
                curveTo(19.6406f, 4.2038f, 17.3219f, 2.0f, 12.6558f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.6689f)
                horizontalLineTo(11.797f)
                curveTo(13.8581f, 5.6689f, 14.8887f, 6.5534f, 14.8887f, 8.0131f)
                curveTo(14.8887f, 9.6731f, 13.8581f, 10.3001f, 11.797f, 10.3001f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0495f)
                horizontalLineTo(11.568f)
                curveTo(13.1997f, 14.0495f, 14.0871f, 14.5074f, 14.2302f, 16.5682f)
                curveTo(14.3385f, 17.9756f, 14.325f, 18.6726f, 14.3119f, 19.341f)
                lineTo(14.3119f, 19.3438f)
                curveTo(14.3077f, 19.5579f, 14.3036f, 19.7692f, 14.3036f, 20.0f)
                lineTo(19.1155f, 20.0f)
                close()
                moveTo(4.0f, 17.2046f)
                verticalLineTo(19.9996f)
                horizontalLineTo(10.1222f)
                verticalLineTo(18.2108f)
                curveTo(10.1222f, 17.8349f, 9.9377f, 17.2046f, 9.0878f, 17.2046f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_remix-run-fill`!!
    }

private var `_remix-run-fill`: ImageVector? = null
