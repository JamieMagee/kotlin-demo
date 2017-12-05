fun main(args: Array<String>) {
    val max = 3.maximum(4) // 4

    val max2 = 3 maximum2 4 // 4
}

fun Int.maximum(other: Int) = if (this > other) this else other

infix fun Int.maximum2(other: Int) = if (this > other) this else other