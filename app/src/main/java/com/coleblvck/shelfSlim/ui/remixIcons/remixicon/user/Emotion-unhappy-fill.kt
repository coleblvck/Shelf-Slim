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

public val UserGroup.`Emotion-unhappy-fill`: ImageVector
    get() {
        if (`_emotion-unhappy-fill` != null) {
            return `_emotion-unhappy-fill`!!
        }
        `_emotion-unhappy-fill` = Builder(name = "Emotion-unhappy-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 15.3431f, 10.3431f, 14.0f, 12.0f, 14.0f)
                curveTo(13.6569f, 14.0f, 15.0f, 15.3431f, 15.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 14.2386f, 14.7614f, 12.0f, 12.0f, 12.0f)
                curveTo(9.2386f, 12.0f, 7.0f, 14.2386f, 7.0f, 17.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.8284f, 11.0f, 9.5f, 10.3284f, 9.5f, 9.5f)
                curveTo(9.5f, 8.6716f, 8.8284f, 8.0f, 8.0f, 8.0f)
                curveTo(7.1716f, 8.0f, 6.5f, 8.6716f, 6.5f, 9.5f)
                curveTo(6.5f, 10.3284f, 7.1716f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(16.8284f, 11.0f, 17.5f, 10.3284f, 17.5f, 9.5f)
                curveTo(17.5f, 8.6716f, 16.8284f, 8.0f, 16.0f, 8.0f)
                curveTo(15.1716f, 8.0f, 14.5f, 8.6716f, 14.5f, 9.5f)
                curveTo(14.5f, 10.3284f, 15.1716f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_emotion-unhappy-fill`!!
    }

private var `_emotion-unhappy-fill`: ImageVector? = null
