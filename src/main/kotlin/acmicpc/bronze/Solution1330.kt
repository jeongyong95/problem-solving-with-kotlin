package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val tokens = StringTokenizer(bufferedReader.readLine())
    val a = tokens.nextToken().toInt()
    val b = tokens.nextToken().toInt()

    println(
        when {
            a > b -> ">"
            a < b -> "<"
            else -> "=="
        }
    )
}