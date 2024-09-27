fun main() {
    val chislo1 = (1..100).random() // генерируем случайное чис
    var popast = false // угадал ли игрок число

    println("угадай число от 1 до 100")
    while (!popast) { // цикл продолжается, пока игрок не угадает
        print("введите число: ")
        val vvod = readLine()!!.toInt()

        when {
            vvod > chislo1 -> println("меньше")
            vvod < chislo1 -> println("больше")
            else -> {
                println("угадал")
                popast = true
            }
        }
    }
}
