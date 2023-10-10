package com.bignerdranch.android.juniormathematic.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOFQuestions: Int,
    val gameSettings: GameSettings
)