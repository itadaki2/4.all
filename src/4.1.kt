fun main() {
    print("введите номер дня недели (1-7): ")
    val nomerdnya = readLine()!!.toInt()

    val dennedeli = when (nomerdnya) {
        1 -> "понедельник"
        2 -> "вторник"
        3 -> "среда"
        4 -> "четверг"
        5 -> "пятница"
        6 -> "суббота"
        7 -> "воскресенье"
        else -> "неверный номер дня"
    }

    println("День недели: $dennedeli")
}
