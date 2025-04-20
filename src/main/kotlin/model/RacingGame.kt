package model

class RacingGame(val cars: List<Car>) {
    fun runOnce() {
        cars.forEach { it.move() }
    }
}