package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Quill-pen-line`: ImageVector
    get() {
        if (`_quill-pen-line` != null) {
            return `_quill-pen-line`!!
        }
        `_quill-pen-line` = Builder(name = "Quill-pen-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9391f, 14.0328f)
                curveTo(6.7072f, 14.6563f, 6.5103f, 15.2331f, 6.3342f, 15.8155f)
                curveTo(7.2934f, 15.1189f, 8.4354f, 14.6767f, 9.7519f, 14.5121f)
                curveTo(12.2652f, 14.198f, 14.4976f, 12.5385f, 15.6279f, 10.4537f)
                lineTo(14.1721f, 8.9989f)
                lineTo(15.5848f, 7.5842f)
                curveTo(15.9185f, 7.25f, 16.2521f, 6.9161f, 16.5858f, 6.5825f)
                curveTo(17.0151f, 6.1531f, 17.5f, 5.3585f, 18.0129f, 4.2149f)
                curveTo(12.4197f, 5.0818f, 8.9948f, 8.5065f, 6.9391f, 14.0328f)
                close()
                moveTo(17.0f, 8.9974f)
                lineTo(18.0f, 9.9967f)
                curveTo(17.0f, 12.9967f, 14.0f, 15.9967f, 10.0f, 16.4967f)
                curveTo(7.3315f, 16.8303f, 5.6642f, 18.6636f, 4.9982f, 21.9967f)
                horizontalLineTo(3.0f)
                curveTo(4.0f, 15.9967f, 6.0f, 1.9967f, 21.0f, 1.9967f)
                curveTo(20.0009f, 4.994f, 19.0018f, 6.9931f, 18.0027f, 7.994f)
                curveTo(17.6662f, 8.3305f, 17.3331f, 8.6638f, 17.0f, 8.9974f)
                close()
            }
        }
        .build()
        return `_quill-pen-line`!!
    }

private var `_quill-pen-line`: ImageVector? = null
