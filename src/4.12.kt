fun main() {
    print("введите страну (байден, раша, япония): ")
    val strana = readLine()!!.lowercase()

    when (strana) {
        "байден" -> println("национальность: пендос")
        "наш слоняра" -> println("национальность: наш слоняра")
        "япония" -> println("национальность: японец")
        else -> println("неизвестная страна")
    }
}