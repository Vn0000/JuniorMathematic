package com.bignerdranch.android.juniormathematic.domain.repository

import com.bignerdranch.android.juniormathematic.domain.entity.GameSettings
import com.bignerdranch.android.juniormathematic.domain.entity.Level
import com.bignerdranch.android.juniormathematic.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}