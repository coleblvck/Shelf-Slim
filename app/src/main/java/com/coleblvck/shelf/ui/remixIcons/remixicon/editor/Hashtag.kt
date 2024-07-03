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

public val EditorGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7843f, 14.0f)
                lineTo(8.2047f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.4149f)
                lineTo(8.9404f, 3.0f)
                horizontalLineTo(10.9514f)
                lineTo(10.4259f, 8.0f)
                horizontalLineTo(14.4149f)
                lineTo(14.9404f, 3.0f)
                horizontalLineTo(16.9514f)
                lineTo(16.4259f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.2157f)
                lineTo(15.7953f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.5851f)
                lineTo(15.0596f, 21.0f)
                horizontalLineTo(13.0486f)
                lineTo(13.5741f, 16.0f)
                horizontalLineTo(9.5851f)
                lineTo(9.0596f, 21.0f)
                horizontalLineTo(7.0486f)
                lineTo(7.5741f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.7843f)
                close()
                moveTo(9.7953f, 14.0f)
                horizontalLineTo(13.7843f)
                lineTo(14.2047f, 10.0f)
                horizontalLineTo(10.2157f)
                lineTo(9.7953f, 14.0f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
