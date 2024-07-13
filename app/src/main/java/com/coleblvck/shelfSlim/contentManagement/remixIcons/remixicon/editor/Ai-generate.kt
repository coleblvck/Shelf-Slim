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

public val EditorGroup.`Ai-generate`: ImageVector
    get() {
        if (`_ai-generate` != null) {
            return `_ai-generate`!!
        }
        `_ai-generate` = Builder(name = "Ai-generate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.25f)
                curveTo(16.7949f, 5.25f, 18.25f, 3.7949f, 18.25f, 2.0f)
                horizontalLineTo(19.75f)
                curveTo(19.75f, 3.7949f, 21.2051f, 5.25f, 23.0f, 5.25f)
                verticalLineTo(6.75f)
                curveTo(21.2051f, 6.75f, 19.75f, 8.2051f, 19.75f, 10.0f)
                horizontalLineTo(18.25f)
                curveTo(18.25f, 8.2051f, 16.7949f, 6.75f, 15.0f, 6.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(4.0f, 7.0f)
                curveTo(4.0f, 5.8954f, 4.8954f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 3.0f, 2.0f, 4.7909f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 19.2091f, 3.7909f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 21.0f, 22.0f, 19.2091f, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 18.1046f, 19.1046f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 19.0f, 4.0f, 18.1046f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_ai-generate`!!
    }

private var `_ai-generate`: ImageVector? = null
