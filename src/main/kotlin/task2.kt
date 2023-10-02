class task2 {
    fun subtractDigitsToMaximizeNumber(number: Long, k: Int): Long {
        if (k >= number.toString().length) {
            return 0
        }

        val numberStr = number.toString()
        val result = StringBuilder()
        var remainingK = k

        for (digit in numberStr) {
            while (remainingK > 0 && result.isNotEmpty() && digit > result.last()) {
                result.deleteCharAt(result.length - 1)
                remainingK--
            }
            result.append(digit)
        }

        while (remainingK > 0) {
            result.deleteCharAt(result.length - 1)
            remainingK--
        }

        return result.toString().toLong()
    }

    fun main() {
        println("input large number:")
        val number = readln()
        val k = 3

        val result = subtractDigitsToMaximizeNumber(number.toLong(), k)
        println(result)
    }
}