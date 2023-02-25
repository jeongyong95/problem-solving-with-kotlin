package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val tokens = StringTokenizer(bufferedReader.readLine())
    println(tokens.nextToken().toInt() - tokens.nextToken().toInt())
}