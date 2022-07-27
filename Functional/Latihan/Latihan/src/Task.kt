fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    print("First letter is $firstChar and $lastChar for second letter\n")
}

// TODO 1
fun String.getFirstAndLast(): Map<String, Char>{
    return mapOf(
            "first" to this.first(),
            "last" to this.last()
    )
}