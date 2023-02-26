package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var t = bufferedReader.readLine().toInt()
    while (t-- > 0) {
        val tokens = StringTokenizer(bufferedReader.readLine())
        println(tokens.nextToken().toInt() + tokens.nextToken().toInt())
    }
}