package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Css3-line`: ImageVector
    get() {
        if (`_css3-line` != null) {
            return `_css3-line`!!
        }
        `_css3-line` = Builder(name = "Css3-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8f, 14.0f)
                horizontalLineTo(4.8396f)
                lineTo(4.2947f, 16.7245f)
                lineTo(10.0393f, 18.8787f)
                lineTo(17.2665f, 16.4697f)
                lineTo(18.3604f, 11.0f)
                horizontalLineTo(3.4f)
                lineTo(3.8f, 9.0f)
                horizontalLineTo(18.7604f)
                lineTo(19.5604f, 5.0f)
                horizontalLineTo(4.6f)
                lineTo(5.0f, 3.0f)
                horizontalLineTo(22.0f)
                lineTo(19.0f, 18.0f)
                lineTo(10.0f, 21.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.8f, 14.0f)
                close()
            }
        }
        .build()
        return `_css3-line`!!
    }

private var `_css3-line`: ImageVector? = null
