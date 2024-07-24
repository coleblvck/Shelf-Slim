package com.coleblvck.shelfSlim.content.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Flood-fill`: ImageVector
    get() {
        if (`_flood-fill` != null) {
            return `_flood-fill`!!
        }
        `_flood-fill` = Builder(name = "Flood-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 17.4723f)
                curveTo(17.0616f, 18.4223f, 18.4634f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                curveTo(18.5428f, 21.0f, 17.1766f, 20.6104f, 15.9998f, 19.9296f)
                curveTo(14.8242f, 20.6101f, 13.4576f, 21.0f, 12.0f, 21.0f)
                curveTo(10.5428f, 21.0f, 9.1766f, 20.6104f, 7.9998f, 19.9296f)
                curveTo(6.8242f, 20.6101f, 5.4576f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                curveTo(5.5371f, 19.0f, 6.9392f, 18.422f, 8.0001f, 17.4723f)
                curveTo(9.0616f, 18.4223f, 10.4634f, 19.0f, 12.0f, 19.0f)
                curveTo(13.5371f, 19.0f, 14.9393f, 18.422f, 16.0001f, 17.4723f)
                close()
                moveTo(12.5734f, 1.532f)
                lineTo(12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(18.3643f, 17.0f, 16.912f, 16.2145f, 15.9998f, 15.0002f)
                curveTo(15.088f, 16.2145f, 13.6357f, 17.0f, 12.0f, 17.0f)
                curveTo(10.3643f, 17.0f, 8.912f, 16.2145f, 7.9998f, 15.0002f)
                curveTo(7.088f, 16.2145f, 5.6357f, 17.0f, 4.0f, 17.0f)
                lineTo(3.999f, 10.9994f)
                lineTo(1.0f, 11.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.6452f, 1.3225f, 12.1027f, 1.2744f, 12.4671f, 1.467f)
                lineTo(12.5734f, 1.532f)
                close()
            }
        }
        .build()
        return `_flood-fill`!!
    }

private var `_flood-fill`: ImageVector? = null
