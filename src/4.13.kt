fun main() {
    print("введите код ошибки (100, 200, 300): ")
    val kodOshibki = readLine()!!.toInt()

    when (kodOshibki) {
        100 -> println("ошибка сети")
        200 -> println("ошибка сервера")
        300 -> println("ошибка доступа")
        else -> println("неизвестный код ошибки")
    }
}
