package com.bignerdranch.android.juniormathematic.domain.usecases

import com.bignerdranch.android.juniormathematic.domain.entity.GameSettings
import com.bignerdranch.android.juniormathematic.domain.entity.Level
import com.bignerdranch.android.juniormathematic.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}