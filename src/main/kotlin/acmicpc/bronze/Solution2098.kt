package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ")
        .map { it.reversed().toInt() }
    println(if (a > b) a else b)
}