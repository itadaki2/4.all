fun main() {
    print("Введите тип пищи (мясо, рыба, овощи): ")
    val tipPishi = readLine()!!.lowercase()

    val vremya = when (tipPishi) {
        "мясо" -> 40
        "рыба" -> 20
        "овощи" -> 15
        else -> {
            println("Неизвестная пища")
            return // выходим из функции, если тип пищи не определен
        }
    }

    println("Примерное время приготовления: $vremya минут")
}
