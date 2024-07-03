package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Firebase-line`: ImageVector
    get() {
        if (`_firebase-line` != null) {
            return `_firebase-line`!!
        }
        `_firebase-line` = Builder(name = "Firebase-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.223f, 8.707f)
                lineTo(6.9113f, 13.0414f)
                lineTo(8.0003f, 6.3259f)
                lineTo(9.223f, 8.707f)
                close()
                moveTo(10.3684f, 6.5593f)
                lineTo(7.6948f, 1.3529f)
                curveTo(7.4744f, 0.9236f, 6.8338f, 1.0249f, 6.7565f, 1.5013f)
                lineTo(4.0f, 18.4998f)
                lineTo(5.7482f, 19.5926f)
                lineTo(10.94f, 22.8375f)
                curveTo(11.5885f, 23.2428f, 12.4115f, 23.2428f, 13.06f, 22.8375f)
                lineTo(20.0f, 18.5f)
                lineTo(18.1424f, 5.961f)
                curveTo(18.0828f, 5.5587f, 17.5934f, 5.392f, 17.3007f, 5.6743f)
                lineTo(14.566f, 8.3113f)
                lineTo(12.4412f, 4.3272f)
                curveTo(12.2529f, 3.9743f, 11.7471f, 3.9743f, 11.5588f, 4.3272f)
                lineTo(10.3684f, 6.5593f)
                close()
                moveTo(13.0692f, 9.7547f)
                lineTo(8.6667f, 14.0f)
                lineTo(12.0f, 7.75f)
                lineTo(13.0692f, 9.7547f)
                close()
                moveTo(7.2322f, 18.1616f)
                lineTo(16.5911f, 9.137f)
                lineTo(17.8297f, 17.4979f)
                lineTo(12.0f, 21.1415f)
                lineTo(7.2322f, 18.1616f)
                close()
            }
        }
        .build()
        return `_firebase-line`!!
    }

private var `_firebase-line`: ImageVector? = null
