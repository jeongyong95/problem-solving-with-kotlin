package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val x = bufferedReader.readLine()
        .toInt()
    val y = bufferedReader.readLine()
        .toInt()

    when {
        x > 0 -> if (y > 0) println(1) else println(4)
        else -> if (y > 0) println(2) else println(3)
    }
}