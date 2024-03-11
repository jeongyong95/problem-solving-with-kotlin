package leetcode

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
class Solution {
    companion object {
        val multiNums =
            mapOf("CD" to 400, "CM" to 900, "XL" to 40, "XC" to 90, "IV" to 4, "IX" to 9)
        val singleNums =
            mapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1_000)
    }

    fun romanToInt(s: String): Int {
        var result = 0
        var number = s.substring(0)

        while (number.isNotBlank()) {
            // 결합 숫자를 먼저 찾는다.
            if (number.length > 1) {
                val startWith = number.take(2)
                if (multiNums.containsKey(startWith)) {
                    result += multiNums.getValue(startWith)
                    number.removePrefix(startWith)
                        .also { number = it }
                    continue
                }
            }

            // 일반 숫자를 찾는다.
            val startWith = number.take(1)
            result += singleNums.getValue(startWith)
            number.removePrefix(startWith)
                .also { number = it }
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    println(solution.romanToInt("MCMXCIV"))
}
