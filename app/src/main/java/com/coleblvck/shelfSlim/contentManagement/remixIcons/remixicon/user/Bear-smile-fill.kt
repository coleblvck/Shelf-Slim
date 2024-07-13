package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`Bear-smile-fill`: ImageVector
    get() {
        if (`_bear-smile-fill` != null) {
            return `_bear-smile-fill`!!
        }
        `_bear-smile-fill` = Builder(name = "Bear-smile-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.0f)
                curveTo(19.9853f, 2.0f, 22.0f, 4.0147f, 22.0f, 6.5f)
                curveTo(22.0f, 7.8562f, 21.4001f, 9.0723f, 20.4511f, 9.8973f)
                curveTo(20.8061f, 10.8644f, 21.0f, 11.9096f, 21.0f, 13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 11.9096f, 3.1939f, 10.8644f, 3.5492f, 9.8972f)
                curveTo(2.6f, 9.0723f, 2.0f, 7.8562f, 2.0f, 6.5f)
                curveTo(2.0f, 4.0147f, 4.0147f, 2.0f, 6.5f, 2.0f)
                curveTo(8.1255f, 2.0f, 9.5498f, 2.8619f, 10.3406f, 4.1536f)
                curveTo(10.8774f, 4.0525f, 11.4326f, 4.0f, 12.0f, 4.0f)
                curveTo(12.5674f, 4.0f, 13.1226f, 4.0525f, 13.6609f, 4.1529f)
                curveTo(14.4502f, 2.8619f, 15.8745f, 2.0f, 17.5f, 2.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 15.2091f, 9.7909f, 17.0f, 12.0f, 17.0f)
                curveTo(14.2091f, 17.0f, 16.0f, 15.2091f, 16.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.1046f, 13.1046f, 15.0f, 12.0f, 15.0f)
                curveTo(10.8954f, 15.0f, 10.0f, 14.1046f, 10.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_bear-smile-fill`!!
    }

private var `_bear-smile-fill`: ImageVector? = null
