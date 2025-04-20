import controller.RacingController
import view.UserInputView

fun main() {

    val inputView = UserInputView()
    val carNames = inputView.readCarNames()
    val moveTryCount = inputView.readMoveTryCount()

    val controller = RacingController()
    controller.start(carNames, moveTryCount)
}
