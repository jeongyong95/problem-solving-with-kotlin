package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val tokenizer = StringTokenizer(bufferedReader.readLine())
    var result = 0
    for (i in tokenizer.iterator())
        result += i.toString().toInt()
    println(result)
}