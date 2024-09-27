fun main() {
    print("введите время в часах (0-23): ")
    val chas = readLine()!!.toInt()

    val vremyaSutok = when (chas) {
        in 6..11 -> "утро"
        in 12..17 -> "день"
        in 18..23 -> "вечер"
        in 0..5 -> "ноч, бетмен выходит на защиту"
        else -> "неверное время"
    }

    println("время суток: $vremyaSutok")
}
