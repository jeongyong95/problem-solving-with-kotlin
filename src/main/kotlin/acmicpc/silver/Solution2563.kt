package acmicpc.silver

fun main() = with(System.`in`.bufferedReader()) {
    val attached = Array(100) { BooleanArray(100) }
    repeat(readLine().toInt()) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        for (i in x until x + 10) {
            for (j in y until y + 10) {
                attached[i][j] = true
            }
        }
    }

    var result = 0;
    attached.forEach { arr ->
        run {
            result += arr.count { it };
        }
    }

    println(result)
}