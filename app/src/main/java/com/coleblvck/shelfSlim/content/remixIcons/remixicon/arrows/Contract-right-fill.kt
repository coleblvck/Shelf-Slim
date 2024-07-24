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

public val ArrowsGroup.`Contract-right-fill`: ImageVector
    get() {
        if (`_contract-right-fill` != null) {
            return `_contract-right-fill`!!
        }
        `_contract-right-fill` = Builder(name = "Contract-right-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9999f, 4.9998f)
                lineTo(16.0002f, 12.0f)
                lineTo(8.9999f, 18.9998f)
                verticalLineTo(12.9998f)
                lineTo(2.9999f, 13.0001f)
                lineTo(2.9999f, 11.0001f)
                lineTo(8.9999f, 10.9998f)
                verticalLineTo(4.9998f)
                close()
                moveTo(17.9999f, 18.9999f)
                lineTo(18.0f, 4.9999f)
                horizontalLineTo(20.0f)
                lineTo(19.9999f, 18.9999f)
                horizontalLineTo(17.9999f)
                close()
            }
        }
        .build()
        return `_contract-right-fill`!!
    }

private var `_contract-right-fill`: ImageVector? = null
