package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val map = bufferedReader.readLine().splitToSequence(" ")
        .map { it.toInt() }
        .groupingBy { it }
        .eachCount()

    when (map.size) {
        1 -> println(map.keys.first() * 1_000 + 10_000)
        2 -> println(map.entries.filter { entry -> entry.value == 2 }
            .map { entry -> entry.key }.first() * 100 + 1_000)

        else -> println(map.keys.max() * 100)
    }
}