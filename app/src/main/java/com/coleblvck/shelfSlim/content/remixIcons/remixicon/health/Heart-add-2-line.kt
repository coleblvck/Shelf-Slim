package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Heart-add-2-line`: ImageVector
    get() {
        if (`_heart-add-2-line` != null) {
            return `_heart-add-2-line`!!
        }
        `_heart-add-2-line` = Builder(name = "Heart-add-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 6.4924f, 5.7135f, 5.0f, 7.5f, 5.0f)
                curveTo(9.4061f, 5.0f, 10.7537f, 6.5821f, 12.0f, 7.8284f)
                curveTo(13.2463f, 6.5821f, 14.5939f, 5.0f, 16.5f, 5.0f)
                curveTo(18.3158f, 5.0f, 20.0f, 6.4836f, 20.0f, 9.0f)
                curveTo(20.0f, 10.1222f, 19.7639f, 11.1501f, 19.3509f, 12.1019f)
                lineTo(21.1856f, 12.8981f)
                curveTo(21.7005f, 11.7114f, 22.0f, 10.4135f, 22.0f, 9.0f)
                curveTo(22.0f, 5.4959f, 19.5337f, 3.0f, 16.5f, 3.0f)
                curveTo(14.5905f, 3.0f, 13.1464f, 3.9848f, 12.0f, 5.028f)
                curveTo(10.8536f, 3.9848f, 9.4095f, 3.0f, 7.5f, 3.0f)
                curveTo(4.5036f, 3.0f, 2.0f, 5.4962f, 2.0f, 9.0f)
                curveTo(2.0f, 12.0199f, 3.3621f, 14.4702f, 5.2035f, 16.445f)
                curveTo(7.0331f, 18.4073f, 9.3853f, 19.955f, 11.4916f, 21.1985f)
                lineTo(12.5084f, 19.4762f)
                curveTo(10.441f, 18.2557f, 8.2931f, 16.8259f, 6.6662f, 15.0811f)
                curveTo(5.0511f, 13.3489f, 4.0f, 11.3626f, 4.0f, 9.0f)
                close()
                moveTo(19.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.999f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(19.0f)
                lineTo(18.999f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_heart-add-2-line`!!
    }

private var `_heart-add-2-line`: ImageVector? = null
