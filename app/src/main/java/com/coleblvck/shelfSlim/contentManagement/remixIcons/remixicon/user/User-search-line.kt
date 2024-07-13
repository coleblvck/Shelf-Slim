package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`User-search-line`: ImageVector
    get() {
        if (`_user-search-line` != null) {
            return `_user-search-line`!!
        }
        `_user-search-line` = Builder(name = "User-search-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(8.6863f, 16.0f, 6.0f, 18.6863f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.21f, 11.0f, 16.0f, 9.21f, 16.0f, 7.0f)
                curveTo(16.0f, 4.79f, 14.21f, 3.0f, 12.0f, 3.0f)
                curveTo(9.79f, 3.0f, 8.0f, 4.79f, 8.0f, 7.0f)
                curveTo(8.0f, 9.21f, 9.79f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(21.4462f, 20.032f)
                lineTo(22.9497f, 21.5355f)
                lineTo(21.5355f, 22.9497f)
                lineTo(20.032f, 21.4462f)
                curveTo(19.4365f, 21.7981f, 18.7418f, 22.0f, 18.0f, 22.0f)
                curveTo(15.7909f, 22.0f, 14.0f, 20.2091f, 14.0f, 18.0f)
                curveTo(14.0f, 15.7909f, 15.7909f, 14.0f, 18.0f, 14.0f)
                curveTo(20.2091f, 14.0f, 22.0f, 15.7909f, 22.0f, 18.0f)
                curveTo(22.0f, 18.7418f, 21.7981f, 19.4365f, 21.4462f, 20.032f)
                close()
                moveTo(18.0f, 20.0f)
                curveTo(19.1046f, 20.0f, 20.0f, 19.1046f, 20.0f, 18.0f)
                curveTo(20.0f, 16.8954f, 19.1046f, 16.0f, 18.0f, 16.0f)
                curveTo(16.8954f, 16.0f, 16.0f, 16.8954f, 16.0f, 18.0f)
                curveTo(16.0f, 19.1046f, 16.8954f, 20.0f, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_user-search-line`!!
    }

private var `_user-search-line`: ImageVector? = null
