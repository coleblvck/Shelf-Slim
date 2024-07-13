package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`English-input`: ImageVector
    get() {
        if (`_english-input` != null) {
            return `_english-input`!!
        }
        `_english-input` = Builder(name = "English-input", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0005f, 10.7574f)
                curveTo(16.7154f, 10.279f, 17.5751f, 10.0f, 18.5f, 10.0f)
                curveTo(20.9853f, 10.0f, 23.0f, 12.0147f, 23.0f, 14.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.5f)
                curveTo(21.0f, 13.07f, 19.8255f, 12.0f, 18.5f, 12.0f)
                curveTo(17.1745f, 12.0f, 16.0f, 13.07f, 16.0f, 14.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_english-input`!!
    }

private var `_english-input`: ImageVector? = null
