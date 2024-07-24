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

public val ArrowsGroup.`Contract-left-line`: ImageVector
    get() {
        if (`_contract-left-line` != null) {
            return `_contract-left-line`!!
        }
        `_contract-left-line` = Builder(name = "Contract-left-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0712f, 4.9289f)
                lineTo(16.4854f, 6.3431f)
                lineTo(11.8286f, 11.0f)
                lineTo(21.0004f, 11.0001f)
                lineTo(21.0004f, 13.0001f)
                lineTo(11.8286f, 13.0f)
                lineTo(16.4854f, 17.6568f)
                lineTo(15.0712f, 19.071f)
                lineTo(8.0002f, 12.0f)
                lineTo(15.0712f, 4.9289f)
                close()
                moveTo(4.0004f, 18.9999f)
                lineTo(4.0004f, 4.9999f)
                horizontalLineTo(6.0004f)
                lineTo(6.0004f, 18.9999f)
                horizontalLineTo(4.0004f)
                close()
            }
        }
        .build()
        return `_contract-left-line`!!
    }

private var `_contract-left-line`: ImageVector? = null
