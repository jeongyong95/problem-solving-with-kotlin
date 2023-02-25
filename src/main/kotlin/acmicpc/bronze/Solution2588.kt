package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val a = bufferedReader.readLine().toInt()
    val b = bufferedReader.readLine().toInt()

    var c = b
    while (c > 0) {
        println(a * (c % 10))
        c /= 10
    }
    println(a * b)
}