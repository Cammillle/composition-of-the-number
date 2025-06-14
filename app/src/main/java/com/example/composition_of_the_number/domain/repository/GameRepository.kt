package com.example.composition_of_the_number.domain.repository

import com.example.composition_of_the_number.domain.entity.GameSettings
import com.example.composition_of_the_number.domain.entity.Level
import com.example.composition_of_the_number.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}