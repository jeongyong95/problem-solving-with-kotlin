package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val stage = bufferedReader.readLine().toInt()
    for (i in 1..9) println("$stage * $i = ${stage * i}")
}