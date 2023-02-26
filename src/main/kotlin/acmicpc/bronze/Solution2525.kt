package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalTime
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val tokens = StringTokenizer(bufferedReader.readLine())
    val startedAt = LocalTime.of(tokens.nextToken().toInt(), tokens.nextToken().toInt())
    val endTime = startedAt.plusMinutes(bufferedReader.readLine().toLong())
    println("${endTime.hour} ${endTime.minute}")
}