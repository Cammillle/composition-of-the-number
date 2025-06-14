package com.example.composition_of_the_number.domain.entity

data class GameResult (
    val winner:Boolean,
    val countOfRightAnswers:Int,
    val countOfQuestions:Int,
    val gameSettings: GameSettings
)