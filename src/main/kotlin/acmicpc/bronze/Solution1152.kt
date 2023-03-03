package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val word = readLine().trim()
    when (word.length) {
        0 -> println(0)
        else -> println(word.split(" ").count())
    }
}