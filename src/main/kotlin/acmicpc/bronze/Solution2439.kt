package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val t = bufferedReader.readLine().toInt()
    for (i in 1..t) println("${" ".repeat(t - i)}${"*".repeat(i)}")
}