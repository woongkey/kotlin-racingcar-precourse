package controller

import model.Car
import model.RacingGame

class RacingController() {
    fun start(carNames: List<String>, moveTryCount: Int) {
        val race = RacingGame(carNames.map { Car(it) })

        repeat(moveTryCount) {
            race.runOnce()
        }

    }
}