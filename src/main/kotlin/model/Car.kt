package model

import kotlin.random.Random

class Car(val name: String) {
    var position = 0
        private set

    fun move() {
        if (Random.nextInt(10) >= 4) position++
    }
}