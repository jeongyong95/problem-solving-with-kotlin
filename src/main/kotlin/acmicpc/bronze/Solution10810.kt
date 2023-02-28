package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val tokens = StringTokenizer(readLine())
    val n = tokens.nextToken().toInt()
    val m = tokens.nextToken().toInt()

    val arr = Array(n) { 0 }
    for (stage in 0 until m) {
        val tokenizer = StringTokenizer(readLine())
        val i = tokenizer.nextToken().toInt()
        val j = tokenizer.nextToken().toInt()
        val k = tokenizer.nextToken().toInt()
        for (index in i - 1 until j) {
            arr[index] = k
        }
    }

    println(arr.joinToString(" "))
}