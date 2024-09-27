fun main() {
    print("введите группу крови (A, B, AB, O): ")
    val gruppaKrovi = readLine()!!.uppercase() // читаем и вверх

    when (gruppaKrovi) {
        "A" -> println("можно переливать: A, O")
        "B" -> println("можно переливать: B, O")
        "AB" -> println("можно переливать: A, B, AB, O")
        "O" -> println("можно переливать: O")
        else -> println("неизвестная кровяка")
    }
}
