package com.bignerdranch.android.juniormathematic.domain.entity

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentofRightAnswers: Int,
    val gameTimeInSeconds: Int
        )