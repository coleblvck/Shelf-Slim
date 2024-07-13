package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Medal-2-fill`: ImageVector
    get() {
        if (`_medal-2-fill` != null) {
            return `_medal-2-fill`!!
        }
        `_medal-2-fill` = Builder(name = "Medal-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 8.5f)
                lineTo(14.1161f, 13.5875f)
                lineTo(19.6085f, 14.0279f)
                lineTo(15.4239f, 17.6125f)
                lineTo(16.7023f, 22.9721f)
                lineTo(12.0001f, 20.1f)
                lineTo(7.2978f, 22.9721f)
                lineTo(8.5763f, 17.6125f)
                lineTo(4.3916f, 14.0279f)
                lineTo(9.884f, 13.5875f)
                lineTo(12.0001f, 8.5f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0001f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0001f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0001f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0001f)
                close()
                moveTo(13.0001f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0001f)
                close()
            }
        }
        .build()
        return `_medal-2-fill`!!
    }

private var `_medal-2-fill`: ImageVector? = null