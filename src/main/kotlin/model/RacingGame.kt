package model

class RacingGame(val cars: List<Car>) {
    fun runOnce() {
        cars.forEach { it.move() }
    }

    fun getWinners(): List<String> {
        val max = cars.maxOf { it.position }
        return cars.filter { it.position == max }.map { it.name }
    }
}