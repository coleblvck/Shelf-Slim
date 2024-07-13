package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Xtz-line`: ImageVector
    get() {
        if (`_xtz-line` != null) {
            return `_xtz-line`!!
        }
        `_xtz-line` = Builder(name = "Xtz-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.2091f, 8.7909f, 17.0f, 11.0f, 17.0f)
                curveTo(12.0238f, 17.0f, 12.9599f, 16.614f, 13.6669f, 15.9812f)
                lineTo(12.3331f, 14.491f)
                curveTo(11.9786f, 14.8083f, 11.5129f, 15.0f, 11.0f, 15.0f)
                curveTo(9.8954f, 15.0f, 9.0f, 14.1046f, 9.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.6249f)
                lineTo(11.5f, 11.9749f)
                lineTo(11.5f, 13.5f)
                horizontalLineTo(12.5f)
                curveTo(15.5671f, 13.5f, 17.5f, 15.6792f, 17.5f, 17.5f)
                curveTo(17.5f, 19.3827f, 15.8727f, 21.0f, 13.75f, 21.0f)
                curveTo(11.9274f, 21.0f, 10.4568f, 19.7978f, 10.0902f, 18.2671f)
                lineTo(8.1452f, 18.7329f)
                curveTo(8.7386f, 21.2102f, 11.0514f, 23.0f, 13.75f, 23.0f)
                curveTo(16.874f, 23.0f, 19.5f, 20.5878f, 19.5f, 17.5f)
                curveTo(19.5f, 14.9348f, 17.4658f, 12.5683f, 14.5864f, 11.7783f)
                lineTo(19.0f, 7.5251f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_xtz-line`!!
    }

private var `_xtz-line`: ImageVector? = null
