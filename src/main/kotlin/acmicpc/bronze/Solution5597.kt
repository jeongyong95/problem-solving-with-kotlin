package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val set = IntRange(1, 30)
        .asIterable()
        .toMutableSet()

    for (i in 1..28) {
        set.remove(readLine().toInt())
    }

    set.forEach(::println)
}