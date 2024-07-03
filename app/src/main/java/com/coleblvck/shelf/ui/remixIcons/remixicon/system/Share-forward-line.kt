package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Share-forward-line`: ImageVector
    get() {
        if (`_share-forward-line` != null) {
            return `_share-forward-line`!!
        }
        `_share-forward-line` = Builder(name = "Share-forward-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(7.542f, 14.0f, 4.5395f, 15.9502f, 3.0324f, 18.8107f)
                curveTo(3.0109f, 18.5433f, 3.0f, 18.2729f, 3.0f, 18.0f)
                curveTo(3.0f, 12.4772f, 7.4771f, 8.0f, 13.0f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(23.5f, 11.0f)
                lineTo(13.0f, 19.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(11.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.3078f)
                lineTo(20.3214f, 11.0f)
                lineTo(15.0f, 6.6922f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                curveTo(10.5795f, 10.0f, 8.4101f, 11.0749f, 6.9431f, 12.7735f)
                curveTo(8.2087f, 12.2714f, 9.5804f, 12.0f, 11.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_share-forward-line`!!
    }

private var `_share-forward-line`: ImageVector? = null
