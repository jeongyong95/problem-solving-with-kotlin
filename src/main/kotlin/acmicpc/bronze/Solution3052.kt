package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val set = mutableSetOf<Int>()
    for (i in 1..10) {
        set += bufferedReader.readLine().toInt() % 42
    }
    println(set.size)
}