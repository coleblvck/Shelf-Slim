package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Brush-line`: ImageVector
    get() {
        if (`_brush-line` != null) {
            return `_brush-line`!!
        }
        `_brush-line` = Builder(name = "Brush-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4565f, 9.675f)
                lineTo(15.3144f, 9.533f)
                curveTo(14.6661f, 8.908f, 13.8549f, 8.4337f, 12.9235f, 8.1841f)
                curveTo(10.0168f, 7.4053f, 7.2254f, 9.0527f, 6.4318f, 12.0143f)
                curveTo(6.389f, 12.1742f, 6.3657f, 12.3537f, 6.3285f, 12.8051f)
                curveTo(6.1742f, 14.6752f, 5.7345f, 16.0697f, 4.5286f, 17.4842f)
                curveTo(6.7885f, 18.3727f, 9.4657f, 18.9986f, 11.5016f, 18.9986f)
                curveTo(13.9702f, 18.9986f, 16.1644f, 17.3394f, 16.8126f, 14.9202f)
                curveTo(17.3306f, 12.9869f, 16.7513f, 11.0181f, 15.4565f, 9.675f)
                close()
                moveTo(13.2886f, 6.213f)
                lineTo(18.2278f, 2.3714f)
                curveTo(18.6259f, 2.0618f, 19.1922f, 2.0971f, 19.5488f, 2.4537f)
                lineTo(22.543f, 5.4479f)
                curveTo(22.8997f, 5.8045f, 22.9349f, 6.3708f, 22.6253f, 6.7689f)
                lineTo(18.7847f, 11.7068f)
                curveTo(19.0778f, 12.8951f, 19.0836f, 14.1721f, 18.7444f, 15.4379f)
                curveTo(17.8463f, 18.7897f, 14.8142f, 20.9986f, 11.5016f, 20.9986f)
                curveTo(8.0f, 20.9986f, 3.5f, 19.4967f, 1.0f, 17.9967f)
                curveTo(4.9798f, 14.9967f, 4.0472f, 13.1865f, 4.5f, 11.4967f)
                curveTo(5.5584f, 7.5466f, 9.3422f, 5.2393f, 13.2886f, 6.213f)
                close()
                moveTo(16.7015f, 8.0916f)
                curveTo(16.7673f, 8.1551f, 16.8319f, 8.2196f, 16.8952f, 8.2853f)
                lineTo(18.0297f, 9.4198f)
                lineTo(20.5046f, 6.2379f)
                lineTo(18.7589f, 4.4921f)
                lineTo(15.5769f, 6.967f)
                lineTo(16.7015f, 8.0916f)
                close()
            }
        }
        .build()
        return `_brush-line`!!
    }

private var `_brush-line`: ImageVector? = null
