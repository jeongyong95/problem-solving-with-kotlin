package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    for (i in 1..bufferedReader.readLine().toInt()) {
        val tokens = StringTokenizer(bufferedReader.readLine())
        val a = tokens.nextToken()
        val b = tokens.nextToken()

        println(
            "Case #$i: $a + $b = ${a.toInt() + b.toInt()}"
        )
    }
}