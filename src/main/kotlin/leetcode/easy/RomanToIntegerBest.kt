package leetcode.easy

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 */
fun Char.romanToInteger(): Int = when (this) {
    'I' -> 1
    'V' -> 5
    'X' -> 10
    'L' -> 50
    'C' -> 100
    'D' -> 500
    'M' -> 1_000
    else -> 0
}

class BestSolution {
    fun romanToInt(s: String): Int {
        if (s.length == 1) return s[0].romanToInteger()
        var previousIndex = 0
        var result = 0

        s.forEachIndexed { index, c ->
            val current = c.romanToInteger()
            if (index == 0) {
                result += current
                return@forEachIndexed
            }

            val previous = s[previousIndex].romanToInteger()
            if (current > previous) {
                result += current - 2 * previous
            } else {
                result += current
            }
            previousIndex = index
        }

        return result
    }
}

fun main() {
    val solution = BestSolution()
    println(solution.romanToInt("MCMXCIV"))
}