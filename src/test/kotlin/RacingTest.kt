
import model.Car
import model.RacingGame
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class RacingTest {

    private lateinit var cars: List<Car>

    @BeforeEach
    fun setup() {
        cars = listOf(
            Car("pobi"),
            Car("woni"),
            Car("jun")
        )
    }

    @Test
    fun `초기 자동차 위치는 0이다`() {
        val race = RacingGame(cars)
        assertThat(race.cars.map { it.position }).allMatch { it == 0 }
    }

    @RepeatedTest(100)
    fun `자동차가 후진하지 않는지 확인`() {
        val race = RacingGame(cars)

        race.runOnce()

        race.cars.forEach {
            assertThat(it.position).isBetween(0, 1)
        }
    }

    @Test
    fun `getWinners는 가장 멀리 간 자동차의 이름을 반환한다`() {
        val game = RacingGame(cars)

        repeat(30) { game.runOnce() }

        val max = game.cars.maxOf { it.position }
        val winners = game.getWinners()

        val winnerCars = game.cars.filter { it.name in winners }
        assertThat(winnerCars).allMatch { it.position == max }
    }
}