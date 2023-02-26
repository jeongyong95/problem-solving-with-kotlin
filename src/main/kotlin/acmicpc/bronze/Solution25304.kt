package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    var totalPrice = bufferedReader.readLine()
        .toInt()
    var n = bufferedReader.readLine()
        .toInt()

    while (n-- > 0) {
        val tokens = StringTokenizer(bufferedReader.readLine())
        totalPrice -= tokens.nextToken().toInt() * tokens.nextToken().toInt()
    }

    when (totalPrice) {
        0 -> println("Yes")
        else -> println("No")
    }
}