package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(arr.sum() * 100.0 / arr.max() / n)
}