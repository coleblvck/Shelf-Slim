package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Flip-horizontal-line`: ImageVector
    get() {
        if (`_flip-horizontal-line` != null) {
            return `_flip-horizontal-line`!!
        }
        `_flip-horizontal-line` = Builder(name = "Flip-horizontal-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1046f, 4.0f, 9.0f, 4.8954f, 9.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(9.0f, 19.1046f, 8.1046f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 20.0f, 2.0f, 19.1046f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(20.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(17.0f, 4.0f)
                curveTo(15.8954f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 19.1046f, 15.8954f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.8954f, 21.1046f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_flip-horizontal-line`!!
    }

private var `_flip-horizontal-line`: ImageVector? = null
