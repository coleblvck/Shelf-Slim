package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Share-forward-fill`: ImageVector
    get() {
        if (`_share-forward-fill` != null) {
            return `_share-forward-fill`!!
        }
        `_share-forward-fill` = Builder(name = "Share-forward-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(7.542f, 14.0f, 4.5395f, 15.9502f, 3.0324f, 18.8107f)
                curveTo(3.0109f, 18.5433f, 3.0f, 18.2729f, 3.0f, 18.0f)
                curveTo(3.0f, 12.4772f, 7.4771f, 8.0f, 13.0f, 8.0f)
                verticalLineTo(3.0f)
                lineTo(23.0f, 11.0f)
                lineTo(13.0f, 19.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_share-forward-fill`!!
    }

private var `_share-forward-fill`: ImageVector? = null
