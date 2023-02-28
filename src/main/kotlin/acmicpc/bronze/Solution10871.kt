package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val tokens = StringTokenizer(bufferedReader.readLine())
    tokens.nextToken().toInt()
    val x = tokens.nextToken().toInt()

    val result = bufferedReader.readLine()
        .splitToSequence(" ")
        .map { it.toInt() }
        .filter { it < x }
        .joinToString(" ")
    println(result)
}