package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val n = bufferedReader.readLine().toInt()
    for (i in 1..n) println("*".repeat(i))
}