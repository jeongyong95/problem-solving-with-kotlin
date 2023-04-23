package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val chars = Array(5) { CharArray(15) }
    repeat(5) { index ->
        chars[index] = readLine().toCharArray()
    }

    val builder = StringBuilder()
    for (j in 0 until 15) {
        for (i in 0 until 5) {
            if (j >= chars[i].size) {
            } else {
                builder.append(chars[i][j])
            }
        }
    }
    println(builder.toString())
}