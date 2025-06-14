package com.example.composition_of_the_number.domain.usecase

import com.example.composition_of_the_number.domain.entity.GameSettings
import com.example.composition_of_the_number.domain.entity.Level
import com.example.composition_of_the_number.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}