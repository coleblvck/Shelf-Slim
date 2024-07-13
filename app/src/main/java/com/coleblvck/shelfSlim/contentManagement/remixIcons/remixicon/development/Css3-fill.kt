package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Css3-fill`: ImageVector
    get() {
        if (`_css3-fill` != null) {
            return `_css3-fill`!!
        }
        `_css3-fill` = Builder(name = "Css3-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0001f, 3.0f)
                lineTo(4.3501f, 6.34f)
                horizontalLineTo(17.9401f)
                lineTo(17.5001f, 8.5f)
                horizontalLineTo(3.9201f)
                lineTo(3.2601f, 11.83f)
                horizontalLineTo(16.8501f)
                lineTo(16.0901f, 15.64f)
                lineTo(10.6101f, 17.45f)
                lineTo(5.8601f, 15.64f)
                lineTo(6.1901f, 14.0f)
                horizontalLineTo(2.8501f)
                lineTo(2.0601f, 18.0f)
                lineTo(9.9101f, 21.0f)
                lineTo(18.9601f, 18.0f)
                lineTo(20.1601f, 11.97f)
                lineTo(20.4001f, 10.76f)
                lineTo(21.9401f, 3.0f)
                horizontalLineTo(5.0001f)
                close()
            }
        }
        .build()
        return `_css3-fill`!!
    }

private var `_css3-fill`: ImageVector? = null