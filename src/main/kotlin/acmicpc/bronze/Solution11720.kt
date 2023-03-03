package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt();
    var sum = -n * 48
    repeat(n) {
        sum += read()
    }
    println(sum)
}