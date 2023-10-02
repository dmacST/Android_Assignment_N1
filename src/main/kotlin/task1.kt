class task1 {
    fun palindrome(number: Int): Boolean {
    val numberStr = number.toString()
    return numberStr == numberStr.reversed()
}

fun palindromeSquared(n: Int, m: Int): List<Int> {
    val palindromeSquares = mutableListOf<Int>()

    for (num in n..m) {
        if (palindrome(num)) {
            val square = num.toLong() * num.toLong()
            if (palindrome(square.toInt())) {
                palindromeSquares.add(num)
            }
        }
    }

    return palindromeSquares
}

    fun main() {
        println("Input n:")
        val n = readln()
        println("Input m:")
        val m = readln()
        val palindromeSquares = palindromeSquared(n.toInt(), m.toInt())

        println(palindromeSquares)
    }

}