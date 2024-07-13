package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Ancient-pavilion-line`: ImageVector
    get() {
        if (`_ancient-pavilion-line` != null) {
            return `_ancient-pavilion-line`!!
        }
        `_ancient-pavilion-line` = Builder(name = "Ancient-pavilion-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5159f, 7.8768f)
                curveTo(1.68f, 9.8298f, 3.0892f, 11.452f, 5.0001f, 11.8875f)
                verticalLineTo(19.0013f)
                horizontalLineTo(3.0001f)
                verticalLineTo(21.0013f)
                horizontalLineTo(21.0001f)
                verticalLineTo(19.0013f)
                horizontalLineTo(19.0001f)
                verticalLineTo(11.8875f)
                curveTo(20.9109f, 11.452f, 22.3202f, 9.8298f, 22.4842f, 7.8768f)
                curveTo(21.9938f, 7.9588f, 21.4973f, 8.0f, 21.0001f, 8.0f)
                curveTo(17.186f, 8.0f, 13.7861f, 5.5959f, 12.5148f, 2.0f)
                horizontalLineTo(11.4853f)
                curveTo(10.214f, 5.5959f, 6.8141f, 8.0f, 3.0001f, 8.0f)
                curveTo(2.5028f, 8.0f, 2.0064f, 7.9588f, 1.5159f, 7.8768f)
                close()
                moveTo(17.0001f, 19.0013f)
                horizontalLineTo(7.0001f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0001f)
                verticalLineTo(19.0013f)
                close()
                moveTo(18.5556f, 9.9375f)
                lineTo(18.2813f, 10.0f)
                horizontalLineTo(5.7188f)
                lineTo(5.4445f, 9.9375f)
                curveTo(5.3085f, 9.9065f, 5.1781f, 9.8659f, 5.0535f, 9.8159f)
                curveTo(6.5901f, 9.5322f, 8.0226f, 8.9207f, 9.3509f, 7.9815f)
                curveTo(10.4075f, 7.2343f, 11.2906f, 6.3559f, 12.0001f, 5.3461f)
                curveTo(12.7096f, 6.3559f, 13.5926f, 7.2343f, 14.6492f, 7.9815f)
                curveTo(15.9775f, 8.9207f, 17.41f, 9.5322f, 18.9467f, 9.8159f)
                curveTo(18.8221f, 9.8659f, 18.6917f, 9.9065f, 18.5556f, 9.9375f)
                close()
            }
        }
        .build()
        return `_ancient-pavilion-line`!!
    }

private var `_ancient-pavilion-line`: ImageVector? = null
