package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-left-down-line`: ImageVector
    get() {
        if (`_arrow-left-down-line` != null) {
            return `_arrow-left-down-line`!!
        }
        `_arrow-left-down-line` = Builder(name = "Arrow-left-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.589f)
                lineTo(17.6066f, 4.9824f)
                lineTo(19.0208f, 6.3966f)
                lineTo(10.4142f, 15.0032f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0032f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0032f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.589f)
                close()
            }
        }
        .build()
        return `_arrow-left-down-line`!!
    }

private var `_arrow-left-down-line`: ImageVector? = null
