import controller.RacingController
import view.UserInputView
import view.RacingResultView

fun main() {

    val inputView = UserInputView()
    val carNames = inputView.readCarNames()
    val moveTryCount = inputView.readMoveTryCount()

    val resultView = RacingResultView()
    val controller = RacingController(resultView)
    controller.start(carNames, moveTryCount)
}
