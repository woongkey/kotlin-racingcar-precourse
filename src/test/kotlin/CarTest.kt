import model.Car
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class CarTest {

    @RepeatedTest(100)
    fun `move 호출 후 position은 0 이상 1 이하이다`() {
        val car = Car("pobi")

        car.move()

        assertThat(car.position).isBetween(0, 1)
    }

    @Test
    fun `getProgress는 position 수 만큼 - 문자열을 반환한다`() {
        val car = Car("pobi")

        repeat(30) { car.move() }

        val progress = car.getProgress()

        assertThat(progress.length).isEqualTo(car.position)
        assertThat(progress).matches("[-]*")
    }
}