package com.coleblvck.shelfSlim.content.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.UserGroup

public val UserGroup.`Body-scan-fill`: ImageVector
    get() {
        if (`_body-scan-fill` != null) {
            return `_body-scan-fill`!!
        }
        `_body-scan-fill` = Builder(name = "Body-scan-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(7.5f, 7.0f)
                curveTo(7.5f, 9.4853f, 9.5147f, 11.5f, 12.0f, 11.5f)
                curveTo(14.4853f, 11.5f, 16.5f, 9.4853f, 16.5f, 7.0f)
                horizontalLineTo(18.5f)
                curveTo(18.5f, 9.5073f, 17.0804f, 11.683f, 15.0011f, 12.7672f)
                lineTo(15.0f, 19.0f)
                horizontalLineTo(9.0f)
                lineTo(8.9999f, 12.7677f)
                curveTo(6.9201f, 11.6837f, 5.5f, 9.5077f, 5.5f, 7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(13.3807f, 5.0f, 14.5f, 6.1193f, 14.5f, 7.5f)
                curveTo(14.5f, 8.8807f, 13.3807f, 10.0f, 12.0f, 10.0f)
                curveTo(10.6193f, 10.0f, 9.5f, 8.8807f, 9.5f, 7.5f)
                curveTo(9.5f, 6.1193f, 10.6193f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(4.0f, 3.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return `_body-scan-fill`!!
    }

private var `_body-scan-fill`: ImageVector? = null
