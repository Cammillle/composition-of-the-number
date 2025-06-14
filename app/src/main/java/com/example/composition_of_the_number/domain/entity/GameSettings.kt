package com.example.composition_of_the_number.domain.entity

data class GameSettings (
    val maxSumValue:Int,
    val minCountOfRightAnswers:Int,
    val minPercentOfRightAnswers:Int,
    val gameTimeInSeconds:Int
)