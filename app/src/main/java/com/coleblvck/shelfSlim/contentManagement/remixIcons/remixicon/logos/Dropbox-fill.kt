package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Dropbox-fill`: ImageVector
    get() {
        if (`_dropbox-fill` != null) {
            return `_dropbox-fill`!!
        }
        `_dropbox-fill` = Builder(name = "Dropbox-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2847f, 10.6683f)
                lineTo(22.5f, 13.9909f)
                lineTo(17.248f, 17.3368f)
                lineTo(12.0f, 13.9934f)
                lineTo(6.752f, 17.3368f)
                lineTo(1.5f, 13.9909f)
                lineTo(6.7152f, 10.6684f)
                lineTo(1.5f, 7.3459f)
                lineTo(6.7521f, 4.0f)
                lineTo(11.9999f, 7.3433f)
                lineTo(17.2481f, 4.0f)
                lineTo(22.5f, 7.3459f)
                lineTo(17.2847f, 10.6683f)
                close()
                moveTo(17.2112f, 10.6684f)
                lineTo(11.9999f, 7.3484f)
                lineTo(6.7887f, 10.6683f)
                lineTo(12.0f, 13.9883f)
                lineTo(17.2112f, 10.6684f)
                close()
                moveTo(6.7857f, 18.4456f)
                lineTo(12.0377f, 15.1f)
                lineTo(17.2898f, 18.4456f)
                lineTo(12.0377f, 21.7916f)
                lineTo(6.7857f, 18.4456f)
                close()
            }
        }
        .build()
        return `_dropbox-fill`!!
    }

private var `_dropbox-fill`: ImageVector? = null
