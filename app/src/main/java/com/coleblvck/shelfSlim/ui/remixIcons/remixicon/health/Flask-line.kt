package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Flask-line`: ImageVector
    get() {
        if (`_flask-line` != null) {
            return `_flask-line`!!
        }
        `_flask-line` = Builder(name = "Flask-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9994f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.9994f)
                verticalLineTo(7.2429f)
                curveTo(14.9994f, 8.4005f, 15.2506f, 9.5443f, 15.7357f, 10.5954f)
                lineTo(20.017f, 19.8714f)
                curveTo(20.3641f, 20.6236f, 20.0358f, 21.5148f, 19.2836f, 21.8619f)
                curveTo(19.0865f, 21.9529f, 18.8721f, 22.0f, 18.655f, 22.0f)
                horizontalLineTo(5.3438f)
                curveTo(4.5153f, 22.0f, 3.8438f, 21.3284f, 3.8438f, 20.5f)
                curveTo(3.8438f, 20.2829f, 3.8909f, 20.0685f, 3.9818f, 19.8714f)
                lineTo(8.2631f, 10.5954f)
                curveTo(8.7482f, 9.5443f, 8.9994f, 8.4005f, 8.9994f, 7.2429f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.9994f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.9994f)
                close()
                moveTo(13.3873f, 10.0012f)
                horizontalLineTo(10.6115f)
                curveTo(10.5072f, 10.3644f, 10.3823f, 10.7221f, 10.2371f, 11.0724f)
                lineTo(10.079f, 11.4335f)
                lineTo(6.1244f, 20.0f)
                horizontalLineTo(17.8734f)
                lineTo(13.9198f, 11.4335f)
                curveTo(13.7054f, 10.9691f, 13.5276f, 10.4902f, 13.3873f, 10.0012f)
                close()
                moveTo(10.9994f, 7.2429f)
                curveTo(10.9994f, 7.4963f, 10.9898f, 7.7491f, 10.9706f, 8.0009f)
                horizontalLineTo(13.0282f)
                curveTo(13.0189f, 7.8798f, 13.0119f, 7.7585f, 13.0072f, 7.637f)
                lineTo(12.9994f, 7.2429f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.9994f)
                verticalLineTo(7.2429f)
                close()
            }
        }
        .build()
        return `_flask-line`!!
    }

private var `_flask-line`: ImageVector? = null
