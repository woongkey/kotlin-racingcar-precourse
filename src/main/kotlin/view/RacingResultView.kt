package view

import model.Car

class RacingResultView {
    fun printStart() {
        println("\n실행 결과")
    }

    fun printRound(cars: List<Car>) {
        cars.forEach {
            println("${it.name} : ${it.getProgress()}")
        }
        println()
    }

    fun printWinners(winners: List<String>) {
        println("최종 우승자 : ${winners.joinToString(", ")}")
    }
}