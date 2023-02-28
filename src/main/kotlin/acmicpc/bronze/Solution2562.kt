package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    for (i in 1..9) {
        list += readLine().toInt()
    }

    val max = list.max()
    println(max)
    println(list.indexOf(max) + 1)
}