package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val tokens = StringTokenizer(readLine())
    val n = tokens.nextToken().toInt()
    val m = tokens.nextToken().toInt()

    val arr = Array(n) { i -> i + 1 }
    for (stage in 1..m) {
        val tokenizer = StringTokenizer(readLine())
        val i = tokenizer.nextToken().toInt() - 1
        val j = tokenizer.nextToken().toInt() - 1

        arr[i] = arr[j].also { arr[j] = arr[i] }
    }

    println(arr.joinToString(" "))
}