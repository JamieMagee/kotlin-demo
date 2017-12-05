fun main(args: Array<String>) {

    val value: Any? = 3

    println(checkResult(value)) // value is 3
}

fun checkResult(value: Any?) = when {
    value == 3 -> "value is 3"
    value is Int -> "double the value = ${value * 2}"
    value == "Hello, world!" -> "Hello, MSE!"
    else -> "No value"
}

// Concise 'when'
fun checkResult2(value: Any?) = when (value) {
    3 -> "value is 3"
    is Int -> "double the value = ${value * 2}"
    "Hello, world!" -> "Hello, MSE!"
    else -> "No value"

}
