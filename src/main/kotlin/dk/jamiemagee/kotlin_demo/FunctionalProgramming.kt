fun main(args: Array<String>) {

    lambdas()

    collections()

    sequences()
}

fun lambdas() {

    val sum: (x: Int, y: Int) -> Int = { x, y -> x + y }

    val sum2: (Int, Int) -> Int = { x, y -> x + y }

    val sum3 = { x: Int, y: Int -> x + y }
}

fun collections() {
    val list = arrayOf(1, 2, 3, 4, 5)

    // Eagerly evaluated
    val result = list.map { it + 2 }
            .filter { value -> value % 2 == 0 }
            .firstOrNull{ it > 5 }

    println(result)
}

fun sequences() {

    val list = arrayOf(1, 2, 3, 4, 5)

    // Lazily evaluated
    val result = list.asSequence()
            .map { it + 2 }
            .filter { value -> value % 2 == 0 }
            .firstOrNull{ it > 5 }

    println(result)
}