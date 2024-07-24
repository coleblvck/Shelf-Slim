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

public val ArrowsGroup.`Contract-left-fill`: ImageVector
    get() {
        if (`_contract-left-fill` != null) {
            return `_contract-left-fill`!!
        }
        `_contract-left-fill` = Builder(name = "Contract-left-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0001f, 4.9998f)
                verticalLineTo(10.9998f)
                lineTo(21.0001f, 11.0001f)
                lineTo(21.0001f, 13.0001f)
                lineTo(15.0001f, 12.9998f)
                verticalLineTo(18.9998f)
                lineTo(7.9998f, 12.0f)
                lineTo(15.0001f, 4.9998f)
                close()
                moveTo(4.0001f, 18.9999f)
                lineTo(4.0001f, 4.9999f)
                horizontalLineTo(6.0001f)
                lineTo(6.0001f, 18.9999f)
                horizontalLineTo(4.0001f)
                close()
            }
        }
        .build()
        return `_contract-left-fill`!!
    }

private var `_contract-left-fill`: ImageVector? = null
