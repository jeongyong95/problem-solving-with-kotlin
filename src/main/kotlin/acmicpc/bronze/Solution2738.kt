package acmicpc.bronze

import java.util.StringJoiner

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    val a = Array(n) { IntArray(m) }
    repeat(n) { index -> a[index] = readLine().split(" ").map { it.toInt() }.toIntArray() }

    val b = Array(n) { IntArray(m) }
    repeat(n) { index -> b[index] = readLine().split(" ").map { it.toInt() }.toIntArray() }

    a.forEachIndexed { i, arr ->
        run {
            val joiner = StringJoiner(" ")
            arr.forEachIndexed { j, num ->
                joiner.add((num + b[i][j]).toString())
            }
            println(joiner.toString())
        }
    }
}