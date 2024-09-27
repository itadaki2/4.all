fun main() {
    print("Введите способ оплаты (наличные, кредитная карта, PayPal): ")
    val sposobOplaty = readLine()!!.lowercase()

    when (sposobOplaty) {
        "наличные" -> println("Оплата наличными")
        "кредитная карта" -> println("Оплата кредитной картой")
        "paypal" -> println("Оплата через PayPal")
        else -> println("Неизвестный способ")
    }
}
