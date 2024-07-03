package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Ghost-smile-fill`: ImageVector
    get() {
        if (`_ghost-smile-fill` != null) {
            return `_ghost-smile-fill`!!
        }
        `_ghost-smile-fill` = Builder(name = "Ghost-smile-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.9706f, 2.0f, 21.0f, 6.0294f, 21.0f, 11.0f)
                verticalLineTo(18.5f)
                curveTo(21.0f, 20.433f, 19.433f, 22.0f, 17.5f, 22.0f)
                curveTo(16.3001f, 22.0f, 15.2413f, 21.3962f, 14.6107f, 20.476f)
                curveTo(14.0976f, 21.3857f, 13.1205f, 22.0f, 12.0f, 22.0f)
                curveTo(10.8795f, 22.0f, 9.9024f, 21.3857f, 9.3873f, 20.4754f)
                curveTo(8.7587f, 21.3962f, 7.6999f, 22.0f, 6.5f, 22.0f)
                curveTo(4.6314f, 22.0f, 3.1049f, 20.5357f, 3.0052f, 18.692f)
                lineTo(3.0f, 18.5f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 6.0294f, 7.0294f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.1046f, 13.1046f, 15.0f, 12.0f, 15.0f)
                curveTo(10.9456f, 15.0f, 10.0818f, 14.1841f, 10.0055f, 13.1493f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0049f, 13.1996f)
                curveTo(8.1089f, 15.316f, 9.8578f, 17.0f, 12.0f, 17.0f)
                curveTo(14.1422f, 17.0f, 15.8911f, 15.316f, 15.9951f, 13.1996f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_ghost-smile-fill`!!
    }

private var `_ghost-smile-fill`: ImageVector? = null
