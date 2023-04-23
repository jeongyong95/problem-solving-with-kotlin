package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val nums = Array(9) { IntArray(9) }
    repeat(9) { index ->
        nums[index] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    var max = nums[0][0]
    var i = 1;
    var j = 1;

    nums.forEachIndexed { index: Int, ints: IntArray ->
        run {
            val maxIndex = ints.indices.maxBy { ints[it] }
            if (max < ints[maxIndex]) {
                max = ints[maxIndex]
                i = index + 1;
                j = maxIndex + 1;
            }
        }
    }

    println(max)
    println("$i $j")
}