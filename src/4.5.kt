fun main() {
    print("Введите число: ")
    val chislo1 = readLine()!!.toInt() // читаем число с консоли и преобразуем в Int

    when {
        chislo1 > 0 -> println("Число положительное")
        chislo1 < 0 -> println("Число отрицательное")
        else -> println("Число равно нулю")
    }
}
