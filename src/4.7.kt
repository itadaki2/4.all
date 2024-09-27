fun main() {
    print("введите строку: ")
    val stroka = readLine()!!

    val dlinna = when {
        stroka.isEmpty() -> 0 // если строка пустая - длина 0
        else -> stroka.length // иначе - длина строки
    }

    println("длина строки: $dlinna") // выводим результат
}
