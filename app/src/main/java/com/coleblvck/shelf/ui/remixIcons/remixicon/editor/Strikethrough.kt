package com.coleblvck.shelf.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1538f, 14.0f)
                curveTo(17.3846f, 14.5161f, 17.5f, 15.0893f, 17.5f, 15.7196f)
                curveTo(17.5f, 17.0625f, 16.9762f, 18.1116f, 15.9286f, 18.867f)
                curveTo(14.8809f, 19.6223f, 13.4335f, 20.0f, 11.5862f, 20.0f)
                curveTo(9.9467f, 20.0f, 8.3233f, 19.6185f, 6.7159f, 18.8555f)
                verticalLineTo(16.6009f)
                curveTo(8.2354f, 17.4783f, 9.7908f, 17.917f, 11.3822f, 17.917f)
                curveTo(13.9333f, 17.917f, 15.2128f, 17.1846f, 15.2208f, 15.7196f)
                curveTo(15.2208f, 15.0939f, 15.0049f, 14.5598f, 14.5731f, 14.1173f)
                curveTo(14.5339f, 14.0772f, 14.4939f, 14.0381f, 14.4531f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.1538f)
                close()
                moveTo(13.076f, 11.0f)
                horizontalLineTo(7.6291f)
                curveTo(7.4566f, 10.8433f, 7.2962f, 10.6692f, 7.1478f, 10.4778f)
                curveTo(6.7159f, 9.9208f, 6.5f, 9.2456f, 6.5f, 8.4521f)
                curveTo(6.5f, 7.216f, 6.9658f, 6.165f, 7.8975f, 5.299f)
                curveTo(8.8292f, 4.433f, 10.2706f, 4.0f, 12.2219f, 4.0f)
                curveTo(13.6934f, 4.0f, 15.1009f, 4.3281f, 16.4444f, 4.9843f)
                verticalLineTo(7.1359f)
                curveTo(15.2448f, 6.4492f, 13.9293f, 6.1059f, 12.4978f, 6.1059f)
                curveTo(10.0187f, 6.1059f, 8.7792f, 6.8879f, 8.7792f, 8.4521f)
                curveTo(8.7792f, 8.8717f, 8.9971f, 9.238f, 9.4329f, 9.5508f)
                curveTo(9.8688f, 9.8636f, 10.4066f, 10.1135f, 11.0463f, 10.3004f)
                curveTo(11.6665f, 10.4816f, 12.3431f, 10.7148f, 13.076f, 11.0f)
                horizontalLineTo(13.076f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
