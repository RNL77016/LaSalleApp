package com.example.a512lasalleapp.ui.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null


public val Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(0f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()
        return _Cash!!
    }

private var _Cash: ImageVector? = null

public val Password_2: ImageVector
    get() {
        if (_Password_2 != null) {
            return _Password_2!!
        }
        _Password_2 = ImageVector.Builder(
            name = "Password_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(160f, 520f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                reflectiveQuadToRelative(35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, -240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                reflectiveQuadToRelative(35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                moveToRelative(320f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                reflectiveQuadToRelative(35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
            }
        }.build()
        return _Password_2!!
    }

private var _Password_2: ImageVector? = null

public val Dark_mode: ImageVector
    get() {
        if (_Dark_mode != null) {
            return _Dark_mode!!
        }
        _Dark_mode = ImageVector.Builder(
            name = "Dark_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 840f)
                quadToRelative(-150f, 0f, -255f, -105f)
                reflectiveQuadTo(120f, 480f)
                reflectiveQuadToRelative(105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(14f, 0f, 27.5f, 1f)
                reflectiveQuadToRelative(26.5f, 3f)
                quadToRelative(-41f, 29f, -65.5f, 75.5f)
                reflectiveQuadTo(444f, 300f)
                quadToRelative(0f, 90f, 63f, 153f)
                reflectiveQuadToRelative(153f, 63f)
                quadToRelative(55f, 0f, 101f, -24.5f)
                reflectiveQuadToRelative(75f, -65.5f)
                quadToRelative(2f, 13f, 3f, 26.5f)
                reflectiveQuadToRelative(1f, 27.5f)
                quadToRelative(0f, 150f, -105f, 255f)
                reflectiveQuadTo(480f, 840f)
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 158f, -48.5f)
                reflectiveQuadTo(740f, 585f)
                quadToRelative(-20f, 5f, -40f, 8f)
                reflectiveQuadToRelative(-40f, 3f)
                quadToRelative(-123f, 0f, -209.5f, -86.5f)
                reflectiveQuadTo(364f, 300f)
                quadToRelative(0f, -20f, 3f, -40f)
                reflectiveQuadToRelative(8f, -40f)
                quadToRelative(-78f, 32f, -126.5f, 102f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                moveToRelative(-10f, -270f)
            }
        }.build()
        return _Dark_mode!!
    }

private var _Dark_mode: ImageVector? = null

public val Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(382f, 720f)
                lineTo(154f, 492f)
                lineToRelative(57f, -57f)
                lineToRelative(171f, 171f)
                lineToRelative(367f, -367f)
                lineToRelative(57f, 57f)
                close()
            }
        }.build()
        return _Check!!
    }

private var _Check: ImageVector? = null

public val Cross1: ImageVector
    get() {
        if (_Cross1 != null) {
            return _Cross1!!
        }
        _Cross1 = ImageVector.Builder(
            name = "Cross1",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.8536f, 2.85355f)
                curveTo(13.0488f, 2.6583f, 13.0488f, 2.3417f, 12.8536f, 2.1465f)
                curveTo(12.6583f, 1.9512f, 12.3417f, 1.9512f, 12.1464f, 2.1465f)
                lineTo(7.5f, 6.79289f)
                lineTo(2.85355f, 2.14645f)
                curveTo(2.6583f, 1.9512f, 2.3417f, 1.9512f, 2.1465f, 2.1465f)
                curveTo(1.9512f, 2.3417f, 1.9512f, 2.6583f, 2.1465f, 2.8535f)
                lineTo(6.79289f, 7.5f)
                lineTo(2.14645f, 12.1464f)
                curveTo(1.9512f, 12.3417f, 1.9512f, 12.6583f, 2.1465f, 12.8536f)
                curveTo(2.3417f, 13.0488f, 2.6583f, 13.0488f, 2.8535f, 12.8536f)
                lineTo(7.5f, 8.20711f)
                lineTo(12.1464f, 12.8536f)
                curveTo(12.3417f, 13.0488f, 12.6583f, 13.0488f, 12.8536f, 12.8536f)
                curveTo(13.0488f, 12.6583f, 13.0488f, 12.3417f, 12.8536f, 12.1464f)
                lineTo(8.20711f, 7.5f)
                lineTo(12.8536f, 2.85355f)
                close()
            }
        }.build()
        return _Cross1!!
    }

private var _Cross1: ImageVector? = null




