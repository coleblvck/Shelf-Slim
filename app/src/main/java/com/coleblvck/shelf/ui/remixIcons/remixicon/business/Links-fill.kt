package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Links-fill`: ImageVector
    get() {
        if (`_links-fill` != null) {
            return `_links-fill`!!
        }
        `_links-fill` = Builder(name = "Links-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0607f, 8.111f)
                lineTo(14.4749f, 9.5252f)
                curveTo(17.2086f, 12.2589f, 17.2086f, 16.691f, 14.4749f, 19.4247f)
                lineTo(14.1214f, 19.7782f)
                curveTo(11.3877f, 22.5119f, 6.9556f, 22.5119f, 4.2219f, 19.7782f)
                curveTo(1.4882f, 17.0446f, 1.4882f, 12.6124f, 4.2219f, 9.8787f)
                lineTo(5.6361f, 11.293f)
                curveTo(3.6835f, 13.2456f, 3.6835f, 16.4114f, 5.6361f, 18.364f)
                curveTo(7.5887f, 20.3166f, 10.7545f, 20.3166f, 12.7072f, 18.364f)
                lineTo(13.0607f, 18.0105f)
                curveTo(15.0133f, 16.0578f, 15.0133f, 12.892f, 13.0607f, 10.9394f)
                lineTo(11.6465f, 9.5252f)
                lineTo(13.0607f, 8.111f)
                close()
                moveTo(19.7782f, 14.1214f)
                lineTo(18.364f, 12.7072f)
                curveTo(20.3166f, 10.7545f, 20.3166f, 7.5887f, 18.364f, 5.6361f)
                curveTo(16.4114f, 3.6835f, 13.2456f, 3.6835f, 11.293f, 5.6361f)
                lineTo(10.9394f, 5.9896f)
                curveTo(8.9868f, 7.9423f, 8.9868f, 11.1081f, 10.9394f, 13.0607f)
                lineTo(12.3536f, 14.4749f)
                lineTo(10.9394f, 15.8891f)
                lineTo(9.5252f, 14.4749f)
                curveTo(6.7915f, 11.7413f, 6.7915f, 7.3091f, 9.5252f, 4.5754f)
                lineTo(9.8787f, 4.2219f)
                curveTo(12.6124f, 1.4882f, 17.0446f, 1.4882f, 19.7782f, 4.2219f)
                curveTo(22.5119f, 6.9556f, 22.5119f, 11.3877f, 19.7782f, 14.1214f)
                close()
            }
        }
        .build()
        return `_links-fill`!!
    }

private var `_links-fill`: ImageVector? = null
