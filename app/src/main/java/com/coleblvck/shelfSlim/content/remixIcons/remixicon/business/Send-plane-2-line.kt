package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Send-plane-2-line`: ImageVector
    get() {
        if (`_send-plane-2-line` != null) {
            return `_send-plane-2-line`!!
        }
        `_send-plane-2-line` = Builder(name = "Send-plane-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 1.3456f)
                curveTo(3.5842f, 1.3456f, 3.6671f, 1.3669f, 3.741f, 1.4075f)
                lineTo(22.2034f, 11.5618f)
                curveTo(22.4454f, 11.6949f, 22.5337f, 11.9989f, 22.4006f, 12.2409f)
                curveTo(22.3549f, 12.324f, 22.2865f, 12.3924f, 22.2034f, 12.4381f)
                lineTo(3.741f, 22.5924f)
                curveTo(3.499f, 22.7255f, 3.195f, 22.6372f, 3.0619f, 22.3953f)
                curveTo(3.0213f, 22.3214f, 3.0f, 22.2386f, 3.0f, 22.1543f)
                verticalLineTo(1.8456f)
                curveTo(3.0f, 1.5694f, 3.2239f, 1.3456f, 3.5f, 1.3456f)
                close()
                moveTo(5.0f, 4.3825f)
                verticalLineTo(10.9999f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.9999f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.6174f)
                lineTo(18.8499f, 11.9999f)
                lineTo(5.0f, 4.3825f)
                close()
            }
        }
        .build()
        return `_send-plane-2-line`!!
    }

private var `_send-plane-2-line`: ImageVector? = null
