package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Contract-up-down-line`: ImageVector
    get() {
        if (`_contract-up-down-line` != null) {
            return `_contract-up-down-line`!!
        }
        `_contract-up-down-line` = Builder(name = "Contract-up-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7928f, 5.2072f)
                lineTo(11.9999f, 11.4143f)
                lineTo(18.207f, 5.2072f)
                lineTo(16.7928f, 3.793f)
                lineTo(11.9999f, 8.5859f)
                lineTo(7.207f, 3.793f)
                lineTo(5.7928f, 5.2072f)
                close()
                moveTo(18.2072f, 18.7928f)
                lineTo(12.0001f, 12.5857f)
                lineTo(5.793f, 18.7928f)
                lineTo(7.2072f, 20.207f)
                lineTo(12.0001f, 15.4141f)
                lineTo(16.793f, 20.207f)
                lineTo(18.2072f, 18.7928f)
                close()
            }
        }
        .build()
        return `_contract-up-down-line`!!
    }

private var `_contract-up-down-line`: ImageVector? = null
