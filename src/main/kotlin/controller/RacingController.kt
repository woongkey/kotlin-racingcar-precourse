package controller

import model.Car
import model.RacingGame
import view.RacingResultView

class RacingController(
    private val resultView: RacingResultView = RacingResultView()
) {
    fun start(carNames: List<String>, moveTryCount: Int) {
        val race = RacingGame(carNames.map { Car(it) })

        resultView.printStart()

        repeat(moveTryCount) {
            race.runOnce()
            resultView.printRound(race.cars)
        }

        resultView.printWinners(race.getWinners())
    }
}