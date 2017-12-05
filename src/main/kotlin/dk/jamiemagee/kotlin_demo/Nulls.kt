fun main(args: Array<String>) {

    // Non-null types by default
    val a: String = "Cannot be null"

    // Nullable type '?'
    val b: String? = null

    // Unwrapping nullables

    b?.equals("Other string") // Safe

    b!!.equals("Other String") // Unsafe

    // Chaining nullables
    b?.toDoubleOrNull()?.compareTo(1)

    // Elvis operator
    val result = b?.toDoubleOrNull()?.equals(1) ?: false
}