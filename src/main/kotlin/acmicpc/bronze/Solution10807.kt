package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    bufferedReader.readLine()

    val arr = bufferedReader.readLine().splitToSequence(" ")
        .map { it.toInt() }
        .toList()
    val v = bufferedReader.readLine().toInt()
    
    println(arr.count { it == v })
}