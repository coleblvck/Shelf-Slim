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

public val EditorGroup.`List-indefinite`: ImageVector
    get() {
        if (`_list-indefinite` != null) {
            return `_list-indefinite`!!
        }
        `_list-indefinite` = Builder(name = "List-indefinite", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveTo(5.3954f, 19.0f, 4.5f, 18.1046f, 4.5f, 17.0f)
                curveTo(4.5f, 15.8954f, 5.3954f, 15.0f, 6.5f, 15.0f)
                curveTo(7.6046f, 15.0f, 8.5f, 15.8954f, 8.5f, 17.0f)
                curveTo(8.5f, 18.1046f, 7.6046f, 19.0f, 6.5f, 19.0f)
                close()
                moveTo(6.5f, 21.0f)
                curveTo(8.7091f, 21.0f, 10.5f, 19.2091f, 10.5f, 17.0f)
                curveTo(10.5f, 14.7909f, 8.7091f, 13.0f, 6.5f, 13.0f)
                curveTo(4.2909f, 13.0f, 2.5f, 14.7909f, 2.5f, 17.0f)
                curveTo(2.5f, 19.2091f, 4.2909f, 21.0f, 6.5f, 21.0f)
                close()
                moveTo(5.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_list-indefinite`!!
    }

private var `_list-indefinite`: ImageVector? = null
