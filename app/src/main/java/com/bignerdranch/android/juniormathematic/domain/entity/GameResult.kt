package com.bignerdranch.android.juniormathematic.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOFQuestions: Int,
    val gameSettings: GameSettings
): Serializable