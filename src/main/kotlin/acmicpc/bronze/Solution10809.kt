package acmicpc.bronze

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().toCharArray()
    var joiner = StringJoiner(" ")
    for (c in 'a'..'z') {
        joiner.add(arr.indexOfFirst { it == c }.toString())
    }
    println(joiner.toString())
}