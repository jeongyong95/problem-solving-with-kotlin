package acmicpc.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val t = bufferedReader.readLine().toInt()

    for (i in 1..t) {
        val tokens = StringTokenizer(bufferedReader.readLine())
        println(
            "Case #$i: ${tokens.nextToken().toInt() + tokens.nextToken().toInt()}"
        )
    }
}