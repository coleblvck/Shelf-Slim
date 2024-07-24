package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Contract-left-right-line`: ImageVector
    get() {
        if (`_contract-left-right-line` != null) {
            return `_contract-left-right-line`!!
        }
        `_contract-left-right-line` = Builder(name = "Contract-left-right-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7931f, 5.7929f)
                lineTo(12.586f, 12.0f)
                lineTo(18.7931f, 18.2071f)
                lineTo(20.2073f, 16.7928f)
                lineTo(15.4144f, 12.0f)
                lineTo(20.2073f, 7.2071f)
                lineTo(18.7931f, 5.7929f)
                close()
                moveTo(5.207f, 18.2072f)
                lineTo(11.4141f, 12.0001f)
                lineTo(5.207f, 5.793f)
                lineTo(3.7928f, 7.2072f)
                lineTo(8.5857f, 12.0001f)
                lineTo(3.7928f, 16.793f)
                lineTo(5.207f, 18.2072f)
                close()
            }
        }
        .build()
        return `_contract-left-right-line`!!
    }

private var `_contract-left-right-line`: ImageVector? = null
