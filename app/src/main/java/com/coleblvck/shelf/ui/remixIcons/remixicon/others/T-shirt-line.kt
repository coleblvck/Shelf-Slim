package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`T-shirt-line`: ImageVector
    get() {
        if (`_t-shirt-line` != null) {
            return `_t-shirt-line`!!
        }
        `_t-shirt-line` = Builder(name = "T-shirt-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5135f, 5.0001f)
                lineTo(17.1201f, 2.3935f)
                curveTo(17.5106f, 2.0029f, 18.1438f, 2.0029f, 18.5343f, 2.3935f)
                lineTo(22.777f, 6.6361f)
                curveTo(23.1675f, 7.0266f, 23.1675f, 7.6598f, 22.777f, 8.0503f)
                lineTo(18.9988f, 11.8285f)
                verticalLineTo(21.0001f)
                curveTo(18.9988f, 21.5524f, 18.5511f, 22.0001f, 17.9988f, 22.0001f)
                horizontalLineTo(5.9988f)
                curveTo(5.4465f, 22.0001f, 4.9988f, 21.5524f, 4.9988f, 21.0001f)
                verticalLineTo(11.8285f)
                lineTo(1.2206f, 8.0503f)
                curveTo(0.8301f, 7.6598f, 0.8301f, 7.0266f, 1.2206f, 6.6361f)
                lineTo(5.4633f, 2.3935f)
                curveTo(5.8538f, 2.0029f, 6.487f, 2.0029f, 6.8775f, 2.3935f)
                lineTo(9.4841f, 5.0001f)
                horizontalLineTo(14.5135f)
                close()
                moveTo(15.3419f, 7.0001f)
                horizontalLineTo(8.6557f)
                lineTo(6.1704f, 4.5148f)
                lineTo(3.3419f, 7.3432f)
                lineTo(6.9988f, 11.0001f)
                verticalLineTo(20.0001f)
                horizontalLineTo(16.9988f)
                verticalLineTo(11.0001f)
                lineTo(20.6557f, 7.3432f)
                lineTo(17.8272f, 4.5148f)
                lineTo(15.3419f, 7.0001f)
                close()
            }
        }
        .build()
        return `_t-shirt-line`!!
    }

private var `_t-shirt-line`: ImageVector? = null
