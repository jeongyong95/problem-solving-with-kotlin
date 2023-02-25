package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val tokens = StringTokenizer(bufferedReader.readLine())
    val a = tokens.nextToken().toInt()
    val b = tokens.nextToken().toInt()
    val c = tokens.nextToken().toInt()

    println((a + b) % c)
    println((a + b) % c % c)
    println(a * b % c)
    println((a * b) % c % c)
}