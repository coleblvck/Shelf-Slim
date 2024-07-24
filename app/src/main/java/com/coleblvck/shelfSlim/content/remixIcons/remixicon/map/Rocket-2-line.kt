package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Rocket-2-line`: ImageVector
    get() {
        if (`_rocket-2-line` != null) {
            return `_rocket-2-line`!!
        }
        `_rocket-2-line` = Builder(name = "Rocket-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5018f, 20.0048f)
                curveTo(14.8432f, 21.5841f, 13.5794f, 22.848f, 12.0f, 23.5066f)
                curveTo(10.4206f, 22.848f, 9.1568f, 21.5841f, 8.4982f, 20.0048f)
                horizontalLineTo(10.7575f)
                curveTo(11.0838f, 20.4934f, 11.5051f, 20.9171f, 12.0f, 21.248f)
                curveTo(12.4949f, 20.9171f, 12.9162f, 20.4934f, 13.2425f, 20.0048f)
                horizontalLineTo(15.5018f)
                close()
                moveTo(18.0f, 14.8095f)
                lineTo(20.0f, 17.0777f)
                verticalLineTo(19.0048f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0777f)
                lineTo(6.0f, 14.8095f)
                verticalLineTo(9.0048f)
                curveTo(6.0f, 5.5215f, 8.5044f, 2.5582f, 12.0f, 1.46f)
                curveTo(15.4956f, 2.5582f, 18.0f, 5.5215f, 18.0f, 9.0048f)
                verticalLineTo(14.8095f)
                close()
                moveTo(17.2692f, 17.0048f)
                lineTo(16.0f, 15.5653f)
                verticalLineTo(9.0048f)
                curveTo(16.0f, 6.6869f, 14.4292f, 4.5743f, 12.0f, 3.5838f)
                curveTo(9.5708f, 4.5743f, 8.0f, 6.6869f, 8.0f, 9.0048f)
                verticalLineTo(15.5653f)
                lineTo(6.7308f, 17.0048f)
                horizontalLineTo(17.2692f)
                close()
                moveTo(12.0f, 11.0048f)
                curveTo(10.8954f, 11.0048f, 10.0f, 10.1093f, 10.0f, 9.0048f)
                curveTo(10.0f, 7.9002f, 10.8954f, 7.0048f, 12.0f, 7.0048f)
                curveTo(13.1046f, 7.0048f, 14.0f, 7.9002f, 14.0f, 9.0048f)
                curveTo(14.0f, 10.1093f, 13.1046f, 11.0048f, 12.0f, 11.0048f)
                close()
            }
        }
        .build()
        return `_rocket-2-line`!!
    }

private var `_rocket-2-line`: ImageVector? = null
