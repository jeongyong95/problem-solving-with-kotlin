package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var length = bufferedReader.readLine().toInt() / 4
    var result = ""
    while (length-- > 0) {
        result = result.plus("long ")
    }
    result = result.plus("int")
    println(result)
}