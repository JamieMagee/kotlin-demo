fun main(args: Array<String>) {
    var max = maximum(1, 2)

    // Named parameters
    max = maximum(first = 1, second = 2)

    max = maximum(second = 2, first = 1)

    max = maximum3(second = 8)
}

fun maximum(first: Int, second: Int): Int {
    if (first > second) {
        return first
    } else {
        return second
    }
}

// If is an expression
fun maximum2(first: Int, second: Int): Int {
    return if (first > second) {
        first
    } else {
        second
    }
}

// Default values
fun maximum3(first: Int = 3, second: Int = 4): Int {
    return if (first > second) {
        first
    } else {
        second
    }
}

// Concise
fun maximum4(first: Int, second: Int): Int =
        if (first > second) {
            first
        } else {
            second
        }

// Concise-er
fun maximum5(first: Int, second: Int) =
        if (first > second) {
            first
        } else {
            second
        }

// Concise-est
fun maximum6(first: Int, second: Int) = if (first > second) first else second