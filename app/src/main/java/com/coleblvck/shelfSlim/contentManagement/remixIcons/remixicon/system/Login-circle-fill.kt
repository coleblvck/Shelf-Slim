package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Login-circle-fill`: ImageVector
    get() {
        if (`_login-circle-fill` != null) {
            return `_login-circle-fill`!!
        }
        `_login-circle-fill` = Builder(name = "Login-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9994f, 11.0f)
                horizontalLineTo(2.0488f)
                curveTo(2.5505f, 5.9467f, 6.8141f, 2.0f, 11.9995f, 2.0f)
                curveTo(17.5223f, 2.0f, 21.9995f, 6.4771f, 21.9995f, 12.0f)
                curveTo(21.9995f, 17.5228f, 17.5223f, 22.0f, 11.9995f, 22.0f)
                curveTo(6.8141f, 22.0f, 2.5505f, 18.0533f, 2.0488f, 13.0f)
                horizontalLineTo(9.9994f)
                verticalLineTo(16.0f)
                lineTo(14.9995f, 12.0f)
                lineTo(9.9994f, 8.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_login-circle-fill`!!
    }

private var `_login-circle-fill`: ImageVector? = null
