fun main() {
    print("введите оценку (от 0 до 5): ")
    val ocenka = readLine()!!.toInt()

    val rezultat = when (ocenka) {
        5 -> "отлично super"
        4 -> "хорошо good"
        3 -> "удовлетворительно 50/50"
        2 -> "неудовлетворительно baddd"
        1 -> "Очень плохо dislike"
        0 -> "ПОЗОР! fuuuuu"
        else -> "Неверная оценка"
    }

    println("Оценка: $rezultat")
}
