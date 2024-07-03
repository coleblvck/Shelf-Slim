package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Pinyin-input`: ImageVector
    get() {
        if (`_pinyin-input` != null) {
            return `_pinyin-input`!!
        }
        `_pinyin-input` = Builder(name = "Pinyin-input", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.934f, 3.0359f)
                lineTo(19.666f, 4.0359f)
                lineTo(18.531f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                lineTo(13.9157f, 14.0004f)
                curveTo(13.5914f, 16.8623f, 12.3522f, 19.3936f, 10.5466f, 21.1933f)
                lineTo(8.9836f, 19.9233f)
                curveTo(10.5031f, 18.4847f, 11.5801f, 16.4008f, 11.9008f, 14.0009f)
                lineTo(10.0f, 14.0f)
                verticalLineTo(12.0f)
                lineTo(12.0f, 11.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.467f)
                lineTo(11.334f, 4.0359f)
                lineTo(13.066f, 3.0359f)
                lineTo(14.777f, 6.0f)
                horizontalLineTo(16.221f)
                lineTo(17.934f, 3.0359f)
                close()
                moveTo(5.0f, 13.803f)
                lineTo(3.0f, 14.339f)
                verticalLineTo(12.268f)
                lineTo(5.0f, 11.732f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.197f)
                lineTo(9.0f, 10.661f)
                verticalLineTo(12.731f)
                lineTo(7.0f, 13.267f)
                verticalLineTo(18.5f)
                curveTo(7.0f, 19.8807f, 5.8807f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.5f)
                curveTo(4.7455f, 19.0f, 4.9496f, 18.8231f, 4.9919f, 18.5899f)
                lineTo(5.0f, 18.5f)
                verticalLineTo(13.803f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_pinyin-input`!!
    }

private var `_pinyin-input`: ImageVector? = null
