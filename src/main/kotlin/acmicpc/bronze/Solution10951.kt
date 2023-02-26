package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = bufferedReader.readLine()
        if (input.isNullOrBlank()) break
        val tokens = StringTokenizer(input)
        println("${tokens.nextToken().toInt() + tokens.nextToken().toInt()}")
    }
}