package com.bignerdranch.android.juniormathematic.domain.repository

import com.bignerdranch.android.juniormathematic.domain.entity.GameSettings
import com.bignerdranch.android.juniormathematic.domain.entity.Question
import com.bignerdranch.android.juniormathematic.domain.entity.Level

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}