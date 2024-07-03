package com.coleblvck.shelf.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Flood-line`: ImageVector
    get() {
        if (`_flood-line` != null) {
            return `_flood-line`!!
        }
        `_flood-line` = Builder(name = "Flood-line", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(19.2988f, 17.0f, 18.6258f, 16.8797f, 18.0003f, 16.6587f)
                lineTo(18.0f, 9.157f)
                lineTo(12.0f, 3.702f)
                lineTo(6.0f, 9.156f)
                lineTo(6.0012f, 16.6582f)
                curveTo(5.4648f, 16.8479f, 4.8932f, 16.9635f, 4.299f, 16.9927f)
                lineTo(4.0f, 17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.677f, 1.2937f, 12.1956f, 1.2672f, 12.5734f, 1.532f)
                close()
            }
        }
        .build()
        return `_flood-line`!!
    }

private var `_flood-line`: ImageVector? = null
