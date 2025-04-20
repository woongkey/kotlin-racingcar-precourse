package view

class UserInputView {
    fun readCarNames(): List<String> {
        while (true) {
            println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
            val input = readLine()
            try {
                if (input.isNullOrBlank()) throw IllegalArgumentException("[ERROR] 이름을 입력해주세요.")
                val names = input.split(",").map { it.trim() }
                if (names.any { it.isEmpty() || it.length > 5 }) {
                    throw IllegalArgumentException("[ERROR] 자동차 이름은 1~5자 사이여야 합니다.")
                }
                return names
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }
}