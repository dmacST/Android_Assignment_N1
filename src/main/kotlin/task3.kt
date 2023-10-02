class task3 {
    fun getPrimeDivisors(n: Int): List<Int> {
        val primeDivisors = mutableListOf<Int>()
        var num = n
        var divisor = 2

        while (num > 1 && divisor <= num) {
            if (num % divisor == 0) {
                primeDivisors.add(divisor)
                while (num % divisor == 0) {
                    num /= divisor
                }
            }
            divisor++
        }

        return primeDivisors
    }

    fun main() {
        println("input n:")
        val n = readln()
        val primeDivisors = getPrimeDivisors(n.toInt())

        if (primeDivisors.isNotEmpty()) {
            println(primeDivisors)
        } else {
            println("$n has no prime divisors.")
        }
    }
}