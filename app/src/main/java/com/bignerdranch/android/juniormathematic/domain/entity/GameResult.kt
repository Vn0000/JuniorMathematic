package com.bignerdranch.android.juniormathematic.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOFQuestions: Int,
    val gameSettings: GameSettings
) : Parcelable