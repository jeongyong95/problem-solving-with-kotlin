package acmicpc.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val word = readLine().uppercase().toCharArray()
    val arr = IntArray('Z'.code + 1) { 0 }
    var max = 0

    for (c in word) {
        arr[c.code]++
        max = max.coerceAtLeast(arr[c.code])
    }

    if (arr.count { it == max } > 1) println("?")
    else println(arr.indexOfFirst { it == max }.toChar())
}