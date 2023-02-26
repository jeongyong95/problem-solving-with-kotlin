package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val num = bufferedReader.readLine()
        .toInt()

    println(num * (1 + num) / 2)
}