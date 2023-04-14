package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val word = readLine()
    val index = readLine().toInt() - 1
    println(word[index])
}