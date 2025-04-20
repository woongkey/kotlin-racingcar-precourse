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
}