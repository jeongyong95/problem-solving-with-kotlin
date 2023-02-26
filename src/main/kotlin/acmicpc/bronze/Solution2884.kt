package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalTime
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val tokens = StringTokenizer(bufferedReader.readLine())
    val converted = LocalTime.of(
        tokens.nextToken()
            .toInt(), tokens.nextToken()
            .toInt()
    ).minusMinutes(45L)

    println("${converted.hour} ${converted.minute}")
}