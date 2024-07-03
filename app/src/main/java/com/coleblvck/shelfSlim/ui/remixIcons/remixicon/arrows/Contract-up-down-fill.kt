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

public val ArrowsGroup.`Contract-up-down-fill`: ImageVector
    get() {
        if (`_contract-up-down-fill` != null) {
            return `_contract-up-down-fill`!!
        }
        `_contract-up-down-fill` = Builder(name = "Contract-up-down-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                lineTo(12.0f, 11.0f)
                lineTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(12.0f, 13.0f)
                lineTo(6.0f, 19.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_contract-up-down-fill`!!
    }

private var `_contract-up-down-fill`: ImageVector? = null
