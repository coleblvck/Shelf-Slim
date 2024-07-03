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

public val ArrowsGroup.`Contract-right-line`: ImageVector
    get() {
        if (`_contract-right-line` != null) {
            return `_contract-right-line`!!
        }
        `_contract-right-line` = Builder(name = "Contract-right-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1715f, 11.0f)
                lineTo(7.5146f, 6.3431f)
                lineTo(8.9288f, 4.9289f)
                lineTo(15.9999f, 12.0f)
                lineTo(8.9288f, 19.071f)
                lineTo(7.5146f, 17.6568f)
                lineTo(12.1714f, 13.0f)
                lineTo(2.9996f, 13.0001f)
                lineTo(2.9996f, 11.0001f)
                lineTo(12.1715f, 11.0f)
                close()
                moveTo(17.9996f, 18.9999f)
                lineTo(17.9996f, 4.9999f)
                horizontalLineTo(19.9996f)
                lineTo(19.9996f, 18.9999f)
                horizontalLineTo(17.9996f)
                close()
            }
        }
        .build()
        return `_contract-right-line`!!
    }

private var `_contract-right-line`: ImageVector? = null
