package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Sticky-note-line`: ImageVector
    get() {
        if (`_sticky-note-line` != null) {
            return `_sticky-note-line`!!
        }
        `_sticky-note-line` = Builder(name = "Sticky-note-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                lineTo(15.0f, 20.996f)
                lineTo(4.0022f, 21.0f)
                curveTo(3.4487f, 21.0f, 3.0f, 20.5551f, 3.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(3.0f, 3.4448f, 3.445f, 3.0f, 3.9934f, 3.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 3.0f, 21.0f, 3.4558f, 21.0f, 4.0025f)
                verticalLineTo(15.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 13.4872f, 13.386f, 13.0645f, 13.8834f, 13.0067f)
                lineTo(14.0f, 13.0f)
                lineTo(19.0f, 12.999f)
                verticalLineTo(5.0f)
                close()
                moveTo(18.171f, 14.999f)
                lineTo(15.0f, 15.0f)
                verticalLineTo(18.169f)
                lineTo(18.171f, 14.999f)
                close()
            }
        }
        .build()
        return `_sticky-note-line`!!
    }

private var `_sticky-note-line`: ImageVector? = null
