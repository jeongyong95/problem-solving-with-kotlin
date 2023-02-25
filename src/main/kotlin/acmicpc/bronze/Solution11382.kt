package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val tokens = StringTokenizer(bufferedReader.readLine())

    var sum = tokens.nextToken().toLong()
    sum = sum.plus(tokens.nextToken().toLong())
    println(sum.plus(tokens.nextToken().toLong()))
}